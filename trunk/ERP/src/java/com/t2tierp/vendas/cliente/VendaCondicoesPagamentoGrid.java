package com.t2tierp.vendas.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Tela VendaCondicoesPagamentoGrid.</p>
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
public class VendaCondicoesPagamentoGrid extends InternalFrame {

    public VendaCondicoesPagamentoGrid(VendaCondicoesPagamentoGridController controller) {
        initComponents();
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        decimalColumn5 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn6 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn7 = new org.openswing.swing.table.columns.client.DecimalColumn();
        integerColumn8 = new org.openswing.swing.table.columns.client.IntegerColumn();
        decimalColumn9 = new org.openswing.swing.table.columns.client.DecimalColumn();
        integerColumn10 = new org.openswing.swing.table.columns.client.IntegerColumn();

        setTitle("T2Ti ERP - Vendas e Faturamento");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda Condicoes Pagamento"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFunctionId("vendaCondicoesPagamento");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.vendas.java.VendaCondicoesPagamentoVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn3.setColumnName("nome");
        textColumn3.setHeaderColumnName("Nome");
        textColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn3.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn3);

        decimalColumn5.setColumnName("faturamentoMinimo");
        decimalColumn5.setDecimals(2);
        decimalColumn5.setHeaderColumnName("Faturamento Minimo");
        decimalColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn5.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(decimalColumn5);

        decimalColumn6.setColumnName("faturamentoMaximo");
        decimalColumn6.setDecimals(2);
        decimalColumn6.setHeaderColumnName("Faturamento Maximo");
        decimalColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn6.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(decimalColumn6);

        decimalColumn7.setColumnName("indiceCorrecao");
        decimalColumn7.setHeaderColumnName("Indice Correcao");
        decimalColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn7.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn7);

        integerColumn8.setColumnName("diasTolerancia");
        integerColumn8.setHeaderColumnName("Dias Tolerancia");
        integerColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(integerColumn8);

        decimalColumn9.setColumnName("valorTolerancia");
        decimalColumn9.setHeaderColumnName("Valor Tolerancia");
        decimalColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn9.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn9);

        integerColumn10.setColumnName("prazoMedio");
        integerColumn10.setHeaderColumnName("Prazo Medio");
        integerColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(integerColumn10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn5;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn6;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn7;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn9;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn10;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn8;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    // End of variables declaration//GEN-END:variables
}
