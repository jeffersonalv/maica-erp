package  com.erp.tributacao.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Tela TributIssGrid.</p>
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
public class TributIssGrid extends InternalFrame {

    public TributIssGrid(TributIssGridController controller) {
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
        filterButton1 = new org.openswing.swing.client.FilterButton();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumn3 = new org.openswing.swing.table.columns.client.ComboColumn();
        decimalColumn4 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn5 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn6 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn7 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn8 = new org.openswing.swing.table.columns.client.DecimalColumn();
        integerColumn9 = new org.openswing.swing.table.columns.client.IntegerColumn();
        comboColumn10 = new org.openswing.swing.table.columns.client.ComboColumn();

        setTitle("ERP - Tributacao");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tribut Iss"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);
        jPanel1.add(filterButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFilterButton(filterButton1);
        gridControl1.setFunctionId("tributIss");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.erp.tributacao.java.vo.TributIssVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn2.setColumnFilterable(true);
        textColumn2.setColumnName("tributOperacaoFiscal.descricao");
        textColumn2.setHeaderColumnName("Operacao Fiscal");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn2.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn2);

        comboColumn3.setColumnName("modalidadeBaseCalculo");
        comboColumn3.setDomainId("issModalidadeBaseCalculo");
        comboColumn3.setHeaderColumnName("Modalidade Base Calculo");
        comboColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comboColumn3.setPreferredWidth(150);
        gridControl1.getColumnContainer().add(comboColumn3);

        decimalColumn4.setColumnFilterable(true);
        decimalColumn4.setColumnName("porcentoBaseCalculo");
        decimalColumn4.setDecimals(2);
        decimalColumn4.setHeaderColumnName("Porcento Base Calculo");
        decimalColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn4.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(decimalColumn4);

        decimalColumn5.setColumnName("aliquotaPorcento");
        decimalColumn5.setDecimals(2);
        decimalColumn5.setHeaderColumnName("Aliquota Porcento");
        decimalColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn5.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(decimalColumn5);

        decimalColumn6.setColumnName("aliquotaUnidade");
        decimalColumn6.setHeaderColumnName("Aliquota Unidade");
        decimalColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn6.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn6);

        decimalColumn7.setColumnName("valorPrecoMaximo");
        decimalColumn7.setDecimals(2);
        decimalColumn7.setHeaderColumnName("Valor Preco Maximo");
        decimalColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn7.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(decimalColumn7);

        decimalColumn8.setColumnName("valorPautaFiscal");
        decimalColumn8.setHeaderColumnName("Valor Pauta Fiscal");
        decimalColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn8.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn8);

        integerColumn9.setColumnName("itemListaServico");
        integerColumn9.setHeaderColumnName("Item Lista Servico");
        integerColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        integerColumn9.setPreferredWidth(120);
        gridControl1.getColumnContainer().add(integerColumn9);

        comboColumn10.setColumnName("codigoTributacao");
        comboColumn10.setDomainId("issCodigoTributacao");
        comboColumn10.setHeaderColumnName("Codigo Tributacao");
        comboColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comboColumn10.setPreferredWidth(130);
        gridControl1.getColumnContainer().add(comboColumn10);

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
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn10;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn3;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn4;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn5;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn6;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn7;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn8;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.FilterButton filterButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn9;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    // End of variables declaration//GEN-END:variables
}
