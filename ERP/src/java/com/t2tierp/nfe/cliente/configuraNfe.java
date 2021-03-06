package com.t2tierp.nfe.cliente;

/*
 * ncmDetalhe.java
 *
 * Created on 7 aprile 2007, 22.44
 */
import org.openswing.swing.client.*;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;

import org.openswing.swing.mdi.client.InternalFrame;

/**
 * <p>Title: T2Ti MINI</p>
 * <p>Description: Classe de controle para cadastro dos tipos de colaborador
 * numa grid.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM</p>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * The author may be contacted at: t2ti.com@gmail.com</p>
 *
 * @author Luiz Junior (Consultor T2Ti.COM)
 * @version 1.0
 */
public class configuraNfe extends InternalFrame {

    /**
     * Creates new form BeanForm
     */
    public configuraNfe(FormController dataController) {
        try {
            initComponents();
            form1.setFormController(dataController);
            this.setUniqueInstance(true);


            setSize(660, 680);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Form getForm1() {
        return form1;
    }

    public SaveButton getSaveButton() {
        return saveButton1;
    }

    public EditButton getEditButton() {
        return editButton1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonsPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        editButton1 = new org.openswing.swing.client.EditButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        form1 = new org.openswing.swing.form.client.Form();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setTitle("Configurações");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        buttonsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(editButton1);
        jToolBar1.add(reloadButton1);
        jToolBar1.add(saveButton1);

        buttonsPanel.add(jToolBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(buttonsPanel, gridBagConstraints);

        form1.setVOClassName("br.com.t2ti.vo.EmpresaVO");
        form1.setEditButton(editButton1);
        form1.setFunctionId("empresa");
        form1.setMaximumSize(new java.awt.Dimension(640, 480));
        form1.setReloadButton(reloadButton1);
        form1.setSaveButton(saveButton1);
        form1.setLayout(new java.awt.GridBagLayout());
        jTabbedPane1.addTab("Geral", form1);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        jTabbedPane1.addTab("DANFe", jPanel2);
        jTabbedPane1.addTab("DANFe e Extras", jPanel3);
        jTabbedPane1.addTab("Web Service", jPanel1);
        jTabbedPane1.addTab("Email", jPanel4);
        jTabbedPane1.addTab("Outros", jPanel5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTabbedPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.form.client.Form form1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    // End of variables declaration//GEN-END:variables
}
