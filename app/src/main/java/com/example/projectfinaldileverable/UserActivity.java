package com.example.projectfinaldileverable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {
String s1,s2,s3,s4;
TextView test , test2 , test3 ,test4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        test = (TextView)findViewById(R.id.user_Name);
        test2 = (TextView)findViewById(R.id.user_phone);
        test3 = (TextView)findViewById(R.id.user_email);
        test4=(TextView)findViewById(R.id.gender_textView);

        s1 = getIntent().getExtras().getString("name");
        s2 = getIntent().getExtras().getString("Phone Number");
        s3 = getIntent().getExtras().getString("Email Address");
        s4 = getIntent().getExtras().getString("Gender");

        test.setText(s1);
        test2.setText(s2);
        test3.setText(s3);
        test4.setText(s4);


    }
}
