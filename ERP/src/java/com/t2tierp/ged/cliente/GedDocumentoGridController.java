package com.t2tierp.ged.cliente;

import com.erp.padrao.cliente.Container;
import com.erp.padrao.cliente.Util;
import com.erp.padrao.constantes.Constantes;
import com.t2tierp.ged.java.ArquivoVO;
import com.t2tierp.ged.java.GedDocumentoVO;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.client.ClientUtils;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela GedDocumentoGrid.</p>
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
public class GedDocumentoGridController extends GridController implements GridDataLocator {

    private GedDocumentoGrid grid;
    private String acaoServidor;

    public GedDocumentoGridController() {
        grid = new GedDocumentoGrid(this);
        acaoServidor = "gedDocumentoGridAction";
        MDIFrame.add(grid);
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        //define os parametros da grid
        otherGridParams.put("acao", Constantes.LOAD);

        FilterWhereClause[] filtro = new FilterWhereClause[]{new FilterWhereClause("empresa", "=", Container.getContainer().get("empresa")), null};
        filteredColumns.put("empresa", filtro);

        return ClientUtils.getData(acaoServidor, new GridParams(action, startIndex, filteredColumns, currentSortedColumns, currentSortedVersusColumns, otherGridParams));
    }

    @Override
    public boolean beforeInsertGrid(GridControl grid) {
        try {
            new GedDocumentoDetalheController(this.grid, null, null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void doubleClick(int rowNumber, ValueObject persistentObject) {
        GedDocumentoVO gedDocumento = (GedDocumentoVO) persistentObject;
        try {
            new GedDocumentoDetalheController(grid, gedDocumento.getId().toString(), null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void integracaoModulosErp(String nomeDocumento, ArquivoVO arquivo) throws Exception {
        GedDocumentoVO gedDocumento = new GedDocumentoVO();
        gedDocumento.setNome(nomeDocumento);
        if (arquivo.getFile() != null) {
            File file = File.createTempFile(nomeDocumento.replaceAll(" ", ""), arquivo.getExtensao());
            file.deleteOnExit();
            FileOutputStream out = new FileOutputStream(file.getAbsolutePath());
            out.write(arquivo.getFile());
            out.close();

            arquivo.setHash(Util.md5Arquivo(file.getAbsolutePath()));
        }
        gedDocumento.setArquivo(arquivo);

        new GedDocumentoDetalheController(this.grid, null, gedDocumento);
    }
}
