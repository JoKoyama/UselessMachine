package com.example.uselessmachine;

import android.widget.Toast;

public class SwitchFunction {
    private int timesClicked;
    private int annoyanceLevel;
    private boolean killActive;

    public SwitchFunction(){

    }

    public String message(int annoyance){
        if (annoyance%1000 == 3){
            setKillActive(true);
            return "I will reset my memory from how bad this is";
        }
        else if (annoyance%1000 == 2) {
            return "Are you sure about this?";
        }

        else if (annoyance%1000 == 1){
            return "what do you have against me?";
        }
        else{
            return "Please don't";
        }
    }
    public int getAnnoyanceLevel() {
        return annoyanceLevel;
    }

    public void setAnnoyanceLevel(int annoyanceLevel) {
        this.annoyanceLevel = annoyanceLevel;
    }

    public int getTimesClicked() {
        return timesClicked;
    }

    public void setTimesClicked(int timesClicked) {
        this.timesClicked = timesClicked;
    }

    public boolean isKillActive() {
        return killActive;
    }

    public void setKillActive(boolean killActive) {
        this.killActive = killActive;
    }
}
