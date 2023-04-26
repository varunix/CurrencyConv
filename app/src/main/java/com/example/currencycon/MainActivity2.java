package com.example.currencycon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button_usd;
    Button button_eu;
    Button button_yu;
    Button button_yen;

    public static final String CURR_USD = "";
    public static final String CURR_EU = "";
    public static final String CURR_YU = "";
    public static final String CURR_YE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_usd = findViewById(R.id.button2);
        button_eu = findViewById(R.id.button3);
        button_yu = findViewById(R.id.button5);
        button_yen = findViewById(R.id.button4);
        String input = getIntent().getStringExtra(MainActivity.GLOBAL_INPUT);
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        button_usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dollar = Double.parseDouble(input)/73.77;
                Bundle bundle = new Bundle();
                bundle.putDouble("CURR_USD", dollar);
                intent.putExtras(bundle);
                intent.putExtra("CURR","USD");
                startActivity(intent);
            }
        });
        button_eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double euros = Double.parseDouble(input)/87.21;
                Bundle bundle = new Bundle();
                bundle.putDouble("CURR_EU", euros);
                intent.putExtras(bundle);
                intent.putExtra("CURR","EURO");
                startActivity(intent);
            }
        });
        button_yu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double yuan = Double.parseDouble(input)/11.42;
                Bundle bundle = new Bundle();
                bundle.putDouble("CURR_YU", yuan);
                intent.putExtras(bundle);
                intent.putExtra("CURR","YUAN");
                startActivity(intent);
            }
        });
        button_yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double yen = Double.parseDouble(input)/0.67;
                Bundle bundle = new Bundle();
                bundle.putDouble("CURR_YE", yen);
                intent.putExtras(bundle);
                intent.putExtra("CURR","YEN");
                startActivity(intent);
            }
        });
    }
}