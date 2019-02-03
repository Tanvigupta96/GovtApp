package com.example.tanvigupta.govtapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Education extends AppCompatActivity {

    private ViewFlipper f,f2,f3;
    private CardView c,d,e,k,l,m;
    private Button b1,b2,b3;
    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        f = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);

        c = findViewById(R.id.card_view);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p();
            }
        });
        d=findViewById(R.id.card_view3);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1();
            }
        });
        e=findViewById(R.id.card_view5);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2();
            }
        });
        k=findViewById(R.id.card_view1);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3();
            }
        });
        l=findViewById(R.id.card_view4);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p4();
            }
        });
        m=findViewById(R.id.card_view6);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p5();
            }
        });

        alert = new AlertDialog.Builder(this);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert.setTitle("Scheme name");
                alert.setMessage("Scheme description");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                final AlertDialog dialog = alert.create();
                dialog.show();
            }
        });
        final Intent i2 = new Intent(this,LoginActivity.class);
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.setTitle("Scheme name");
                alert.setMessage("Scheme description");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                final AlertDialog dialog = alert.create();
                dialog.show();
            }
        });
        b3=findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.setTitle("Scheme name");
                alert.setMessage("Scheme description");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                final AlertDialog dialog = alert.create();
                dialog.show();
            }
        });

    }
    public void p()
    {
        f.setInAnimation(this,R.anim.in_left);
        f.setOutAnimation(this,R.anim.out_right);
        f.showNext();
    }
    public void p1()
    {
        f2.setInAnimation(this,R.anim.in_left);
        f2.setOutAnimation(this,R.anim.out_right);
        f2.showNext();
    }
    public void p2()
    {
        f3.setInAnimation(this,R.anim.in_left);
        f3.setOutAnimation(this,R.anim.out_right);
        f3.showNext();
    }
    public void p3()
    {
        f.setInAnimation(this,R.anim.in_left);
        f.setOutAnimation(this,R.anim.out_right);
        f.showPrevious();
    }
    public void p4()
    {
        f2.setInAnimation(this,R.anim.in_left);
        f2.setOutAnimation(this,R.anim.out_right);
        f2.showPrevious();
    }
    public void p5()
    {
        f3.setInAnimation(this,R.anim.in_left);
        f3.setOutAnimation(this,R.anim.out_right);
        f3.showPrevious();
    }
}
