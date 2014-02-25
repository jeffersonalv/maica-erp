package com.erp.cadastros.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Tela MunicipioGrid.</p>
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
public class MunicipioGrid extends InternalFrame {

    public MunicipioGrid(MunicipioGridController controller) {
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
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        exportButton1 = new org.openswing.swing.client.ExportButton();
        filterButton1 = new org.openswing.swing.client.FilterButton();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        integerColumn4 = new org.openswing.swing.table.columns.client.IntegerColumn();
        integerColumn5 = new org.openswing.swing.table.columns.client.IntegerColumn();
        integerColumn6 = new org.openswing.swing.table.columns.client.IntegerColumn();

        setTitle("ERP - Cadastros");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Municipio"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);
        jPanel1.add(exportButton1);
        jPanel1.add(filterButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setExportButton(exportButton1);
        gridControl1.setFilterButton(filterButton1);
        gridControl1.setFunctionId("municipio");
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.erp.cadastros.java.vo.MunicipioVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn3.setColumnFilterable(true);
        textColumn3.setColumnName("nome");
        textColumn3.setHeaderColumnName("Nome");
        textColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn3.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn3);

        textColumn2.setColumnName("uf.nome");
        textColumn2.setHeaderColumnName("UF");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn2.setPreferredWidth(50);
        gridControl1.getColumnContainer().add(textColumn2);

        integerColumn4.setColumnFilterable(true);
        integerColumn4.setColumnName("codigoIbge");
        integerColumn4.setHeaderColumnName("Codigo Ibge");
        integerColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(integerColumn4);

        integerColumn5.setColumnFilterable(true);
        integerColumn5.setColumnName("codigoReceitaFederal");
        integerColumn5.setHeaderColumnName("Codigo Receita Federal");
        integerColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        integerColumn5.setPreferredWidth(150);
        gridControl1.getColumnContainer().add(integerColumn5);

        integerColumn6.setColumnFilterable(true);
        integerColumn6.setColumnName("codigoEstadual");
        integerColumn6.setHeaderColumnName("Codigo Estadual");
        integerColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(integerColumn6);

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
    private org.openswing.swing.client.ExportButton exportButton1;
    private org.openswing.swing.client.FilterButton filterButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn4;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn5;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn6;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    // End of variables declaration//GEN-END:variables
}
