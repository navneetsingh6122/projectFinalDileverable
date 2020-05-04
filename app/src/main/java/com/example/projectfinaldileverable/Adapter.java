package com.example.projectfinaldileverable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    String data1[], data2[];

    int images[];
    Context context;

    double recipe1_2p;
    double recipe1_4p;
    double recipe2_2p;
    double recipe2_4p;
    double recipe3_2p;
    double recipe3_4p;
    double recipe4_2p;
    double recipe4_4p;



    double good1 ;
    double good2;
    double good3;
    double good4;


    public Adapter(Context ct, String Name[], String Description[], int img[]) {
        context = ct;
        data1 = Name;
        data2 = Description;
        images = img;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(context);
        View view = inflator.inflate(R.layout.recycler_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImageView.setImageResource(images[position]);



    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myText1, myText2;
        ImageView myImageView;
        Button button2p, button4p , buttonCancel;
        TextView price;
        TextView total;

        Button moreInformation;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myTextView1);
            myText2 = itemView.findViewById(R.id.myTextView2);
            myImageView = itemView.findViewById(R.id.imageView);
            button2p = (Button) itemView.findViewById(R.id.button_2p);
            button4p = (Button) itemView.findViewById(R.id.button_4p);
            price = (TextView) itemView.findViewById(R.id.price_textView);
            buttonCancel = (Button)itemView.findViewById(R.id.recipe_cancel);

            moreInformation = (Button)itemView.findViewById(R.id.more_information);

            button2p.setOnClickListener(this);
            button4p.setOnClickListener(this);
            moreInformation.setOnClickListener(this);
            buttonCancel.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            if (v.getId() == button2p.getId()) {
                if (getAdapterPosition() == 0) {
                    recipe1_2p = 9.99;
double recipe1 = 9.99;
 good1 = recipe1;
                    price.setText(Double.toString(recipe1_2p));



                } else if (getAdapterPosition() == 1) {
                    recipe2_2p = 24.85;
                    price.setText(Double.toString(recipe2_2p));
                    good2 = 24.85;

                } else if (getAdapterPosition() == 2) {
                    recipe3_2p = 12.59;
                    price.setText(Double.toString(recipe3_2p));
                    good3 = 12.59;
                } else if (getAdapterPosition() == 3) {
                    recipe4_2p = 15.99;
                    price.setText((Double.toString(recipe4_2p)));


                }
            }
            else if(v.getId() == button4p.getId()){

              switch (getAdapterPosition()){

                  case 0:
                      recipe1_4p=16.99;
                      price.setText(Double.toString(recipe1_4p));
                      good1 = 16.99;

                      break;

                  case 1:
                      recipe2_4p = 50.49;
                      price.setText(Double.toString(recipe2_4p));
                      good2 = 50.49;

                  break;
                  case 2:
                      recipe3_4p = 21.99;
                       good3= 21.99;
                      price.setText(Double.toString(recipe3_4p));
                  break;
                  case 3:
                      recipe4_4p = 32.99;
                      price.setText(Double.toString(recipe4_4p));
                      good4 = 32.99;
                  break;
                  default:

              }

            }else if (v.getId() == buttonCancel.getId()) {
                if (getAdapterPosition() == 0) {

                    price.setText(Integer.toString(0));

                } else if (getAdapterPosition() == 1) {

                    price.setText(Integer.toString(0));

                } else if (getAdapterPosition() == 2) {

                    price.setText(Integer.toString(0));

                } else if (getAdapterPosition() == 3) {

                    price.setText((Integer.toString(0)));


                }
            }
            else if(v.getId() == moreInformation.getId()){
             switch (getAdapterPosition()){

                 case 0:
                     Intent intent  = new Intent(context,Recipe1.class);
                     context.startActivity(intent);
                     break;
                 case 1:
                     Intent intent2 = new Intent(context,Recipe2.class);
                     context.startActivity(intent2);
                     break;
                 case 2:
                     Intent intent3 = new Intent(context, Recipe3.class);
                     context.startActivity(intent3);
                     break;
                 case 3:
                     Intent intent4 = new Intent (context, Recipe4.class);
                     context.startActivity(intent4);
                     break;

                     default:break;
             }

            }

        }
    }







    double goodTotal;
    public double getTotalMoney(){
        goodTotal = good1+good2+good3 + good4;
        return goodTotal;
    }

}