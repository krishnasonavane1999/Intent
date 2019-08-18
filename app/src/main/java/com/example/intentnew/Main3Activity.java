package com.example.intentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textView;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText = findViewById(R.id.give_something);

        textView = findViewById(R.id.show_me_text);

        String myvalue = getIntent().getStringExtra("name");
        //String myvalue = getIntent().getStringExtra("password");

        textView.setText(myvalue);
    }

    public void third_screen(View view){

        String give_value = editText.getText().toString();

        if(give_value.length()<0){

            editText.setError("Empty value");
        }
        else{

            Intent intent = new Intent(Main3Activity.this,Main4Activity.class);

            intent.putExtra("value",give_value);

            startActivity(intent);

        }



    }
}
