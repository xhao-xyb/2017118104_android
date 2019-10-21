package com.example.hiddenintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settupButton();
    }
    public void settupButton(){
        Button b;
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.button1){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.hstc.edu.cn"));
            startActivity(intent);
        }
        if(v.getId() == R.id.button2){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:10086"));
            startActivity(intent);
        }
        if(v.getId() == R.id.button3){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:0,0?z=4&q=business+near+city"));
            startActivity(intent);
        }
    }
}
