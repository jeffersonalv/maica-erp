package com.t2tierp.financeiro.cliente;

import com.erp.padrao.constantes.Constantes;
import com.t2tierp.financeiro.java.ViewFinFluxoCaixaID;
import com.t2tierp.financeiro.java.ViewFinFluxoCaixaVO;
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
 * <p>Description: Classe de controle do tela FinFluxoCaixaDetalhe.</p>
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
public class FinFluxoCaixaDetalheController extends GridController implements GridDataLocator {

    private String acaoServidor;
    private Date dataInicio;
    private Date dataFim;
    private FinFluxoCaixaDetalhe finFluxoCaixaDetalhe;
    private FinFluxoCaixaGrid finFluxoCaixaGrid;
    private ViewFinFluxoCaixaVO fluxoCaixa;

    public FinFluxoCaixaDetalheController(FinFluxoCaixaGrid finResumoTesourariaGrid, ViewFinFluxoCaixaID resumoTesouraria, Date dataInicio, Date dataFim) {
        acaoServidor = "finFluxoCaixaDetalheAction";
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

        this.finFluxoCaixaGrid = finResumoTesourariaGrid;
        this.fluxoCaixa = resumoTesouraria.getViewFinFluxoCaixa();

        finFluxoCaixaDetalhe = new FinFluxoCaixaDetalhe(this);
        finFluxoCaixaDetalhe.setTextoContaCaixa(resumoTesouraria.getViewFinFluxoCaixa().getNomeContaCaixa());
        SimpleDateFormat formatoPeriodo = new SimpleDateFormat("MM/yyyy");
        finFluxoCaixaDetalhe.setTextoPeriodo(formatoPeriodo.format(dataInicio));
        finFluxoCaixaDetalhe.setParentFrame(this.finFluxoCaixaGrid);
        this.finFluxoCaixaGrid.pushFrame(finFluxoCaixaDetalhe);
        MDIFrame.add(finFluxoCaixaDetalhe);

        finFluxoCaixaDetalhe.getGrid1().reloadData();
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        //define os parametros da grid
        otherGridParams.put("acao", Constantes.LOAD);
        otherGridParams.put("idContaCaixa", fluxoCaixa.getIdContaCaixa());
        otherGridParams.put("dataInicio", dataInicio);
        otherGridParams.put("dataFim", dataFim);

        return ClientUtils.getData(acaoServidor, new GridParams(action, startIndex, filteredColumns, currentSortedColumns, currentSortedVersusColumns, otherGridParams));
    }

    @Override
    public void loadDataCompleted(boolean error) {
        List<ViewFinFluxoCaixaID> fluxoCaixa = finFluxoCaixaDetalhe.getGrid1().getVOListTableModel().getDataVector();
        BigDecimal aPagar = BigDecimal.ZERO;
        BigDecimal aReceber = BigDecimal.ZERO;
        BigDecimal saldo = BigDecimal.ZERO;

        for (int i = 0; i < fluxoCaixa.size(); i++) {
            if (fluxoCaixa.get(i).getViewFinFluxoCaixa().getOperacao().equals("E")) {
                aReceber = aReceber.add(fluxoCaixa.get(i).getViewFinFluxoCaixa().getValor());
            } else {
                aPagar = aPagar.add(fluxoCaixa.get(i).getViewFinFluxoCaixa().getValor());
            }
        }
        saldo = aPagar.subtract(aReceber);
        finFluxoCaixaDetalhe.setTextoPagamentos(aPagar);
        finFluxoCaixaDetalhe.setTextoRecebimentos(aReceber);
        finFluxoCaixaDetalhe.setTextoSaldo(saldo);
    }
}
