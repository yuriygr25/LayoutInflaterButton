package com.example.yura.layoutinflaterbutton;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        builder= new AlertDialog.Builder(MainActivity.this,R.style.AppCompatAlertDialogStyle).setMessage("Текст діалогу")
        .setPositiveButton("OK",null).create();

        //        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.AppCompatAlertDialogStyle);
//        View content = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_button, null);
        View content = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_button, null);

        builder.setTitle("Mій діалог");
        builder.setView(content);
        //builder.setPositiveButton("OK", null);
        builder.getWindow().setBackgroundDrawableResource(R.color.greenColor);

/*
        TextView mInfoTextView;
        mInfoTextView = (TextView) findViewById(R.id.textView);
        mInfoTextView.setText("Бред");
*/

        builder.show();
    }

}
