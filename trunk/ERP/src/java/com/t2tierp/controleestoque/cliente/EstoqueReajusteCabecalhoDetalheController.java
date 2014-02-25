package com.t2tierp.controleestoque.cliente;

import com.erp.cadastros.java.vo.ProdutoVO;
import com.erp.padrao.constantes.Constantes;
import com.t2tierp.controleestoque.java.EstoqueReajusteCabecalhoVO;
import com.t2tierp.controleestoque.java.EstoqueReajusteDetalheVO;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela EstoqueReajusteCabecalhoDetalhe.</p>
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
public class EstoqueReajusteCabecalhoDetalheController extends FormController {

    private EstoqueReajusteCabecalhoDetalhe estoqueReajusteCabecalhoDetalhe = null;
    private String pk = null;
    private EstoqueReajusteCabecalhoGrid estoqueReajusteCabecalhoGrid = null;
    private String acaoServidor;

    public EstoqueReajusteCabecalhoDetalheController(EstoqueReajusteCabecalhoGrid estoqueReajusteCabecalhoGrid, String pk) {
        this.estoqueReajusteCabecalhoGrid = estoqueReajusteCabecalhoGrid;
        this.pk = pk;
        this.acaoServidor = "estoqueReajusteCabecalhoDetalheAction";
        estoqueReajusteCabecalhoDetalhe = new EstoqueReajusteCabecalhoDetalhe(this);
        estoqueReajusteCabecalhoDetalhe.setParentFrame(this.estoqueReajusteCabecalhoGrid);
        this.estoqueReajusteCabecalhoGrid.pushFrame(estoqueReajusteCabecalhoDetalhe);
        MDIFrame.add(estoqueReajusteCabecalhoDetalhe);

        if (pk != null) {
            estoqueReajusteCabecalhoDetalhe.getForm1().setMode(Consts.READONLY);
            estoqueReajusteCabecalhoDetalhe.getForm1().reload();
        } else {
            estoqueReajusteCabecalhoDetalhe.getForm1().setMode(Consts.INSERT);
            estoqueReajusteCabecalhoDetalhe.getGridControl1().reloadData();
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public void loadDataCompleted(boolean error) {
        estoqueReajusteCabecalhoDetalhe.getItensController().setPk(pk);
        estoqueReajusteCabecalhoDetalhe.getGridControl1().reloadData();
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        List<EstoqueReajusteDetalheVO> itensReajuste = estoqueReajusteCabecalhoDetalhe.getGridControl1().getVOListTableModel().getDataVector();

        if (itensReajuste.isEmpty()) {
            return new ErrorResponse("Nenhum produto foi selecionado para reajuste");
        }

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject, itensReajuste});
    }

    @Override
    public void afterInsertData() {
        estoqueReajusteCabecalhoGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Valores reajustados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
        estoqueReajusteCabecalhoDetalhe.dispose();
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        List<EstoqueReajusteDetalheVO> itensReajuste = estoqueReajusteCabecalhoDetalhe.getGridControl1().getVOListTableModel().getDataVector();

        if (itensReajuste.isEmpty()) {
            return new ErrorResponse("Nenhum produto foi selecionado para reajuste");
        }

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject, itensReajuste});
    }

    @Override
    public void afterEditData() {
        estoqueReajusteCabecalhoGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Valores reajustados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
        estoqueReajusteCabecalhoDetalhe.dispose();
    }

    public void buscaGrupoProdutos() {
        EstoqueReajusteCabecalhoVO reajuste = (EstoqueReajusteCabecalhoVO) estoqueReajusteCabecalhoDetalhe.getForm1().getVOModel().getValueObject();
        if (reajuste.getProdutoSubGrupo().getId() != null) {
            Response res = ClientUtils.getData(acaoServidor, new Object[]{99, reajuste.getProdutoSubGrupo()});
            if (res.isError()) {
                JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Ocorreu um erro ao buscar os produtos do sub grupo.\n" + res.getErrorMessage(), "Errro do Sistema", JOptionPane.ERROR_MESSAGE);
                return;
            }
            List<ProdutoVO> produtos = ((VOListResponse) res).getRows();
            EstoqueReajusteDetalheVO itensReajuste;
            for (int i = 0; i < produtos.size(); i++) {
                itensReajuste = new EstoqueReajusteDetalheVO();
                itensReajuste.setProduto(produtos.get(i));
                itensReajuste.setValorOriginal(produtos.get(i).getValorVenda());

                estoqueReajusteCabecalhoDetalhe.getGridControl1().getVOListTableModel().addObject(itensReajuste);
            }
            if (produtos.isEmpty()) {
                JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Nenhum produto encontrado para o grupo selecinado.", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Selecione um grupo.", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void efetuarCalculos() {
        EstoqueReajusteCabecalhoVO reajuste = (EstoqueReajusteCabecalhoVO) estoqueReajusteCabecalhoDetalhe.getForm1().getVOModel().getValueObject();
        if (reajuste.getPorcentagem() == null) {
            JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Informe a porcentagem do reajuste.", "Informação do Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }
        List<EstoqueReajusteDetalheVO> itensReajuste = estoqueReajusteCabecalhoDetalhe.getGridControl1().getVOListTableModel().getDataVector();
        if (itensReajuste.isEmpty()) {
            JOptionPane.showMessageDialog(estoqueReajusteCabecalhoDetalhe, "Nenhum item para calcular.", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        EstoqueReajusteDetalheVO item;
        for (int i = 0; i < itensReajuste.size(); i++) {
            item = itensReajuste.get(i);
            if (item.getValorOriginal() != null) {
                if (reajuste.getTipoReajuste().equals("A")) {
                    item.setValorReajuste(item.getValorOriginal().multiply(BigDecimal.ONE.add(reajuste.getPorcentagem().divide(BigDecimal.valueOf(100), RoundingMode.HALF_DOWN))));
                } else {
                    item.setValorReajuste(item.getValorOriginal().multiply(BigDecimal.ONE.subtract(reajuste.getPorcentagem().divide(BigDecimal.valueOf(100), RoundingMode.HALF_DOWN))));
                }
            }
            estoqueReajusteCabecalhoDetalhe.getGridControl1().getVOListTableModel().updateObjectAt(i);
        }
    }
}
