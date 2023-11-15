package com.example.togglebuttonswitchkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switch1;
    private ToggleButton toggleButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);
        button = findViewById(R.id.button);



        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Log.e("Switch","ON");
                }else {
                    Log.e("Switch","OFF");
                }
            }
        });


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Log.e("Toggle Button","ON");
                }else {
                    Log.e("Toggle Button","OFF");
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean switchDurum = switch1.isChecked();
                Boolean toggleButtonDurum = toggleButton.isChecked();

                Log.e("Swiitch Durum", String.valueOf(switchDurum));
                Log.e("Toggle Buttton Durum", String.valueOf(toggleButtonDurum));
            }
        });



    }
}