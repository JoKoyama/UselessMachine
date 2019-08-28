package com.example.uselessmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch useless;
    private ToggleButton killSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        wireWidgets();
        setListeners();
    }

    private void setListeners() {
    }

    private void wireWidgets() {
        useless = findViewById(R.id.switch_main_help);
        killSwitch= findViewById(R.id.toggleButton_main_theEnd);
    }


}
