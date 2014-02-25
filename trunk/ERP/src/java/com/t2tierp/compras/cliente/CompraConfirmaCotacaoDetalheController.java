package com.t2tierp.compras.cliente;

import com.erp.padrao.constantes.Constantes;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela CompraConfirmaCotacaoDetalhe.</p>
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
public class CompraConfirmaCotacaoDetalheController extends FormController {

    private CompraConfirmaCotacaoDetalhe compraConfirmaCotacaoDetalhe = null;
    private String pk = null;
    private CompraConfirmaCotacaoGrid compraConfirmaCotacaoGrid = null;
    private String acaoServidor;

    public CompraConfirmaCotacaoDetalheController(CompraConfirmaCotacaoGrid compraConfirmaCotacaoGrid, String pk) {
        this.compraConfirmaCotacaoGrid = compraConfirmaCotacaoGrid;
        this.pk = pk;
        this.acaoServidor = "compraConfirmaCotacaoDetalheAction";
        compraConfirmaCotacaoDetalhe = new CompraConfirmaCotacaoDetalhe(this);
        compraConfirmaCotacaoDetalhe.setParentFrame(this.compraConfirmaCotacaoGrid);
        this.compraConfirmaCotacaoGrid.pushFrame(compraConfirmaCotacaoDetalhe);
        MDIFrame.add(compraConfirmaCotacaoDetalhe);

        compraConfirmaCotacaoDetalhe.getForm1().setMode(Consts.READONLY);
        compraConfirmaCotacaoDetalhe.getForm1().reload();
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public void loadDataCompleted(boolean error) {
        compraConfirmaCotacaoDetalhe.getFornecedorCotacaoController().setPk(pk);
        compraConfirmaCotacaoDetalhe.getGridFornecedor().reloadData();
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, persistentObject});
    }

    @Override
    public void afterEditData() {
        JOptionPane.showMessageDialog(compraConfirmaCotacaoDetalhe, "Cotação confirmada com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
        compraConfirmaCotacaoGrid.getGrid1().reloadData();
        compraConfirmaCotacaoDetalhe.dispose();
    }

}
