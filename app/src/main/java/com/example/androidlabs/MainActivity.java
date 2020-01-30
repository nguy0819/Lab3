package com.example.androidlabs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //  private EditText pwInput;
    private EditText emailInput;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab3);
        emailInput = findViewById(R.id.email1);
        //    pwInput = findViewById(R.id.passWord);



        SharedPreferences ref = getSharedPreferences ( "activity_main_lab3", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = ref.edit();
        emailInput.setText(ref.getString("email", ""));

        button = findViewById(R.id.button);
        button.setOnClickListener(v-> {
            onPause();
            Intent goToProfile = new Intent(MainActivity.this, ProfileActivity.class);
            goToProfile.putExtra( "EMAIL",emailInput.getText().toString());
            startActivity(goToProfile);
        });
    }



    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences ref = getSharedPreferences( "activity_main_lab3",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = ref.edit();
        edit.putString("email", emailInput.getText().toString()).commit();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
