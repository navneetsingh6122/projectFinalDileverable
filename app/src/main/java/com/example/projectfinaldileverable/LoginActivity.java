package com.example.projectfinaldileverable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText textone, texttwo;
    Button Menu;
    TextView signup;
String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        signup = (TextView) findViewById(R.id.sign_up);

        Menu = (Button) findViewById(R.id.login_button);
        textone = (EditText) findViewById(R.id.text1);
        texttwo = (EditText) findViewById(R.id.text2);

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoggingActivity();
            }
        });
    }


    public void Signup(View view) {

        Intent signup = new Intent(this, SignUp.class);
        startActivity(signup);

    }

    public void LoggingActivity() {
        if (textone.getText().toString().length() == 0) {
            Toast.makeText(this, "Enter the  values", Toast.LENGTH_SHORT).show();
        } else if ((textone.getText().toString().equals("navneet")) && (texttwo.getText().toString().equals("singhcst412"))) {

            Intent next = new Intent(this, MenuActivity.class);
            next.putExtra("name", "Navneet Singh");
            next.putExtra("Phone Number", "514-814-6122");
            next.putExtra("Email Address", "NavneetSingh6122@gmail.com");
            next.putExtra("Gender", "Male");
            user = "Navneet Singh";
            startActivity(next);

            Toast.makeText(this,  user + " " + "Successfully Logged In", Toast.LENGTH_SHORT).show();


        } else if ((textone.getText().toString().equals("jobanjeet")) && (texttwo.getText().toString().equals("singhcst412"))) {
            Intent next = new Intent(this, MenuActivity.class);
            next.putExtra("name", "Jobanjeet Singh");
            next.putExtra("Phone Number", "514-814-XXXX");
            next.putExtra("Email Address", "JobanJeetSingh@gmail.com");
            next.putExtra("Gender", "Male");
user = "Jobanjeet Singh";
            startActivity(next);

            Toast.makeText(this, user + " " + "Successfully Logged In", Toast.LENGTH_SHORT).show();
        } else if ((textone.getText().toString().equals("gan")) && (texttwo.getText().toString().equals("runfengcst412"))) {
            Intent next = new Intent(this, MenuActivity.class);
            next.putExtra("name", "Gan Runfeng");
            next.putExtra("Phone Number", "514-814-XXXX");
            next.putExtra("Email Address", "Patrick@gmail.com");
            next.putExtra("Gender", "Male");
            user = "gan Runfeng";

            startActivity(next);

            Toast.makeText(this, user + " " + "Successfully Logged In", Toast.LENGTH_SHORT).show();
        }
        else if ((textone.getText().toString().equals("jaswinder")) && (texttwo.getText().toString().equals("kaurcst412"))) {
            Intent next = new Intent(this, MenuActivity.class);
            next.putExtra("name", "Jaswinder Kaur");
            next.putExtra("Phone Number", "514-814-XXXX");
            next.putExtra("Email Address", "JKaur2448@gmail.com");
            next.putExtra("Gender", "Female");
user = "Jaswinder Kaur";
            startActivity(next);

            Toast.makeText(this, user + " " + "Successfully Logged In", Toast.LENGTH_SHORT).show();
        }


        else
            Toast.makeText(this, "Enter the correct Username or Password", Toast.LENGTH_SHORT).show();

    }
}
