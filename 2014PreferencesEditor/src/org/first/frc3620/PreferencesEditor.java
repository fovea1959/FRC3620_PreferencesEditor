/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.frc3620;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.networktables.NetworkTableProvider;
import edu.wpi.first.wpilibj.networktables2.NetworkTableNode;
import edu.wpi.first.wpilibj.networktables2.client.NetworkTableClient;
import edu.wpi.first.wpilibj.networktables2.stream.IOStreamFactory;
import edu.wpi.first.wpilibj.networktables2.stream.SocketStreams;
import edu.wpi.first.wpilibj.tables.IRemote;
import edu.wpi.first.wpilibj.tables.IRemoteConnectionListener;
import edu.wpi.first.wpilibj.tables.TableKeyNotDefinedException;
import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.util.prefs.PreferenceChangeEvent;

/**
 *
 * @author wegscd
 */
public class PreferencesEditor implements IPreferencesTransfer, IRemoteConnectionListener {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(PreferencesEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PreferencesEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PreferencesEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PreferencesEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    final PreferencesEditor preferencesEditor = new PreferencesEditor(0);

  }

  NetworkTable prefTable;
  PreferencesEditorUI ui;
  boolean connected = false;
  String ip;

  public PreferencesEditor(int team) {
    NetworkTable.setClientMode();
    if (team == 0) {
      NetworkTable.setIPAddress("127.0.0.1");
    } else {
      NetworkTable.setTeam(team);
    }
    this.prefTable = NetworkTable.getTable("Preferences");

    ui = new PreferencesEditorUI(this);

    prefTable.addConnectionListener(this, true);

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        ui.setVisible(true);
      }
    });

  }

  @Override
  public boolean preferencesSave(PreferencesBean preferencesBean) {
    System.out.println("saveToRobot called, setting the robot to " + preferencesBean);
    boolean rv = false;

    if (connected) {
      prefTable.putString(PreferencesNames.CRIONAME, preferencesBean.getcRIOName());
      prefTable.putString(PreferencesNames.AUTONOMOUS_CHOICE, preferencesBean.getAutonomousChoice());
      prefTable.putNumber(PreferencesNames.AUTONOMOUS_FORWARD_DISTANCE, preferencesBean.getAutonomousForwardDistance());
      prefTable.putNumber(PreferencesNames.CHOOCHOO_DELAY, preferencesBean.getChooChooDelay());
      prefTable.putNumber(PreferencesNames.INTAKE_SPEED, preferencesBean.getIntakeSpeed());

      prefTable.putBoolean("~S A V E~", true);
      rv = true;
    } else {
      ui.addErrorMessage("cannot save, not connected!");
    }
    
    System.out.println (xml(preferencesBean));
    
    return rv;
  }
  
  String xml(PreferencesBean p) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    XMLEncoder e = new XMLEncoder(baos);
    e.writeObject(p);
    e.close();
    return new String(baos.toByteArray());
  }

  @Override
  public PreferencesBean preferencesFetch(PreferencesBean p) {
    if (connected) {
      System.out.println("fetchFromRobot called...");
      try {
        p.setcRIOName(prefTable.getString(PreferencesNames.CRIONAME));
      } catch (TableKeyNotDefinedException ex) {
        ui.addErrorMessage("cannot get " + PreferencesNames.CRIONAME + " from robot");
      }

      try {
        p.setAutonomousChoice(prefTable.getString(PreferencesNames.AUTONOMOUS_CHOICE));
      } catch (TableKeyNotDefinedException ex) {
        ui.addErrorMessage("cannot get " + PreferencesNames.AUTONOMOUS_CHOICE + " from robot");
      }

      try {
        Number n = prefTable.getNumber(PreferencesNames.AUTONOMOUS_FORWARD_DISTANCE);
        p.setAutonomousForwardDistance(n.intValue());
      } catch (TableKeyNotDefinedException ex) {
        ui.addErrorMessage("cannot get " + PreferencesNames.AUTONOMOUS_FORWARD_DISTANCE + " from robot");
      }

      try {
        Number n = prefTable.getNumber(PreferencesNames.CHOOCHOO_DELAY);
        p.setChooChooDelay(n.intValue());
      } catch (TableKeyNotDefinedException ex) {
        ui.addErrorMessage("cannot get " + PreferencesNames.CHOOCHOO_DELAY + " from robot");
      }

      try {
        Number n = prefTable.getNumber(PreferencesNames.INTAKE_SPEED);
        p.setIntakeSpeed(n.intValue());
      } catch (TableKeyNotDefinedException ex) {
        ui.addErrorMessage("cannot get " + PreferencesNames.INTAKE_SPEED + " from robot");
      }
    } else {
      ui.addErrorMessage("cannot fetch, not connected!");
    }

    return p;
  }

  @Override
  public void connected(final IRemote ir) {
    connected = true;
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        ui.addErrorMessage("Connected to " + ir);
        ui.setConnected("Connected to " + ir);
      }
    });
  }

  @Override
  public void disconnected(final IRemote ir) {
    connected = false;
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        ui.addErrorMessage("Disconnected from " + ir);
        ui.setDisconnected();
      }
    });
  }
}
