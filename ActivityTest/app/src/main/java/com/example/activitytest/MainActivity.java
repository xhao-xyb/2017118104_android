package com.example.activitytest;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    private final static String TAG = "Main";

    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.button) {
            intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button1) {
            intent = new Intent(MainActivity.this, PageA.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button2) {
            intent = new Intent(MainActivity.this, PageB.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button3) {
            intent = new Intent(MainActivity.this, PageC.class);
            startActivity(intent);
        }
    }

    public void settupButton(){
        Button b;
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main");
        Log.d(TAG, this.toString());
        settupButton();
    }
}
