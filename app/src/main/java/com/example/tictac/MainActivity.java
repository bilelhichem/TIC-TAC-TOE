package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText ply1,ply2 ;
  Button start ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ply1 = findViewById(R.id.ply1) ;
        ply2 = findViewById(R.id.ply2);
        start = findViewById(R.id.btnstart);
        start.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
          String x = ply1.getText().toString();
          String y =ply2.getText().toString() ;
              Intent i = new Intent(MainActivity.this,secondact.class);
                 i.putExtra("ply1",x);
                 i.putExtra("ply2",y);
                 startActivity(i);
                 finish();

          }
      });


    }



}