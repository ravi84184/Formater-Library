package com.nikdemo.formaterlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nikdemo.formaterlibrary.CurrencyConversion;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String date = "http://finance.yahoo.com/d/quotes.csv?f=l1&s=USDINR=X";
        date = String.valueOf(CurrencyConversion.currencyConvert( 1000.50));


        text2 = findViewById(R.id.textView1);

        text2.setText(date);
    }
}
