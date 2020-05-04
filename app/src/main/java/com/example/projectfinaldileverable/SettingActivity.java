package com.example.projectfinaldileverable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class SettingActivity extends AppCompatActivity {
    Switch aSwitch , bSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        aSwitch = (Switch)findViewById(R.id.switch1);
        bSwitch = (Switch)findViewById(R.id.switch2);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    Toast.makeText(getBaseContext(),"Location Services Enabled", LENGTH_SHORT).show();
                }
                else Toast.makeText(getBaseContext(),"Location Services Disabled", LENGTH_SHORT).show();
            }
        });
        bSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    Toast.makeText(getBaseContext(), "Low Power Mode Enabled" , LENGTH_SHORT).show();
                }
                else Toast.makeText(getBaseContext(), "Low power mode Disabled" , LENGTH_SHORT).show();
            }
        });
    }
}
