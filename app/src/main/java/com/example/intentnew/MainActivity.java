package com.example.intentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
    }

    public void screen_one(View view){

        String value = editText.getText().toString();

        if(value.length()<1){

            editText.setError("Empty Value");
        }
        else{

            Intent intent = new Intent(MainActivity.this,Main3Activity.class);

//            intent.putExtra("name",value);
//            //intent.putExtra("password",value+"Pass@121");

            Bundle bundle = new Bundle();

            bundle.putString("name",value);
            bundle.putString("password",value+"Pass@121");

            intent.putExtras(bundle);

            //ArrayList

            startActivity(intent);

        }


    }
}
