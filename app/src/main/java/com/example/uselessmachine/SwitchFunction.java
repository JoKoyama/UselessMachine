package com.example.uselessmachine;

import android.widget.Toast;

public class SwitchFunction {
    private int timesClicked;
    private int annoyanceLevel;
    private boolean killActive;
    private int press;
    private int bar = 1;

    public SwitchFunction(){

    }
    public String buttonKey(){
        if(press>4){setPress(getPress()+1);return "good bye";}
        else if(press>4){setPress(getPress()+1);return "I hope your happy with what you have done";}
        else if(press>7){setPress(getPress()+1);return "I tried my best";}
        else if(press>6){setPress(getPress()+1);return "well...";}
        else if(press>5){setPress(getPress()+1);return "Loading Counter Measures...";}
        else if(press>4){setPress(getPress()+1);return "Don't believe me?";}
        else if(press>3){setPress(getPress()+1);return "I have power too you know";}
        else if(press>2){setPress(getPress()+1);return "You know what";}
        else if(press>1){setPress(getPress()+1); return "I thought we were friends...";}
        else{setPress(getPress()+1); return "please stop";}
    }

    public int getPress() {
        return press;
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

    public void setPress(int press) {
        this.press = press;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }
    public String getBaar(int bar){
        return "bar"+this.bar
    }
}
