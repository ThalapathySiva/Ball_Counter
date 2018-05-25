package com.example.sivaram.ball_counter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    int q=0,t=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public void aplusthree(View view) {
        q=q+3;
        display(q);

    }

    public void aplustwo(View view) {
        q=q+2;
        display(q);
    }

    public void afree(View view) {
        q=q;
        display(q);
    }

    public void bplusthree(View view) {
        t=t+3;
        print(t);

    }

    public void bplustwo(View view) {
        t=t+2;
        print(t);
    }

    public void bfree(View view) {
        t=t;
        print(t);
    }
    @SuppressLint("SetTextI18n")
    public void display(int number)
    {
        TextView qt= findViewById(R.id.sa);
        qt.setText(""+number);
    }
    public void print(int n)
    {
        TextView st = findViewById(R.id.sb);
        st.setText(""+n);
    }

    public void res(View view) {
        TextView qt= findViewById(R.id.sa);
        TextView st = findViewById(R.id.sb);
        qt.setText("0");
        q=0;
        st.setText("0");
        t=0;
    }

    public void bacl(View view) {

        super.onBackPressed();
    }
}
