package com.t2tierp.conciliacaocontabil.servidor;

import com.erp.cadastros.java.vo.ClienteVO;
import com.erp.padrao.servidor.HibernateUtil;
import com.t2tierp.financeiro.java.FinParcelaRecebimentoVO;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.server.Action;
import org.openswing.swing.server.UserSessionParameters;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Action ParcelaConciliacaoClienteGrid.</p>
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
public class ParcelaConciliacaoClienteGridAction implements Action {

    public ParcelaConciliacaoClienteGridAction() {
    }

    public String getRequestName() {
        return "parcelaConciliacaoClienteGridAction";
    }

    public Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        GridParams pars = (GridParams) inputPar;
        Date dataInicial = (Date) pars.getOtherGridParams().get("dataInicial");
        Date dataFinal = (Date) pars.getOtherGridParams().get("dataFinal");
        ClienteVO cliente = (ClienteVO) pars.getOtherGridParams().get("cliente");

        try {
            session = HibernateUtil.getSessionFactory().openSession();

            Criteria criteria = session.createCriteria(FinParcelaRecebimentoVO.class);
            criteria.createAlias("finParcelaReceber", "pr", Criteria.LEFT_JOIN);
            criteria.createAlias("pr.finLancamentoReceber", "lr", Criteria.LEFT_JOIN);
            criteria.add(Restrictions.eq("lr.cliente", cliente));
            criteria.add(Restrictions.between("dataRecebimento", dataInicial, dataFinal));

            List<FinParcelaRecebimentoVO> parcelas = criteria.list();

            return new VOListResponse(parcelas, false, parcelas.size());
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
}