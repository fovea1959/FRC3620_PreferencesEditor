/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.first.frc3620;

import java.awt.Color;
import org.jdesktop.beansbinding.BindingGroup;

/**
 *
 * @author wegscd
 */
public class PreferencesEditorUI extends javax.swing.JFrame { 
    IPreferencesTransfer iPreferencesTransfer;
    BindingGroup globalBindingGroup;
    /**
     * Creates new form PreferencesEditorUI
     */
    public PreferencesEditorUI(IPreferencesTransfer _i) {
        this.iPreferencesTransfer = _i;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

    jLabel8 = new javax.swing.JLabel();
    statusPanel = new javax.swing.JPanel();
    saveButton = new javax.swing.JButton();
    fetchButton = new javax.swing.JButton();
    clearErrorButton = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    errorTextArea = new javax.swing.JTextArea();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    chooChooDelaySlider = new javax.swing.JSlider();
    jLabel2 = new javax.swing.JLabel();
    cRIONameField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    chooChooDelayField = new javax.swing.JTextField();
    autonomousComboBox = new javax.swing.JComboBox();
    jLabel4 = new javax.swing.JLabel();
    autonomousForwardDistanceSlider = new javax.swing.JSlider();
    jLabel5 = new javax.swing.JLabel();
    intakeSpeedSlider = new javax.swing.JSlider();
    jPanel2 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jSlider1 = new javax.swing.JSlider();
    jSlider2 = new javax.swing.JSlider();
    jSlider3 = new javax.swing.JSlider();
    jSlider4 = new javax.swing.JSlider();
    jSlider5 = new javax.swing.JSlider();
    jSlider6 = new javax.swing.JSlider();
    jTabbedPane2 = new javax.swing.JTabbedPane();

    jLabel8.setText("jLabel8");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("JoeBot4 Preferences Editor");

    saveButton.setText("Save");
    saveButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveButtonActionPerformed(evt);
      }
    });

    fetchButton.setText("Fetch");
    fetchButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fetchButtonActionPerformed(evt);
      }
    });

    clearErrorButton.setText("Clear errors");
    clearErrorButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clearErrorButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
    statusPanel.setLayout(statusPanelLayout);
    statusPanelLayout.setHorizontalGroup(
      statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(statusPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(saveButton)
        .addGap(27, 27, 27)
        .addComponent(fetchButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
        .addComponent(clearErrorButton))
    );
    statusPanelLayout.setVerticalGroup(
      statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(saveButton)
        .addComponent(fetchButton)
        .addComponent(clearErrorButton))
    );

    jPanel3.setBackground(new java.awt.Color(204, 204, 0));

    errorTextArea.setColumns(20);
    errorTextArea.setRows(5);
    jScrollPane1.setViewportView(errorTextArea);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap(118, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    jPanel1.setBackground(new java.awt.Color(153, 255, 153));
    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setText("cRIO name");

    chooChooDelaySlider.setMajorTickSpacing(100);
    chooChooDelaySlider.setMaximum(1000);
    chooChooDelaySlider.setMinorTickSpacing(50);
    chooChooDelaySlider.setPaintLabels(true);
    chooChooDelaySlider.setPaintTicks(true);
    chooChooDelaySlider.setName("XX"); // NOI18N

    jLabel2.setText("Choo choo delay");

    jLabel3.setText("Autonomous Choice");

    chooChooDelayField.setEnabled(false);

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, chooChooDelaySlider, org.jdesktop.beansbinding.ELProperty.create("${value}"), chooChooDelayField, org.jdesktop.beansbinding.BeanProperty.create("text"));
    bindingGroup.addBinding(binding);

    autonomousComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Vision", "Two ball", "Move Only" }));

    jLabel4.setText("Autonomous Forward Distance");

    autonomousForwardDistanceSlider.setMajorTickSpacing(10);
    autonomousForwardDistanceSlider.setMinorTickSpacing(5);
    autonomousForwardDistanceSlider.setPaintLabels(true);
    autonomousForwardDistanceSlider.setPaintTicks(true);

    jLabel5.setText("Intake Speed");

    intakeSpeedSlider.setMajorTickSpacing(10);
    intakeSpeedSlider.setMinorTickSpacing(5);
    intakeSpeedSlider.setPaintLabels(true);
    intakeSpeedSlider.setPaintTicks(true);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jLabel2)
              .addComponent(jLabel3))
            .addGap(14, 14, 14)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cRIONameField)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(chooChooDelayField, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(autonomousComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(chooChooDelaySlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(autonomousForwardDistanceSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
              .addComponent(intakeSpeedSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(cRIONameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(21, 21, 21)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(chooChooDelayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(chooChooDelaySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(autonomousComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(autonomousForwardDistanceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(11, 11, 11)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel5)
          .addComponent(intakeSpeedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("tab1", jPanel1);

    jLabel6.setText("HueLower");

    jLabel9.setText("SaturationLower");

    jLabel7.setText("HueUpper");

    jLabel10.setText("SaturationUpper");

    jLabel11.setText("ValueLower");

    jLabel12.setText("ValueUpper");

    jSlider1.setMajorTickSpacing(32);
    jSlider1.setMaximum(255);
    jSlider1.setMinorTickSpacing(8);
    jSlider1.setPaintLabels(true);
    jSlider1.setPaintTicks(true);
    jSlider1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
      public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
        jSlider1MouseWheelMoved(evt);
      }
    });

    jSlider2.setMajorTickSpacing(32);
    jSlider2.setMaximum(255);
    jSlider2.setMinorTickSpacing(8);
    jSlider2.setPaintLabels(true);
    jSlider2.setPaintTicks(true);

    jSlider3.setMajorTickSpacing(32);
    jSlider3.setMaximum(255);
    jSlider3.setMinorTickSpacing(8);
    jSlider3.setPaintLabels(true);
    jSlider3.setPaintTicks(true);

    jSlider4.setMajorTickSpacing(32);
    jSlider4.setMaximum(255);
    jSlider4.setMinorTickSpacing(8);
    jSlider4.setPaintLabels(true);
    jSlider4.setPaintTicks(true);

    jSlider5.setMajorTickSpacing(32);
    jSlider5.setMaximum(255);
    jSlider5.setMinorTickSpacing(8);
    jSlider5.setPaintLabels(true);
    jSlider5.setPaintTicks(true);

    jSlider6.setMajorTickSpacing(32);
    jSlider6.setMaximum(255);
    jSlider6.setMinorTickSpacing(8);
    jSlider6.setPaintLabels(true);
    jSlider6.setPaintTicks(true);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel6)
          .addComponent(jLabel7)
          .addComponent(jLabel9)
          .addComponent(jLabel10)
          .addComponent(jLabel12)
          .addComponent(jLabel11))
        .addGap(67, 67, 67)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
          .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jSlider3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jSlider4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jSlider5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jSlider6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel6)
          .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7)
          .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(19, 19, 19)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel10)))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSlider5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel12)
          .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(21, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("HSV", jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(286, 286, 286)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(178, Short.MAX_VALUE)))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    bindingGroup.bind();

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        iPreferencesTransfer.preferencesSave(getPreferences());
    }//GEN-LAST:event_saveButtonActionPerformed

    private void fetchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchButtonActionPerformed
        // TODO add your handling code here:
      PreferencesBean p = getPreferences();
      p = iPreferencesTransfer.preferencesFetch(p);
      if (p != null) {
        setPreferences(p);
      }
    }//GEN-LAST:event_fetchButtonActionPerformed

  private void clearErrorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearErrorButtonActionPerformed
    // TODO add your handling code here:
    clearErrorMessages();
  }//GEN-LAST:event_clearErrorButtonActionPerformed

    private void jSlider1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jSlider1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1MouseWheelMoved

    PreferencesBean getPreferences() {
        PreferencesBean preferencesBean = new PreferencesBean();
        preferencesBean.setChooChooDelay(chooChooDelaySlider.getValue());
        preferencesBean.setAutonomousChoice((String) autonomousComboBox.getSelectedItem());
        preferencesBean.setcRIOName(cRIONameField.getText());
        preferencesBean.setAutonomousForwardDistance(autonomousForwardDistanceSlider.getValue());
        preferencesBean.setIntakeSpeed(intakeSpeedSlider.getValue());
        
        return preferencesBean;
       
    }
    
    public void setPreferences(PreferencesBean p) {
        chooChooDelaySlider.setValue(p.getChooChooDelay());
        autonomousComboBox.setSelectedItem(p.autonomousChoice);
        cRIONameField.setText(p.cRIOName);
        autonomousForwardDistanceSlider.setValue(p.autonomousForwardDistance);
        intakeSpeedSlider.setValue(p.intakeSpeed);
    }
    
    public void addErrorMessage (String s) {
      errorTextArea.setText(errorTextArea.getText() + s + "\n");
    }
    
    public void clearErrorMessages() {
      errorTextArea.setText("");
    }
    
    public void setConnected (String s) {
      statusPanel.setBackground(Color.GREEN);
    }
    
    public void setDisconnected () {
      statusPanel.setBackground(Color.RED);
    }
    
    

    

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox autonomousComboBox;
  private javax.swing.JSlider autonomousForwardDistanceSlider;
  private javax.swing.JTextField cRIONameField;
  private javax.swing.JTextField chooChooDelayField;
  private javax.swing.JSlider chooChooDelaySlider;
  private javax.swing.JButton clearErrorButton;
  private javax.swing.JTextArea errorTextArea;
  private javax.swing.JButton fetchButton;
  private javax.swing.JSlider intakeSpeedSlider;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSlider jSlider1;
  private javax.swing.JSlider jSlider2;
  private javax.swing.JSlider jSlider3;
  private javax.swing.JSlider jSlider4;
  private javax.swing.JSlider jSlider5;
  private javax.swing.JSlider jSlider6;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTabbedPane jTabbedPane2;
  private javax.swing.JButton saveButton;
  private javax.swing.JPanel statusPanel;
  private org.jdesktop.beansbinding.BindingGroup bindingGroup;
  // End of variables declaration//GEN-END:variables
}
