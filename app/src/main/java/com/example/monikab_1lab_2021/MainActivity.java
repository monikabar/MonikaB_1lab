package com.example.monikab_1lab_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void OnBtnClick(View view) {
        this.tvMain.setText(R.string.changed_label_caption);
    }

    public void OnBtnClick2(View view) {
        this.tvMain.setTextColor(Color.RED);
    }
}