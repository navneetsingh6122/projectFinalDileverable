package com.example.projectfinaldileverable;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.lang.reflect.Array;

public class Dialog extends DialogFragment {

    int position = 0;
    public interface SingleChoiceListner{
        void onPositiveButtonClicked(String[] list , int position);
        void onNegativeButtonClicked();
    }

    SingleChoiceListner mListner;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
        mListner = (SingleChoiceListner) context;}
        catch (Exception e){
            e.printStackTrace();
            throw new ClassCastException(getActivity().toString() + " SingleChoiceListner must implemented");
        }
    }

    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder  builder = new AlertDialog.Builder(getActivity());
final String[] list = getActivity().getResources().getStringArray(R.array.chooseDeliveryMethos);
builder.setTitle("Click your Dilevery Method")
        .setSingleChoiceItems(list, position, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                position=which;

            }
        })
        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

mListner.onPositiveButtonClicked(list,position);

            }
        });
       /* .setPositiveButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
mListner.onNegativeButtonClicked();
            }
        });*/
return builder.create();
    }

}
