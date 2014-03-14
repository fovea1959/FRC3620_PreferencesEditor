package org.first.frc3620;

/**
 *
 * @author wegscd
 */
public class PreferencesBean {

    static boolean DEBUG = false;

    String cRIOName = null;

    String autonomousChoice = null;

    Integer chooChooDelay = null;
    
    Integer autonomousForwardDistance = null;

    Integer intakeSpeed = null;
    
    Integer hueLower = null;
    
    Integer hueUpper = null;
    
    Integer saturationLower = null;
    
    Integer saturationUpper = null;
    
    Integer valueLower = null;
    
    Integer valueUpper = null;

    public PreferencesBean() {
    }
    
    @Override
    public String toString() {
        return "PreferencesBean{" + "cRIOName=" + cRIOName + ", autonomous=" + autonomousChoice + ", chooChooDelay=" + chooChooDelay + ", autonomousDistance=" + autonomousForwardDistance + ", intakeSpeed=" + intakeSpeed + '}';
    }
    
    public String getcRIOName() {
        return cRIOName;
    }

    public void setcRIOName(String _new) {
        this.cRIOName = _new;
        if (DEBUG) 
            System.err.println("cRIOname = " + cRIOName);
    }

    public String getAutonomousChoice() {
        return autonomousChoice;
    }

    public void setAutonomousChoice(String _new) {
        this.autonomousChoice = _new;
        if (DEBUG) 
            System.err.println("autonomous = " + autonomousChoice);
    }

    public String[] getAutonomousChoices() {
        return new String[]{"None", "Vision", "TwoBall"};
    }

    public Integer getChooChooDelay() {
        return chooChooDelay;
    }

    public void setChooChooDelay(Integer _new) {
        this.chooChooDelay = _new;
        if (DEBUG) 
            System.err.println("chooChooDelay = " + this.chooChooDelay);
    }

    public Integer getAutonomousForwardDistance() {
        return autonomousForwardDistance;
    }

    public void setAutonomousForwardDistance(Integer autonomousForwardDistance) {
        this.autonomousForwardDistance = autonomousForwardDistance;
    }

    public Integer getIntakeSpeed() {
        return intakeSpeed;
    }

    public void setIntakeSpeed(Integer intakeSpeed) {
        this.intakeSpeed = intakeSpeed;
    }
    
    public Integer getHueLower(){
      return hueLower;
    }
    
    public Integer setHueLower(){
      this.hueLower =  _new;
      if(DEBUG){
        System.err.println("hueLower = "+ this.hueLower);
      }
    }

    public Integer getHueUpper(){
     return hueUpper;
    }

    public Integer setHueUpper(){
      this.hueUpper = _new;
      if(DEBUG){
        System.err.println("hueUpper = " + this.hueUpper);
        }
    }

    public Integer getSaturationLower(){
      return saturationLower;
    }

    public Integer setSaturationLower(){
      this.saturationLower = _new;
      if(DEBUG){
        System.err.println("saturationLower = "+ this.saturationLower);
        }
    }

    public Inter getSaturationUpper(){
      return saturationUpper;
    }

    public Integer setSaturationUpper(){
      this.saturationUpper = _new;
      if(DEBUG){
        System.err.println("saturationUpper = "+this.saturationUpper);
        }
    }
    
    public Integer getValueLower(){
      return valueLower;
    }

    public Integer setValueLower(){
      this.valueLower = _new;
      if(DEBUG){
        System.err.println("valueLower = "+this.valueLower);
        }
    }

    public Integer getValueUpper(){
      return valueUpper;
    }

    public Integer setValueUpper(){
      this.valueUpper = _new;
      if(DEBUG){
        System.err.println("valueUpper = "+this.valueUpper);
        }
    }
}
