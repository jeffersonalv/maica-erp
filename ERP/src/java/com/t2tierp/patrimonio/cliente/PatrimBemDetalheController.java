package com.t2tierp.patrimonio.cliente;

import com.erp.padrao.constantes.Constantes;
import com.t2tierp.patrimonio.java.PatrimDepreciacaoBemVO;
import com.t2tierp.patrimonio.java.PatrimDocumentoBemVO;
import com.t2tierp.patrimonio.java.PatrimMovimentacaoBemVO;
import java.util.List;
import javax.swing.JOptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Classe de controle da tela PatrimBemDetalhe.</p>
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
public class PatrimBemDetalheController extends FormController {

    private PatrimBemDetalhe patrimBemDetalhe = null;
    private String pk = null;
    private PatrimBemGrid patrimBemGrid = null;
    private String acaoServidor;

    public PatrimBemDetalheController(PatrimBemGrid patrimBemGrid, String pk) {
        this.patrimBemGrid = patrimBemGrid;
        this.pk = pk;
        this.acaoServidor = "patrimBemDetalheAction";
        patrimBemDetalhe = new PatrimBemDetalhe(this);
        patrimBemDetalhe.setParentFrame(this.patrimBemGrid);
        this.patrimBemGrid.pushFrame(patrimBemDetalhe);
        MDIFrame.add(patrimBemDetalhe);

        if (pk != null) {
            patrimBemDetalhe.getForm1().setMode(Consts.READONLY);
            patrimBemDetalhe.getForm1().reload();
        } else {
            patrimBemDetalhe.getForm1().setMode(Consts.INSERT);
            patrimBemDetalhe.getGridDocumentacao().reloadData();
            patrimBemDetalhe.getGridDepreciacao().reloadData();
            patrimBemDetalhe.getGridMovimentacao().reloadData();
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.LOAD, pk});
    }

    @Override
    public void loadDataCompleted(boolean error) {
        patrimBemDetalhe.getDocumentacaoController().setPk(pk);
        patrimBemDetalhe.getGridDocumentacao().reloadData();

        patrimBemDetalhe.getDepreciacaoController().setPk(pk);
        patrimBemDetalhe.getGridDepreciacao().reloadData();

        patrimBemDetalhe.getMovimentacaoController().setPk(pk);
        patrimBemDetalhe.getGridMovimentacao().reloadData();
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        List<PatrimDocumentoBemVO> documentacao = patrimBemDetalhe.getGridDocumentacao().getVOListTableModel().getDataVector();
        List<PatrimDepreciacaoBemVO> depreciacao = patrimBemDetalhe.getGridDepreciacao().getVOListTableModel().getDataVector();
        List<PatrimMovimentacaoBemVO> movimentacao = patrimBemDetalhe.getGridMovimentacao().getVOListTableModel().getDataVector();

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.INSERT, newPersistentObject, documentacao, depreciacao, movimentacao});
    }

    @Override
    public void afterInsertData() {
        patrimBemGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(patrimBemDetalhe, "Dados salvos com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        List<PatrimDocumentoBemVO> documentacao = patrimBemDetalhe.getGridDocumentacao().getVOListTableModel().getDataVector();
        List<PatrimDepreciacaoBemVO> depreciacao = patrimBemDetalhe.getGridDepreciacao().getVOListTableModel().getDataVector();
        List<PatrimMovimentacaoBemVO> movimentacao = patrimBemDetalhe.getGridMovimentacao().getVOListTableModel().getDataVector();

        return ClientUtils.getData(acaoServidor, new Object[]{Constantes.UPDATE, oldPersistentObject, persistentObject, documentacao, depreciacao, movimentacao});
    }

    @Override
    public void afterEditData() {
        patrimBemGrid.getGrid1().reloadData();
        JOptionPane.showMessageDialog(patrimBemDetalhe, "Dados alterados com sucesso!", "Informacao do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}
