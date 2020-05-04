package com.example.projectfinaldileverable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button login;


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button2);


login = (Button)findViewById(R.id.login_button);


login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startLoginActivity();
    }
});



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StartMenuActivity();
            }
        });
    }
    public void StartMenuActivity(){
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("name", "Guest Account");
        intent.putExtra("Phone Number", " ");
        intent.putExtra("Email Address", " ");
        intent.putExtra("Gender" , " ");
        Toast.makeText(this, "Loged in as Guest User" , Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }

    public void startLoginActivity(){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);

    }
}
