package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView txtView;

        txtView= findViewById(R.id.textView1);
        txtView.setText(R.string.Msg1);


        txtView= findViewById(R.id.textView1);
        txtView.setText(R.string.Msg2);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message,duration);
                toast.show();

                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);


            }

        });





    }
    public void openActivity2(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }




}