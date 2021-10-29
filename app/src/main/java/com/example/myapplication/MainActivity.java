package com.example.myapplication;

import static com.example.myapplication.R.id.enter_name;
import static com.example.myapplication.R.id.packed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText enter_name;
private TextView hello_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter_name=findViewById(R.id.enter_name);
        hello_text=findViewById(R.id.hello_text);
    }

    public void sayHello(View viv)
        {
            Toast.makeText(MainActivity.this,"Hello,"+enter_name.getText(),Toast.LENGTH_LONG).show();

//hello_text.setText("Hello,"+enter_name.getText());

        }

}