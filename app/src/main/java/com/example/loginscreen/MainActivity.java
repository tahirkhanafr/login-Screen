package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void process(View view) {
        Intent intent=new Intent(MainActivity.this,Main22222.class);
        startActivity(intent);
    }

    public void sign(View view) {
        Intent i = new Intent(MainActivity.this,signup.class );
        startActivity(i);
    }
}
