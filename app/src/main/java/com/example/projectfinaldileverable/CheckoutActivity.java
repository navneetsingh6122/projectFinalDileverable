package com.example.projectfinaldileverable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity implements Dialog.SingleChoiceListner{


    TextView price;

    double s1;
    Button shipping;

    double s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        price = (TextView) findViewById(R.id.recipe1);
        s1 = getIntent().getExtras().getDouble("price");

        price.setText(Double.toString(s1));
        shipping = (Button) findViewById(R.id.button3);
        shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment singlechoiceDialog = new Dialog();
                singlechoiceDialog.setCancelable(false);
                singlechoiceDialog.show(getSupportFragmentManager(), "Dilevery options");

            }
        });


    }

    public void openDialog() {
        Dialog exampleDialog = new Dialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");

    }

    @Override
    public void onPositiveButtonClicked(String[] list, int position) {
        Intent intent  = new Intent(this , shippingActivity.class);
        startActivity(intent);


    }

    @Override
    public void onNegativeButtonClicked() {

    }
}

