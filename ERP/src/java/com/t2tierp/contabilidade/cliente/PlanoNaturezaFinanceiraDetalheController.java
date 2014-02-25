package com.t2tierp.contabilidade.cliente;

import com.erp.cadastros.java.vo.EmpresaVO;
import com.erp.padrao.cliente.Container;
import com.erp.padrao.constantes.Constantes;
import com.t2tierp.contabilidade.java.PlanoNaturezaFinanceiraVO;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Classe de controle da tela PlanoNaturezaFinanceiraDetalhe.</p>
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
public class PlanoNaturezaFinanceiraDetalheController extends FormController {

    private PlanoNaturezaFinanceiraDetalhe planoNaturezaFinanceiraDetalhe = null;
    private String pk = null;
    private PlanoNaturezaFinanceiraGrid planoNaturezaFinanceiraGrid = null;
    private String acaoServidor;

    public PlanoNaturezaFinanceiraDetalheController(PlanoNaturezaFinanceiraGrid planoNaturezaFinanceiraGrid, String pk) {
        this.planoNaturezaFinanceiraGrid = planoNaturezaFinanceiraGrid;
        this.pk = pk;
        this.acaoServidor = "planoNaturezaFinanceiraDetalheAction";
        planoNaturezaFinanceiraDetalhe = new PlanoNaturezaFinanceiraDetalhe(this);
        planoNaturezaFinanceiraDetalhe.setParentFrame(this.planoNaturezaFinanceiraGrid);
        this.planoNaturezaFinanceiraGrid.pushFrame(planoNaturezaFinanceiraDetalhe);
        MDIFrame.add(planoNaturezaFinanceiraDetalhe);

        if (pk != null) {
            planoNaturezaFinanceiraDetalhe.getForm1().setMode(Consts.READONLY);
            planoNaturezaFinanceiraDetalhe.getForm1().reload();
        } else {
            planoNaturezaFinanceiraDetalhe.getForm1().setMode(Consts.INSERT);
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        EmpresaVO empresa = (EmpresaVO) Container.getContainer().get("empresa");
        ((PlanoNaturezaFinanceiraVO) newPersistentObject).setEmpresa(empresa);

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject});
    }

    @Override
    public void afterInsertData() {
        planoNaturezaFinanceiraGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(planoNaturezaFinanceiraDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject});
    }

    @Override
    public void afterEditData() {
        planoNaturezaFinanceiraGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(planoNaturezaFinanceiraDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}
