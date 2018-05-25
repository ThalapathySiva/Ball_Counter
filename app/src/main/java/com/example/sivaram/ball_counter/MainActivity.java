package com.example.sivaram.ball_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void close(View view) {
        finish();
        System.exit(0);
    }

    public void start(View view) {

        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }
}
