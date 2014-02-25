package com.t2tierp.financeiro.cliente;

import com.erp.padrao.constantes.Constantes;
import com.t2tierp.financeiro.java.ViewFinResumoTesourariaID;
import com.t2tierp.financeiro.java.ViewFinResumoTesourariaVO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.client.ClientUtils;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle do tela FinResumoTesourariaDetalhe.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM</p>
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
 *       The author may be contacted at:
 *           t2ti.com@gmail.com</p>
 *
 * @author Claudio de Barros (T2Ti.COM)
 * @version 1.0
 */
public class FinResumoTesourariaDetalheController extends GridController implements GridDataLocator {

    private String acaoServidor;
    private Date dataInicio;
    private Date dataFim;
    private FinResumoTesourariaDetalhe finResumoTesourariaDetalhe;
    private FinResumoTesourariaGrid finResumoTesourariaGrid;
    private ViewFinResumoTesourariaVO resumoTesouraria;

    public FinResumoTesourariaDetalheController(FinResumoTesourariaGrid finResumoTesourariaGrid, ViewFinResumoTesourariaID resumoTesouraria, Date dataInicio, Date dataFim) {
        acaoServidor = "finResumoTesourariaDetalheAction";
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

        this.finResumoTesourariaGrid = finResumoTesourariaGrid;
        this.resumoTesouraria = resumoTesouraria.getViewFinResumoTesouraria();

        finResumoTesourariaDetalhe = new FinResumoTesourariaDetalhe(this);
        finResumoTesourariaDetalhe.setTextoContaCaixa(resumoTesouraria.getViewFinResumoTesouraria().getNomeContaCaixa());
        SimpleDateFormat formatoPeriodo = new SimpleDateFormat("MM/yyyy");
        finResumoTesourariaDetalhe.setTextoPeriodo(formatoPeriodo.format(dataInicio));
        finResumoTesourariaDetalhe.setParentFrame(this.finResumoTesourariaGrid);
        this.finResumoTesourariaGrid.pushFrame(finResumoTesourariaDetalhe);
        MDIFrame.add(finResumoTesourariaDetalhe);

        finResumoTesourariaDetalhe.getGrid1().reloadData();
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        //define os parametros da grid
        otherGridParams.put("acao", Constantes.LOAD);
        otherGridParams.put("idContaCaixa", resumoTesouraria.getIdContaCaixa());
        otherGridParams.put("dataInicio", dataInicio);
        otherGridParams.put("dataFim", dataFim);

        return ClientUtils.getData(acaoServidor, new GridParams(action, startIndex, filteredColumns, currentSortedColumns, currentSortedVersusColumns, otherGridParams));
    }

    @Override
    public void loadDataCompleted(boolean error) {
        List<ViewFinResumoTesourariaID> resumo = finResumoTesourariaDetalhe.getGrid1().getVOListTableModel().getDataVector();
        BigDecimal pagamentos = BigDecimal.ZERO;
        BigDecimal recebimentos = BigDecimal.ZERO;
        BigDecimal saldo = BigDecimal.ZERO;

        for (int i = 0; i < resumo.size(); i++){
            if (resumo.get(i).getViewFinResumoTesouraria().getOperacao().equals("E")){
                recebimentos = recebimentos.add(resumo.get(i).getViewFinResumoTesouraria().getValor());
            } else {
                pagamentos = pagamentos.add(resumo.get(i).getViewFinResumoTesouraria().getValor());
            }
        }
        saldo = pagamentos.subtract(recebimentos);
        finResumoTesourariaDetalhe.setTextoPagamentos(pagamentos);
        finResumoTesourariaDetalhe.setTextoRecebimentos(recebimentos);
        finResumoTesourariaDetalhe.setTextoSaldo(saldo);
    }
}
