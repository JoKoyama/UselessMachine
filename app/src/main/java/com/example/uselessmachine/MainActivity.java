package com.example.uselessmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch useless;
    private ToggleButton killSwitch;
    private SwitchFunction switchu;
    private ProgressBar bar1;
    private ProgressBar bar2;
    private ProgressBar bar3;
    private ProgressBar bar4;
    private ProgressBar bar5;
    private ProgressBar bar6;
    private ProgressBar bar7;
    private ProgressBar bar8;
    private ProgressBar bar9;
    private ProgressBar bar10;
    private ProgressBar bar11;
    private ProgressBar bar12;
    private ProgressBar bar13;
    private ProgressBar bar14;
    private ProgressBar bar15;
    private ProgressBar bar16;
    private ProgressBar bar17;
    private ProgressBar bar18;
    private ProgressBar bar19;
    private ProgressBar bar20;
    private ProgressBar bar21;
    private ProgressBar bar22;
    private ProgressBar bar23;
    private ProgressBar bar24;
    private ProgressBar bar25;
    private ProgressBar bar26;
    private ProgressBar bar27;
    private ProgressBar bar28;
    private ProgressBar bar29;
    private ProgressBar bar30;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchu = new SwitchFunction();
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
                    if (switchu.getAnnoyanceLevel()>= 5000){
                        switchu.setAnnoyanceLevel(switchu.getAnnoyanceLevel()-499);
                        if (switchu.getAnnoyanceLevel()%100>=4){
                            useless.setVisibility(View.GONE);
                        }
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
                Toast.makeText(MainActivity.this, switchu.message(switchu.getAnnoyanceLevel()), Toast.LENGTH_SHORT).show();
                if (switchu.getPress()==6){
                    new CountDownTimer(1000, 500) {
                        @Override
                        public void onTick(long l) {
                            useless.setVisibility(View.GONE);
                        }

                        @Override
                        public void onFinish() {
                            loading();
                        }
                    }.start();
                }
                if(b&& switchu.getPress()>1){killSwitch.setTextOn(switchu.buttonKey());}
                else if(!false){killSwitch.setTextOff(switchu.buttonKey());}

            }
        });
    }

    private void loading(int b) {
        new CountDownTimer(10000, 100) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                if(switchu.getBar()==30){

                }
                loading(switchu.getBar(switchu.setBar(switchu.getBar()++)));
            }
        }

    }

    private void wireWidgets() {
        useless = findViewById(R.id.switch_main_help);
        killSwitch= findViewById(R.id.toggleButton_main_theEnd);
        bar1 = findViewById(R.id.bar_main_1);
        bar2 = findViewById(R.id.bar_main_2);
        bar3 = findViewById(R.id.bar_main_3);
        bar4 = findViewById(R.id.bar_main_4);
        bar5 = findViewById(R.id.bar_main_5);
        bar6 = findViewById(R.id.bar_main_6);
        bar7 = findViewById(R.id.bar_main_7);
        bar8 = findViewById(R.id.bar_main_8);
        bar9 = findViewById(R.id.bar_main_9);
        bar10 = findViewById(R.id.bar_main_10);
        bar11 = findViewById(R.id.bar_main_11);
        bar12 = findViewById(R.id.bar_main_12);
        bar13 = findViewById(R.id.bar_main_13);
        bar14 = findViewById(R.id.bar_main_13);
        bar15 = findViewById(R.id.bar_main_14);
        bar15 = findViewById(R.id.bar_main_15);
        bar16 = findViewById(R.id.bar_main_16);
        bar17 = findViewById(R.id.bar_main_17);
        bar18 = findViewById(R.id.bar_main_18);
        bar19 = findViewById(R.id.bar_main_19);
        bar20 = findViewById(R.id.bar_main_20);
        bar21 = findViewById(R.id.bar_main_21);
        bar22 = findViewById(R.id.bar_main_22);
        bar23 = findViewById(R.id.bar_main_23);
        bar24 = findViewById(R.id.bar_main_24);
        bar25 = findViewById(R.id.bar_main_25);
        bar26 = findViewById(R.id.bar_main_26);
        bar27 = findViewById(R.id.bar_main_27);
        bar28 = findViewById(R.id.bar_main_28);
        bar29 = findViewById(R.id.bar_main_29);
        bar30 = findViewById(R.id.bar_main_30);
    }


}
