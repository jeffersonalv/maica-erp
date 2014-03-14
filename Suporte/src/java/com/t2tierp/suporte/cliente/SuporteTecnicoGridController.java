package com.t2tierp.suporte.cliente;

import com.t2tierp.padrao.java.Constantes;
import com.t2tierp.suporte.java.ArquivoVO;
import com.t2tierp.suporte.java.ChamadoVO;
import com.t2tierp.suporte.java.ChatVO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.client.ClientUtils;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela SuporteTecnicoGrid.</p>
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
public class SuporteTecnicoGridController extends GridController implements GridDataLocator {

    private SuporteTecnicoGrid grid;
    private String acaoServidor;
    private ChamadoVO chamado;

    public SuporteTecnicoGridController(ChamadoVO chamado) {
        grid = new SuporteTecnicoGrid(this);
        acaoServidor = "chatGridAction";
        this.chamado = chamado;

        iniciaChamado();
        MDIFrame.add(grid);
        verificaMensagens();
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        //define os parametros da grid
        otherGridParams.put("acao", Constantes.LOAD);
        otherGridParams.put("idChamado", chamado.getId());

        return ClientUtils.getData(acaoServidor, new GridParams(action, startIndex, filteredColumns, currentSortedColumns, currentSortedVersusColumns, otherGridParams));
    }

    public void enviaMensagem(String texto) throws Exception {
        ChatVO chat = new ChatVO();
        chat.setMensagem(texto);
        chat.setChamado(chamado);

        //define os parametros da grid
        Map otherGridParams = new HashMap();
        otherGridParams.put("acao", Constantes.INSERT);
        otherGridParams.put("chatVO", chat);
        //seta os parametros da grid
        GridParams pars = new GridParams(0, 0, null, null, null, otherGridParams);

        Response res = ClientUtils.getData(acaoServidor, pars);
        if (res.isError()) {
            throw new Exception(res.getErrorMessage());
        }
        chat = (ChatVO) ((VOResponse) res).getVo();
        grid.getGrid1().getVOListTableModel().addObject(chat);
    }

    private void iniciaChamado() {
        try {
            Response response = ClientUtils.getData("chamadoDetalheAction", new Object[]{Constantes.INSERT, chamado});
            if (response.isError()) {
                throw new Exception(response.getErrorMessage());
            }
            chamado = (ChamadoVO) ((VOResponse) response).getVo();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(grid, "Ocorreu um erro ao abrir o chamado!\n" + e.getMessage(), "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void verificaMensagens() {
        Thread t = new Thread(new Runnable() {

            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                        grid.getGrid1().reloadData();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }

    public void enviaArquivo(File file) throws Exception {
        ArquivoVO arquivo = new ArquivoVO();
        arquivo.setChamado(chamado);
        arquivo.setArquivo(getBytesArquivo(file));
        arquivo.setExtensao(getExtensaoArquivo(file.getAbsolutePath()));

        //define os parametros da grid
        Map otherGridParams = new HashMap();
        otherGridParams.put("acao", Constantes.INSERT);
        otherGridParams.put("arquivoVO", arquivo);
        //seta os parametros da grid
        GridParams pars = new GridParams(0, 0, null, null, null, otherGridParams);

        Response response = ClientUtils.getData("arquivoGridAction", pars);
        if (response.isError()) {
            throw new Exception(response.getErrorMessage());
        }
    }

    private byte[] getBytesArquivo(File file) throws Exception {
        byte[] documento = null;
        //converte o arquio em array de bytes
        InputStream is = new FileInputStream(file);
        // Get the size of the file
        long length = file.length();
        // Create the byte array to hold the data
        documento = new byte[(int) length];
        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        while (offset < documento.length
                && (numRead = is.read(documento, offset, documento.length - offset)) >= 0) {
            offset += numRead;
        }
        // Ensure all the bytes have been read in
        if (offset < documento.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }
        // Close the input stream and return bytes
        is.close();
        return documento;
    }

    private String getExtensaoArquivo(String nomeArquivo) {
        int indiceExtensao = nomeArquivo.lastIndexOf(".");
        if (indiceExtensao > -1) {
            return nomeArquivo.substring(indiceExtensao, nomeArquivo.length());
        }
        return "";
    }
}
