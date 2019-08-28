package com.example.uselessmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch useless;
    private ToggleButton killSwitch;
    private SwitchFunction switchu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        wireWidgets();
        setListeners();
        updateGameDisplay();
    }

    private void updateGameDisplay() {

    }


    private void setListeners() {
        useless.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    switchu.setAnnoyanceLevel(switchu.getAnnoyanceLevel()+500);
                    if (switchu.getAnnoyanceLevel()>=5000){

                    }
                    new CountDownTimer(5000-switchu.getAnnoyanceLevel(),100) {
                        @Override
                        public void onTick(long l) {
                            if (!useless.isChecked()){
                                cancel();
                            }
                        }

                        @Override
                        public void onFinish() {
                            useless.setChecked(false);

                        }
                    }.start();
                    //switch is turned off after 5 seconds
                    //increase annoyance by 5
                }

            }

        });
        killSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    new CountDownTimer(5000, 100) {
                        @Override
                        public void onTick(long l) {

                        }

                        @Override
                        public void onFinish() {
                            finish();

                        }
                    }
                }

            }
        });
    }

    private void wireWidgets() {
        useless = findViewById(R.id.switch_main_help);
        killSwitch= findViewById(R.id.toggleButton_main_theEnd);
    }


}
