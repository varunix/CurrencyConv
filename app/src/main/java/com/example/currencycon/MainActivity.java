package com.example.currencycon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    public static final String GLOBAL_INPUT = "com.example.currencycon.global_input";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View view) {
        editText = findViewById(R.id.editText);
        String input = editText.getText().toString();
        if(input.isEmpty() || input.equals(".")){
            Toast.makeText(this, "Please enter some value", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(GLOBAL_INPUT, input);
            startActivity(intent);
        }
    }
}