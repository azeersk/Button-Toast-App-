package com.example.buttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private Button sumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        editText1 = (EditText) findViewById(R.id.valueOne);
        editText2 = (EditText) findViewById(R.id.valueTwo);
        sumButton = (Button) findViewById(R.id.addButton);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);

                int sum = a + b;

                Toast.makeText(getApplicationContext(),"Sum of the given is: "+String.valueOf(sum),Toast.LENGTH_SHORT).show();

            }
        });
    }



}