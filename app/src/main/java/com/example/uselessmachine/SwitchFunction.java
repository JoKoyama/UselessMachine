package com.example.uselessmachine;

public class SwitchFunction {
    private int timesClicked;
    private int annoyanceLevel;
    private boolean switchOn;
    private boolean buttonOn;

    public SwitchFunction(){

    }
    public int getAnnoyanceLevel() {
        return annoyanceLevel;
    }

    public void setAnnoyanceLevel(int annoyanceLevel) {
        this.annoyanceLevel = annoyanceLevel;
    }

    public boolean isButtonOn() {
        return buttonOn;
    }

    public void setButtonOn(boolean buttonOn) {
        this.buttonOn = buttonOn;
    }

    public boolean isSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        this.switchOn = switchOn;
    }

    public int getTimesClicked() {
        return timesClicked;
    }

    public void setTimesClicked(int timesClicked) {
        this.timesClicked = timesClicked;
    }
}
