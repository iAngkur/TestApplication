package com.iangkur.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG", "Message");

    }

    public void buttonOnClicked(View view) {
        TextView text = findViewById(R.id.textView2);
        Log.i("TAG", text.getText().toString());
    }

}