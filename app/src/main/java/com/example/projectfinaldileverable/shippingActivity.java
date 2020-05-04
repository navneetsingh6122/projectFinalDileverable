package com.example.projectfinaldileverable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shippingActivity extends AppCompatActivity {

    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);

        order=(Button)findViewById(R.id.button4);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goingOrder();
            }
        });
    } public void goingOrder(){
        Intent yoyo=new Intent(this,order.class);
        startActivity(yoyo);

    }
}
