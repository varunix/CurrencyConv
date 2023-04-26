package com.example.currencycon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView5);
        Bundle b = getIntent().getExtras();
        String curr = b.getString("CURR").toString();
        if ("USD".equals(curr)){
            double result = b.getDouble("CURR_USD");
            textView.setText(String.format("%.2f",result));
        }
        else if("EURO".equals(curr)){
            double result = b.getDouble("CURR_EU");
            textView.setText(String.format("%.2f",result));
        }
        else if("YUAN".equals(curr)){
            double result = b.getDouble("CURR_YU");
            textView.setText(String.format("%.2f",result));
        }
        else if("YEN".equals(curr)){
            double result = b.getDouble("CURR_YE");
            textView.setText(String.format("%.2f",result));
        }
    }
}