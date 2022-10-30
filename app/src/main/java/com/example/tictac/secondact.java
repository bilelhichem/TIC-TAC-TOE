package com.example.tictac;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondact extends AppCompatActivity {
  TextView p1 , p2 ;
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9 ;
  Integer x  = 1 ;
  Integer y  = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondact);
        p1 = findViewById(R.id.pl1);
        p2 = findViewById(R.id.pl2);
        String b = getIntent().getStringExtra("ply2");
        String a = getIntent().getStringExtra("ply1");
        p1.setText(a);
        p2.setText(b);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           if(b1.getText().toString().equals("")){
                if (x==1) {
                    b1.setText("X");
                    x= 0 ;
                    y = 1 ;
                    p1.setBackgroundResource(R.drawable.myback);
                    p2.setBackgroundResource(R.drawable.myback2);
                }
                else if ( y == 1) {
                    b1.setText("O");
                    x= 1 ;
                    y = 0 ;
                    p1.setBackgroundResource(R.drawable.myback2);
                    p2.setBackgroundResource(R.drawable.myback);

                }}
           else {
               b1.setText(b1.getText());
           }
           verifierx();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")){
                    if (x==1) {
                        b2.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b2.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b2.setText(b2.getText());
                }
                verifierx();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")){
                    if (x==1) {
                        b3.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b3.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b3.setText(b3.getText());
                }
                verifierx();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")){
                    if (x==1) {
                        b4.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b4.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b4.setText(b4.getText());
                }
                verifierx();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")){
                    if (x==1) {
                        b5.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b5.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b5.setText(b5.getText());
                }
                verifierx();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")){
                    if (x==1) {
                        b6.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b6.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b6.setText(b6.getText());
                }
                verifierx();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")){
                    if (x==1) {
                        b7.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b7.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b7.setText(b7.getText());
                }
                verifierx();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")){
                    if (x==1) {
                        b8.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b8.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b8.setText(b8.getText());
                }
                verifierx();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")){
                    if (x==1) {
                        b9.setText("X");
                        x= 0 ;
                        y = 1 ;
                        p1.setBackgroundResource(R.drawable.myback);
                        p2.setBackgroundResource(R.drawable.myback2);
                    }
                    else if ( y == 1) {
                        b9.setText("O");
                        x= 1 ;
                        y = 0 ;
                        p1.setBackgroundResource(R.drawable.myback2);
                        p2.setBackgroundResource(R.drawable.myback);

                    }}
                else {
                    b9.setText(b9.getText());
                }
                verifierx();
            }
        });

    }


    public void init(){
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
    }

    public void cardx(){
        AlertDialog.Builder dlg = new AlertDialog.Builder(secondact.this);
        dlg.setTitle(" THE  WINNER IS");
        dlg.setMessage("ply1");
        dlg.setPositiveButton("RESTARE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                x = 1 ;
                y = 0 ;
            dialogInterface.dismiss();


            }
        });

        dlg.show();

    }

    public void cardo(){
        AlertDialog.Builder dlg = new AlertDialog.Builder(secondact.this);
        dlg.setTitle(" THE  WINNER IS");
        dlg.setMessage("ply2");
        dlg.setPositiveButton("RESTARE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                x = 1 ;
                y = 0 ;
                dialogInterface.dismiss();
            }
        });
        dlg.show();
    }

    public void cardnil(){
        AlertDialog.Builder dlg = new AlertDialog.Builder(secondact.this);
        dlg.setTitle(" NIL  ");
        dlg.setMessage("-_- -_- -_-");
        dlg.setPositiveButton("RESTARE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                x = 1 ;
                y = 0 ;
                dialogInterface.dismiss();
            }
        });
        dlg.show();
    }




    public void verifierx(){
        if (b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X") ){cardx();}
        else if (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) {cardx();}
        else if (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")){cardx();}
        else if (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X")){cardx();}
        else if (b7.getText().toString().equals("X")  && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")){cardx();}
        else if (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")){cardx();}
        else if (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")){cardx();}
        else if (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X") ){cardx();}
        else if (b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O") ){cardo();}
        else if (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) {cardo();}
        else if (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")){cardo();}
        else if (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O")){cardo();}
        else if (b7.getText().toString().equals("O")  && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")){cardo();}
        else if (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")){cardo();}
        else if (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")){cardo();}
        else if (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O") ){cardo();}
        else if (b1.getText().toString().toString() != "" && b2.getText().toString().toString() != "" && b3.getText().toString().toString() != "" && b4.getText().toString().toString() != "" && b5.getText().toString().toString() != ""
       && b6.getText().toString().toString() != "" && b7.getText().toString().toString() != "" && b8.getText().toString().toString() != "" && b9.getText().toString().toString() != ""
        ){cardnil();}
    }





}