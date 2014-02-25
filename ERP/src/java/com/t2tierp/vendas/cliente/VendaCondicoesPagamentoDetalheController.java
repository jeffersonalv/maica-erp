package com.t2tierp.vendas.cliente;

import com.erp.cadastros.java.vo.EmpresaVO;
import com.erp.padrao.cliente.Container;
import com.erp.padrao.constantes.Constantes;
import com.t2tierp.vendas.java.VendaCondicoesPagamentoVO;
import com.t2tierp.vendas.java.VendaCondicoesParcelasVO;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela VendaCondicoesPagamentoDetalhe.</p>
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
public class VendaCondicoesPagamentoDetalheController extends FormController {

    private VendaCondicoesPagamentoDetalhe vendaCondicoesPagamentoDetalhe = null;
    private String pk = null;
    private VendaCondicoesPagamentoGrid vendaCondicoesPagamentoGrid = null;
    private String acaoServidor;

    public VendaCondicoesPagamentoDetalheController(VendaCondicoesPagamentoGrid vendaCondicoesPagamentoGrid, String pk) {
        this.vendaCondicoesPagamentoGrid = vendaCondicoesPagamentoGrid;
        this.pk = pk;
        this.acaoServidor = "vendaCondicoesPagamentoDetalheAction";
        vendaCondicoesPagamentoDetalhe = new VendaCondicoesPagamentoDetalhe(this);
        vendaCondicoesPagamentoDetalhe.setParentFrame(this.vendaCondicoesPagamentoGrid);
        this.vendaCondicoesPagamentoGrid.pushFrame(vendaCondicoesPagamentoDetalhe);
        MDIFrame.add(vendaCondicoesPagamentoDetalhe);

        if (pk != null) {
            vendaCondicoesPagamentoDetalhe.getForm1().setMode(Consts.READONLY);
            vendaCondicoesPagamentoDetalhe.getForm1().reload();
        } else {
            vendaCondicoesPagamentoDetalhe.getForm1().setMode(Consts.INSERT);
            vendaCondicoesPagamentoDetalhe.getGridControl1().reloadData();
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public void loadDataCompleted(boolean error) {
        vendaCondicoesPagamentoDetalhe.getCondicoesParcelasGridController().setPk(pk);
        vendaCondicoesPagamentoDetalhe.getGridControl1().reloadData();
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        EmpresaVO empresa = (EmpresaVO) Container.getContainer().get("empresa");
        ((VendaCondicoesPagamentoVO) newPersistentObject).setEmpresa(empresa);

        List<VendaCondicoesParcelasVO> condicoesParcela = vendaCondicoesPagamentoDetalhe.getGridControl1().getVOListTableModel().getDataVector();

        try {
            verificaParcelas(condicoesParcela, (VendaCondicoesPagamentoVO) newPersistentObject);
        } catch (Exception e) {
            return new ErrorResponse(e.getMessage());
        }

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject, condicoesParcela});
    }

    @Override
    public void afterInsertData() {
        vendaCondicoesPagamentoGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(vendaCondicoesPagamentoDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        List<VendaCondicoesParcelasVO> condicoesParcela = vendaCondicoesPagamentoDetalhe.getGridControl1().getVOListTableModel().getDataVector();

        try {
            verificaParcelas(condicoesParcela, (VendaCondicoesPagamentoVO) persistentObject);
        } catch (Exception e) {
            return new ErrorResponse(e.getMessage());
        }

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject, condicoesParcela});
    }

    @Override
    public void afterEditData() {
        vendaCondicoesPagamentoGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(vendaCondicoesPagamentoDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verificaParcelas(List<VendaCondicoesParcelasVO> condicoesParcela, VendaCondicoesPagamentoVO condicoesPagamento) throws Exception {
        double prazoMedio = 0;
        BigDecimal totalPorcento = BigDecimal.ZERO;
        for (int i = 0; i < condicoesParcela.size(); i++) {
            totalPorcento = totalPorcento.add(condicoesParcela.get(i).getTaxa());
            if (i == 0) {
                prazoMedio = condicoesParcela.get(i).getDias();
            } else {
                prazoMedio += (condicoesParcela.get(i).getDias() - condicoesParcela.get(i - 1).getDias());
            }
        }
        if (totalPorcento.compareTo(BigDecimal.valueOf(100)) != 0) {
            throw new Exception("Os valores informados nas taxas não fecham em 100%.");
        }
        prazoMedio = prazoMedio / condicoesParcela.size();
        condicoesPagamento.setPrazoMedio((int) prazoMedio);
    }
}
