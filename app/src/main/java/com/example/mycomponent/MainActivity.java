package com.example.mycomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button myInfoScreenButton;
    private TextView myInfoScreenMessageDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInfoScreenButton = findViewById(R.id.message);
        myInfoScreenMessageDetail = findViewById(R.id.messageDetail);
        setupListeners();
    }

    private void setupListeners() {
        myInfoScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myInfoScreenMessageDetail.append(String.valueOf(new Random().nextInt()));
            }
        });
    }
}
