package com.example.projectfinaldileverable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String Name[] , Description[];
    int images[] = {R.drawable.recipe , R.drawable.recipe2 , R.drawable.recipe3 , R.drawable.recipe4};
    int x;
    String s1 ,s2 ,s3 ,s4;

    double recipe1;
double total;

double grandTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        recyclerView = findViewById(R.id.recyclerView);

        Name = getResources().getStringArray(R.array.NameOfRecipe);
        Description = getResources().getStringArray(R.array.Description);

        s1 = getIntent().getExtras().getString("name");
        s2 = getIntent().getExtras().getString("Phone Number");
        s3 = getIntent().getExtras().getString("Email Address");
        s4 = getIntent().getExtras().getString("Gender");

        recipe1 = getIntent().getExtras().getDouble("value");


        Adapter adapter = new Adapter(this, Name , Description , images );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

////////////////////////grandTotal = adapter.

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCheckoutActivity();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
        case R.id.User_Info : Intent intent = new Intent(this, UserActivity.class);

                intent.putExtra("name", s1);
                intent.putExtra("Phone Number" , s2);
                intent.putExtra("Email Address" , s3);
                intent.putExtra("Gender" , s4);
                startActivity(intent);

                break;
            case R.id.action_settings :
                Intent setting = new Intent(this, SettingActivity.class);
                startActivity(setting);

                break;
            case R.id.aboutUs:
                Intent aboutUs = new Intent(this, AboutUsActivity.class);
                startActivity(aboutUs);

        }


        return super.onOptionsItemSelected(item);
    }

    public  void startCheckoutActivity(){
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra("price" ,grandTotal );
        startActivity(intent);

    }
}
