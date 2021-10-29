package com.example.myapplication;

import static com.example.myapplication.R.id.enter_name;
import static com.example.myapplication.R.id.packed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
private EditText enter_name;
private TextView hello_text;
public String my_name="анастасия";
public String my_name_short_short_russsian="настя";
public String my_name_eng="anastasiya";
public String my_name_short_eng="nastya";
public String first_mentor_name="максим";
public String first_mentor_name_plus_surname="максим сергеевич";
public String first_mentor_name_eng="maksim";
public String first_mentor_name_plus_surname_eng="maksim sergeevich";
public String granny_name="галина";
public String short_granny_name_russian="галя";
public String granny_name_eng="galina";
public String short_granny_name_eng="galya";
public String mother_name="светлана";
public String short_mother_name_russian="света";
public String mother_name_eng="svetlana";
public String short_mother_name_eng="sveta";
public String sister_name="полина";
public String short_sister_name_russsian="поля";
public String sister_name_eng="polina";
public String sister_name_eng_short="polya";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter_name=findViewById(R.id.enter_name);
        hello_text=findViewById(R.id.hello_text);
    }

    public void sayHello(View viv)
        {
            if (enter_name.getText().equals("Anastasiya")||enter_name.getText().equals(my_name_eng)
                    ||enter_name.getText().equals(my_name_eng.toUpperCase())||enter_name.getText().equals(my_name_short_eng)
                    ||enter_name.getText().equals(my_name_short_eng.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Hello,"+enter_name.getText()+" "+"I am cool!!",Toast.LENGTH_LONG).show();
            }
        else if (enter_name.getText().equals("Анастасия")||enter_name.getText().equals(my_name)||enter_name.getText().equals(my_name.toUpperCase())
                    ||enter_name.getText().equals(my_name_short_short_russsian)||enter_name.getText().equals(my_name_short_short_russsian.toUpperCase())){
                Toast.makeText(MainActivity.this,"Привет,"+" "+enter_name.getText()+"Я молодец",Toast.LENGTH_LONG);
            }
        else if(enter_name.getText().equals(enter_name.getText().equals("Maksim Sergeevich")||enter_name.getText().equals("Maksim"))
                    ||enter_name.getText().equals(first_mentor_name_eng)||enter_name.getText().equals(first_mentor_name.toUpperCase())
                    ||enter_name.getText().equals(first_mentor_name_plus_surname_eng)||enter_name.getText().equals(first_mentor_name_plus_surname.toUpperCase()))
            {
            Toast.makeText(MainActivity.this,"Hello,"+enter_name.getText(),Toast.LENGTH_LONG).show();
            }
       else if (enter_name.getText().equals("Мксим Сергеевич")||enter_name.getText().equals("Максим")
                    ||enter_name.getText().equals(first_mentor_name)||enter_name.getText().equals(first_mentor_name.toUpperCase())
                ||enter_name.getText().equals(first_mentor_name_plus_surname)||enter_name.getText().equals(first_mentor_name_plus_surname.toUpperCase()))
          {
           Toast.makeText(MainActivity.this,"Hello,"+enter_name.getText(),Toast.LENGTH_LONG).show();
          }
            if (enter_name.getText().equals("Galina")||enter_name.getText().equals("Galya")
                    ||enter_name.getText().equals(granny_name_eng)||enter_name.getText().equals(granny_name_eng.toUpperCase())
                    ||enter_name.getText().equals(short_granny_name_eng)||enter_name.getText().equals(short_granny_name_eng.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Hello,"+"my dear Granny",Toast.LENGTH_LONG).show();
            }
       else if (enter_name.getText().equals("Галина")||enter_name.getText().equals("Галя")
                    ||enter_name.getText().equals(granny_name)||enter_name.getText().equals(granny_name.toUpperCase())
                    ||enter_name.getText().equals(short_granny_name_russian)||enter_name.getText().equals(short_granny_name_russian.toUpperCase()))
        {
            Toast.makeText(MainActivity.this,"Привет,"+""+"любимка моя!!!",Toast.LENGTH_LONG).show();
        }
           else  if (enter_name.getText().equals("Galina")||enter_name.getText().equals("Galya")
                    ||enter_name.getText().equals(granny_name_eng)||enter_name.getText().equals(granny_name_eng.toUpperCase())
                    ||enter_name.getText().equals(short_granny_name_eng)||enter_name.getText().equals(short_granny_name_eng.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Hello,"+"my dear Granny",Toast.LENGTH_LONG).show();
            }
        else if (enter_name.getText().equals("Светлана")||enter_name.getText().equals("Света")
                ||enter_name.getText().equals(mother_name)||enter_name.getText().equals(mother_name.toUpperCase())
                ||enter_name.getText().equals(short_mother_name_russian)||enter_name.getText().equals(short_mother_name_russian.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Привет,"+""+"мама!!!",Toast.LENGTH_LONG).show();
            }
            else  if (enter_name.getText().equals("Svetlana")||enter_name.getText().equals("Sveta")
                    ||enter_name.getText().equals(mother_name_eng)||enter_name.getText().equals(mother_name_eng.toUpperCase())
                    ||enter_name.getText().equals(short_mother_name_eng)||enter_name.getText().equals(short_mother_name_eng.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Hello,"+"my mother",Toast.LENGTH_LONG).show();
            }
            else  if (enter_name.getText().equals("Polina")||enter_name.getText().equals("Polya")
                    ||enter_name.getText().equals(sister_name_eng)||enter_name.getText().equals(sister_name_eng.toUpperCase())
                    ||enter_name.getText().equals(sister_name_eng_short)||enter_name.getText().equals(sister_name_eng_short.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Hello,"+" "+"my sister",Toast.LENGTH_LONG).show();
            }
            else  if (enter_name.getText().equals("Полина")||enter_name.getText().equals("Поля")
                    ||enter_name.getText().equals(sister_name)||enter_name.getText().equals(sister_name.toUpperCase())
                    ||enter_name.getText().equals(short_sister_name_russsian)||enter_name.getText().equals(sister_name_eng_short.toUpperCase()))
            {
                Toast.makeText(MainActivity.this,"Привет,"+enter_name.getText()+" "+"сеструха",Toast.LENGTH_LONG).show();
            }
        }
}