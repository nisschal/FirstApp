package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button count_button;
    private Button Toast_button;
    private TextView textView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        count_button = findViewById(R.id.count_button);
        Toast_button = findViewById(R.id.Toast_button);
        textView = findViewById(R.id.textView);

    }

    public void count(View view){
        count++;
        textView.setText(""+count);
    }
    public void toast(View v){
        Toast.makeText(MainActivity.this,"This is a toast", Toast.LENGTH_LONG).show();

    }
}
