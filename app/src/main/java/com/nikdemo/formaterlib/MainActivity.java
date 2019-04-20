package com.nikdemo.formaterlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String date = "http://finance.yahoo.com/d/quotes.csv?f=l1&s=USDINR=X";
//        date = String.valueOf(DateTimeFormat.changeDatePattern("12 04 2019","dd MMM yyyy"));


        text2 = findViewById(R.id.textView1);

        text2.setText(date);
    }
}
