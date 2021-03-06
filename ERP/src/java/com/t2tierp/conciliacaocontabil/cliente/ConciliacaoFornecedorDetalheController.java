package com.t2tierp.conciliacaocontabil.cliente;

import com.erp.cadastros.java.vo.FornecedorVO;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela ConciliacaoFornecedorDetalhe.</p>
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
public class ConciliacaoFornecedorDetalheController extends FormController {

    private ConciliacaoFornecedorDetalhe conciliacaoFornecedorDetalhe = null;
    private ConciliacaoFornecedorGrid conciliacaoFornecedorGrid = null;
    private FornecedorVO fornecedor;

    public ConciliacaoFornecedorDetalheController(ConciliacaoFornecedorGrid conciliacaoClienteGrid, FornecedorVO fornecedor) {
        this.conciliacaoFornecedorGrid = conciliacaoClienteGrid;
        this.fornecedor = fornecedor;
        conciliacaoFornecedorDetalhe = new ConciliacaoFornecedorDetalhe(this);
        conciliacaoFornecedorDetalhe.setParentFrame(this.conciliacaoFornecedorGrid);
        this.conciliacaoFornecedorGrid.pushFrame(conciliacaoFornecedorDetalhe);
        MDIFrame.add(conciliacaoFornecedorDetalhe);

        conciliacaoFornecedorDetalhe.getFormFornecedor().setMode(Consts.READONLY);
        conciliacaoFornecedorDetalhe.getFormFornecedor().reload();
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return new VOResponse(fornecedor);
    }

}
