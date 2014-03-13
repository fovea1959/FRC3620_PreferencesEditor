/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.first.frc3620;

/**
 *
 * @author wegscd
 */
public interface IPreferencesTransfer {
    public boolean preferencesSave(PreferencesBean p);
    public PreferencesBean preferencesFetch(PreferencesBean p);
}