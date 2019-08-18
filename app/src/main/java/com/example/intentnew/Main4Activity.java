package com.example.intentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

        TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = findViewById(R.id.textView2);

        String print_on_3rd_screen = getIntent().getStringExtra("value");

        textView.setText(print_on_3rd_screen);
    }

    public void home_screen(View view){

        Intent intent = new Intent(Main4Activity.this,MainActivity.class);

        startActivity(intent);
    }
}
