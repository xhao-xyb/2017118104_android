package com.example.helloworldactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HelloWorld2 extends AppCompatActivity implements View.OnClickListener{

    public static final  String TAG="HelloWorld2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world2);
        settupButton();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.hw2_1) {
            intent = new Intent(HelloWorld2.this , HelloWorld1.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.hw2_0){
            intent = new Intent(HelloWorld2.this , MainActivity.class);
            startActivity(intent);
        }
    }

    public void settupButton(){
        Button b,b0;
        b = (Button) findViewById(R.id.hw2_1);
        b.setOnClickListener(this);
        b0= (Button) findViewById(R.id.hw2_0);
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
