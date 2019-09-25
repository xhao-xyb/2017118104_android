package com.example.helloworldactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HelloWorld1 extends AppCompatActivity implements View.OnClickListener{

    public static final  String TAG="HelloWorld1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world1);
        settupButton();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.hw1_2) {
            intent = new Intent(HelloWorld1.this , HelloWorld2.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.hw1_0){
            intent = new Intent(HelloWorld1.this , MainActivity.class);
            startActivity(intent);
        }
    }

    public void settupButton(){
        Button b,b0;
        b = (Button) findViewById(R.id.hw1_2);
        b.setOnClickListener(this);
        b0= (Button) findViewById(R.id.hw1_0);
        b0.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}
