package com.t2tierp.vendas.servidor;

import com.erp.padrao.constantes.Constantes;
import com.erp.padrao.servidor.HibernateUtil;
import com.t2tierp.vendas.java.VendaCondicoesPagamentoVO;
import com.t2tierp.vendas.java.VendaCondicoesParcelasVO;
import java.util.List;
import java.util.Vector;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.server.Action;
import org.openswing.swing.server.UserSessionParameters;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Classe que realiza a persistência dos dados de VendaCondicoesPagamentoDetalhe.</p>
*
* <p>The MIT License</p>
*
* <p>Copyright: Copyright (C) 2010 T2Ti.COM
*
* Permission is hereby granted, free of charge, to any person
* obtaining a copy of this software and associated documentation
* files (the "Software"), to deal in the Software without
* restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following
* conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
* HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
* OTHER DEALINGS IN THE SOFTWARE.
*
*        The author may be contacted at:
*            t2ti.com@gmail.com</p>
*
* @author Claudio de Barros (t2ti.com@gmail.com)
* @version 1.0
*/
public class VendaCondicoesPagamentoDetalheAction implements Action {

    public VendaCondicoesPagamentoDetalheAction() {
    }

    public String getRequestName() {
        return "vendaCondicoesPagamentoDetalheAction";
    }

    public Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Object[] pars = (Object[]) inputPar;
        Integer acao = (Integer) pars[0];

        switch (acao) {
            case Constantes.LOAD: {
                return load(inputPar, userSessionPars, request, response, userSession, context);
            }
            case Constantes.INSERT: {
                return insert(inputPar, userSessionPars, request, response, userSession, context);
            }
            case Constantes.UPDATE: {
                return update(inputPar, userSessionPars, request, response, userSession, context);
            }
            case Constantes.DELETE: {
                return delete(inputPar, userSessionPars, request, response, userSession, context);
            }
        }
        return null;
    }

    private Response load(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        Object[] pars = (Object[]) inputPar;
        String pk = (String) pars[1];

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(VendaCondicoesPagamentoVO.class);
            criteria.add(Restrictions.eq("id", Integer.valueOf(pk)));

            VendaCondicoesPagamentoVO vendaCondicoesPagamento = (VendaCondicoesPagamentoVO) criteria.uniqueResult();

            return new VOResponse(vendaCondicoesPagamento);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ErrorResponse(ex.getMessage());
        } finally {
            try {
                session.close();
            } catch (Exception ex1) {
            }
        }
    }

    public Response insert(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        try {
            Object[] pars = (Object[]) inputPar;
            VendaCondicoesPagamentoVO vendaCondicoesPagamento = (VendaCondicoesPagamentoVO) pars[1];
            List<VendaCondicoesParcelasVO> parcelas = (Vector) pars[2];

            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            session.save(vendaCondicoesPagamento);

            for (int i = 0; i < parcelas.size(); i++){
                parcelas.get(i).setVendaCondicoesPagamento(vendaCondicoesPagamento);
                session.save(parcelas.get(i));
            }

            session.getTransaction().commit();

            return new VOResponse(vendaCondicoesPagamento);
        } catch (Exception ex) {
            ex.printStackTrace();
            if (session != null) {
                session.getTransaction().rollback();
            }
            return new ErrorResponse(ex.getMessage());
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }
        }
    }

    public Response update(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        try {
            Object[] pars = (Object[]) inputPar;
            VendaCondicoesPagamentoVO vendaCondicoesPagamento = (VendaCondicoesPagamentoVO) pars[2];
            List<VendaCondicoesParcelasVO> parcelas = (Vector) pars[3];

            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            session.update(vendaCondicoesPagamento);

            String sqlExcluir = "delete from VENDA_CONDICOES_PARCELAS where ID not in (0";
            for (int i = 0; i < parcelas.size(); i++){
                parcelas.get(i).setVendaCondicoesPagamento(vendaCondicoesPagamento);
                session.saveOrUpdate(parcelas.get(i));
                sqlExcluir += "," + parcelas.get(i).getId();
            }
            sqlExcluir += ") and ID_VENDA_CONDICOES_PAGAMENTO = :id";
            Query query = session.createSQLQuery(sqlExcluir);
            query.setInteger("id", vendaCondicoesPagamento.getId());
            query.executeUpdate();

            session.getTransaction().commit();

            return new VOResponse(vendaCondicoesPagamento);
        } catch (Exception ex) {
            ex.printStackTrace();
            if (session != null) {
                session.getTransaction().rollback();
            }
            return new ErrorResponse(ex.getMessage());
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }
        }
    }

    public Response delete(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        return null;
    }

}
