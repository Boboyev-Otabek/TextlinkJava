package com.example.textlinkjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        textmain = findViewById(R.id.text);
        String text = "I would like to do something similar to the https://twitter.com app";
        Spannable spannable = new SpannableString(text);
        int i1 = text.indexOf("https://"), i2;
        String[] arr = text.split(" ");

        for (String item : arr) {
            if (item.startsWith("https://")) {
                i2 = item.length() + i1;

                spannable.setSpan(new ForegroundColorSpan(Color.BLUE), i1, i2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }

        textmain.setText(spannable);
    }
}
