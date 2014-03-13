/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.frc3620;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author wegscd
 */
public class PreferencesBeanProperties extends PreferencesBean {

    @Override
    public void setcRIOName(String _new) {
        String old = getcRIOName();
        super.setcRIOName(_new);
        propertyChangeSupport.firePropertyChange("cRIOName", old, getcRIOName());
    }

    @Override
    public void setAutonomousChoice(String _new) {
        String old = getAutonomousChoice();
        super.setAutonomousChoice(_new);
        propertyChangeSupport.firePropertyChange("autonomousChoice", old, getAutonomousChoice());
    }

    @Override
    public void setChooChooDelay(Integer _new) {
        Integer old = getChooChooDelay();
        super.setChooChooDelay(_new);
        propertyChangeSupport.firePropertyChange("chooChooDelay", old, getChooChooDelay());
    }

    //
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public PreferencesBeanProperties() {
        super();
        propertyChangeSupport.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent pce) {
                // System.err.println("PCE = " + pce);
            }
        });
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        this.propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        this.propertyChangeSupport.removePropertyChangeListener(l);
    }

}
