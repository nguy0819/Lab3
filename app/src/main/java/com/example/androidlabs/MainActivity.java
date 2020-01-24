package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkbox;
    private Switch aSwitch;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);
     //setContentView(R.layout.activity_main_linear);
       // setContentView(R.layout.activity_main_grid);
        checkbox = findViewById(R.id.checkBox2);
        aSwitch = findViewById(R.id.switch2);
        button = findViewById(R.id.button3);
        button.setOnClickListener(v-> Toast.makeText( MainActivity.this, "Here is more information", Toast.LENGTH_LONG).show());
        checkbox.setOnCheckedChangeListener((buttonView, isChecked)-> {
            if (checkbox.isChecked()){
                Snackbar.make(checkbox, getResources().getString(R.string.check_message_true), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.setAction_message),
                                click -> buttonView.setChecked(!isChecked) ).show();
            }else{
                Snackbar.make(checkbox, getResources().getString(R.string.check_message_false), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.setAction_message),
                                click -> buttonView.setChecked(!isChecked) ).show();
            }
        });
        aSwitch.setOnCheckedChangeListener((buttonView, isChecked)-> {
            if (aSwitch.isChecked()){
                Snackbar.make(aSwitch, getResources().getString(R.string.switch_message_true), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.setAction_message),
                                click -> buttonView.setChecked(!isChecked) ).show();
            }else{
                Snackbar.make(aSwitch, getResources().getString(R.string.switch_message_false), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.setAction_message),
                                click -> buttonView.setChecked(!isChecked) ).show();
            }
        });

    }
}