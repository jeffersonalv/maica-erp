package com.t2tierp.patrimonio.cliente;

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
* <p>Description: Classe de controle da tela PatrimTaxaDepreciacaoDetalhe.</p>
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
public class PatrimTaxaDepreciacaoDetalheController extends FormController {

    private PatrimTaxaDepreciacaoDetalhe patrimTaxaDepreciacaoDetalhe = null;
    private String pk = null;
    private PatrimTaxaDepreciacaoGrid patrimTaxaDepreciacaoGrid = null;
    private String acaoServidor;

    public PatrimTaxaDepreciacaoDetalheController(PatrimTaxaDepreciacaoGrid patrimTaxaDepreciacaoGrid, String pk) {
        this.patrimTaxaDepreciacaoGrid = patrimTaxaDepreciacaoGrid;
        this.pk = pk;
        this.acaoServidor = "patrimTaxaDepreciacaoDetalheAction";
        patrimTaxaDepreciacaoDetalhe = new PatrimTaxaDepreciacaoDetalhe(this);
        patrimTaxaDepreciacaoDetalhe.setParentFrame(this.patrimTaxaDepreciacaoGrid);
        this.patrimTaxaDepreciacaoGrid.pushFrame(patrimTaxaDepreciacaoDetalhe);
        MDIFrame.add(patrimTaxaDepreciacaoDetalhe);

        if (pk != null) {
            patrimTaxaDepreciacaoDetalhe.getForm1().setMode(Consts.READONLY);
            patrimTaxaDepreciacaoDetalhe.getForm1().reload();
        } else {
            patrimTaxaDepreciacaoDetalhe.getForm1().setMode(Consts.INSERT);
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject});
    }

    @Override
    public void afterInsertData() {
        patrimTaxaDepreciacaoGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(patrimTaxaDepreciacaoDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject});
    }

    @Override
    public void afterEditData() {
        patrimTaxaDepreciacaoGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(patrimTaxaDepreciacaoDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}
