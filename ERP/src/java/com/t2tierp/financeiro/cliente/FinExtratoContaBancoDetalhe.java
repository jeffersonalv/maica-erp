package com.t2tierp.financeiro.cliente;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.openswing.swing.client.GenericButton;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.util.client.ClientSettings;
import org.openswing.swing.util.client.ClientUtils;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Tela FinExtratoContaBancoDetalhe.</p>
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
public class FinExtratoContaBancoDetalhe extends InternalFrame {

    private FinExtratoContaBancoDetalheController controller;
    private DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.00");

    public FinExtratoContaBancoDetalhe(FinExtratoContaBancoDetalheController controller) {
        initComponents();

        form1.setFormController(new FormController());

        this.controller = controller;

        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);

        genericButton1.setToolTipText("Importar Extrato");
        genericButton2.setToolTipText("Conciliar Lançamentos");
        genericButton3.setToolTipText("Conciliar Cheques");

        try {
            //formato do campo período
            MaskFormatter formatter = new MaskFormatter("##/####");
            formattedTextControl1.setFormatterFactory(new DefaultFormatterFactory(formatter));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public org.openswing.swing.form.client.Form getForm1() {
        return form1;
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    public String getPeriodo() {
        return formattedTextControl1.getText();
    }

    public void setTextoCreditos(BigDecimal valor){
        lblRecebimentos.setText("|   Créditos: R$ " + decimalFormat.format(valor));
    }

    public void setTextoDebitos(BigDecimal valor){
        lblPagamentos.setText("|   Débitos: R$ " + decimalFormat.format(valor));
    }

    public void setTextoSaldo(BigDecimal valor){
        lblSaldo.setText("|   Saldo: R$ " + decimalFormat.format(valor) + "   |");
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
        saveButton1 = new org.openswing.swing.client.SaveButton();
        genericButton1 = new GenericButton(new ImageIcon(ClientUtils.getImage(ClientSettings.BUTTON_IMPORT_IMAGE_NAME)));
        genericButton2 = new GenericButton(new ImageIcon(ClientUtils.getImage("ptrp16.png")));
        genericButton3 = new GenericButton(new ImageIcon(ClientUtils.getImage("currencies_16_h.png")));
        form1 = new org.openswing.swing.form.client.Form();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        textControl2 = new org.openswing.swing.client.TextControl();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        formattedTextControl1 = new org.openswing.swing.client.FormattedTextControl();
        gridControl1 = new org.openswing.swing.client.GridControl();
        dateColumn6 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn7 = new org.openswing.swing.table.columns.client.DateColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn9 = new org.openswing.swing.table.columns.client.TextColumn();
        decimalColumn10 = new org.openswing.swing.table.columns.client.DecimalColumn();
        comboColumn11 = new org.openswing.swing.table.columns.client.ComboColumn();
        textColumn12 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel2 = new javax.swing.JPanel();
        lblRecebimentos = new javax.swing.JLabel();
        lblPagamentos = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();

        setResizable(false);
        setTitle("T2Ti ERP - Financeiro - Conciliacao Bancaria");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fin Extrato Conta Banco"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(reloadButton1);

        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton1);

        genericButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genericButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(genericButton1);

        genericButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genericButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(genericButton2);

        genericButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genericButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(genericButton3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        form1.setVOClassName("com.t2tierp.financeiro.java.FinExtratoContaBancoVO");
        form1.setFunctionId("finExtratoContaBanco");
        form1.setLayout(new java.awt.GridBagLayout());

        labelControl2.setText("Conta Caixa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl2, gridBagConstraints);

        textControl2.setAttributeName("contaCaixa.nome");
        textControl2.setEnabled(false);
        textControl2.setEnabledOnEdit(false);
        textControl2.setEnabledOnInsert(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(textControl2, gridBagConstraints);

        labelControl3.setLabel("Mes Ano:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        form1.add(labelControl3, gridBagConstraints);

        formattedTextControl1.setAttributeName("mesAno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        form1.add(formattedTextControl1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(form1, gridBagConstraints);

        gridControl1.setAutoLoadData(false);
        gridControl1.setFunctionId("finExtratoContaBanco");
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.financeiro.java.FinExtratoContaBancoVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        dateColumn6.setColumnName("dataMovimento");
        dateColumn6.setHeaderColumnName("Data Movimento");
        dateColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn6);

        dateColumn7.setColumnName("dataBalancete");
        dateColumn7.setHeaderColumnName("Data Balancete");
        dateColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn7);

        textColumn8.setColumnName("historico");
        textColumn8.setHeaderColumnName("Historico");
        textColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(textColumn8);

        textColumn9.setColumnName("documento");
        textColumn9.setHeaderColumnName("Documento");
        textColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(textColumn9);

        decimalColumn10.setColumnName("valor");
        decimalColumn10.setHeaderColumnName("Valor");
        decimalColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn10.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn10);

        comboColumn11.setColumnName("conciliado");
        comboColumn11.setDomainId("simnao");
        comboColumn11.setHeaderColumnName("Conciliado");
        comboColumn11.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(comboColumn11);

        textColumn12.setColumnName("observacao");
        textColumn12.setHeaderColumnName("Observacao");
        textColumn12.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn12.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        lblRecebimentos.setFont(new java.awt.Font("Arial", 1, 14));
        lblRecebimentos.setText("|   Créditos:");
        jPanel2.add(lblRecebimentos);

        lblPagamentos.setFont(new java.awt.Font("Arial", 1, 14));
        lblPagamentos.setText("|   Débitos:");
        jPanel2.add(lblPagamentos);

        lblSaldo.setFont(new java.awt.Font("Arial", 1, 14));
        lblSaldo.setText("|   Saldo:   |");
        jPanel2.add(lblSaldo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(this, "Salvar o extrato?", "Pergunta do Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                controller.salvaExtrato();
                JOptionPane.showMessageDialog(this, "Extrato salvo com sucesso.", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao salvar o extrato.\n" + ex.getMessage(), "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void genericButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genericButton2ActionPerformed
        try {
            controller.efetuaConciliacao("lancamentos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao conciliar os lançamentos.\n" + ex.getMessage(), "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_genericButton2ActionPerformed

    private void genericButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genericButton3ActionPerformed
        try {
            controller.efetuaConciliacao("cheques");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao conciliar os cheques.\n" + ex.getMessage(), "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_genericButton3ActionPerformed

    private void genericButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genericButton1ActionPerformed
        controller.importaOFX();
    }//GEN-LAST:event_genericButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn11;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn6;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn7;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn10;
    private org.openswing.swing.form.client.Form form1;
    private org.openswing.swing.client.FormattedTextControl formattedTextControl1;
    private org.openswing.swing.client.GenericButton genericButton1;
    private org.openswing.swing.client.GenericButton genericButton2;
    private org.openswing.swing.client.GenericButton genericButton3;
    private org.openswing.swing.client.GridControl gridControl1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl3;
    private javax.swing.JLabel lblPagamentos;
    private javax.swing.JLabel lblRecebimentos;
    private javax.swing.JLabel lblSaldo;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn12;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    private org.openswing.swing.table.columns.client.TextColumn textColumn9;
    private org.openswing.swing.client.TextControl textControl2;
    // End of variables declaration//GEN-END:variables
}