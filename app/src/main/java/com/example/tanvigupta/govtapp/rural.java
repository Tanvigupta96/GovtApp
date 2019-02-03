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

public class  rural extends AppCompatActivity {

    private ViewFlipper f,f2,f3;
    private CardView c,d,e,k,l,m;
    private Button b1,b2,b3;
    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rural);
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

                alert.setTitle("Pradhan Mantri Gram Sadak Yojana");
                alert.setMessage("Description:-\n" +
                        "Rural Road Connectivity is not only a key component of Rural Development by promoting access to economic and social services and thereby generating increased agricultural incomes and productive employment opportunities in India, it is also as a result, a key ingredient in ensuring sustainable poverty reduction.\n" +
                        "\n"+
                        "Sponsored By:-\n"+
                        "The Pradhan Mantri Gram Sadak Yojana (PMGSY) is a 100% Centrally Sponsored Scheme. \n"+
                        "\n"+
                        "Objective:-\n"+
                        "The PMGSY will permit the Upgradation (to prescribed standards) of the existing roads in those Districts where all the eligible Habitations of the designated population size have been provided all-weather road connectivity. etc..\n "+
                        "\n"+
                        "Planning For Rural Roads:-\n"+
                        "Proper planning is imperative to achieve the objectives of the Programme in a systematic and cost effective manner.etc..\n"+
                        "\n"+
                        "Funding and Allocation:-\n"+
                        "Once the Core Network is prepared, it is possible to estimate the length of roads for New Connectivity as well as Upgradation for every District. States may, each year, distribute the State’s Allocation among the Districts giving 80% on the basis of road length required for providing connectivity to Unconnected Habitations and 20% on the basis of road length requiring Upgradation under the PMGSY.\n"+
                        "\n"+
                        "Launched Year:-\n"+
                        "2000 \n"+
                        "\n"+
                        "Launched By:-\n"+
                        "Atal Bihari Vajpayee\n"+
                        "\n"+
                        "Status:-\n"+
                        "Active"+"\n");
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
                alert.setTitle("Pradhan Mantri Awaas Yojana (Gramin)");
                alert.setMessage("Description:-\n"+
                        "Pradhan Mantri Awas Yojana (PMAY) is an initiative by Government of India in which affordable housing will be provided to the urban poor with a target of building 20 million affordable houses by 31 March 2022.\n"+
                        "\n"+
                        "The Scheme says:-\n"+
                        "Pradhan Mantri Awaas Yojana was launched in June 2015 with an aim to provide affordable housing in urban poor.\n"+
                        "\n"+
                        "Finance:-\n"+
                        "The government has approved an investment of ₹439.22 billion (US$6.1 billion) for construction of 6,83,724 houses for urban poor including central assistance commitment of ₹100.50 billion (US$1.4 billion) by April 2016.\n"+
                        "\n"+
                        "Eligibility Crieteria:-\n"+
                        "Condition for PMAY: (a) Beneficiary max age 70 years, (b) EWS (Economic Weaker Section) annual income Less than Rupees 3 Lac and LIG (Lower Income Group) Annual Income 4,00,000 to 6,00,000 Lac INR as well as Mid Income group since Feb 2017, and (c) The beneficiary should not have an own dwelling unit on the name of any family member in any part of India.[4]\n" +
                        "\n" +
                        "The houses given under this scheme will be owned by females or jointly with males.\n\n"+
                        "Launched Year:-\n"+
                        "25 June 2015; 3 years ago\n"+
                        "\n"+
                        "Status:-\n"+
                        "Active"+"\n");
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
                alert.setTitle("Sansad Adarsh Gram Yojana");
                alert.setMessage("Description:-\n"+
                        "Sansad Adarsh Gram Yojana (SAGY) is a village development project launched by Government of India in October 2014, under which each Member of Parliament will take the responsibility of developing physical and institutional infrastructure in three villages by 2019.\n "+
                        "\n"+
                        "Launched on:-\n"+
                        "11th October, 2014.\n"+
                        "\n"+
                        "Goal:-\n"+
                        "The goal is to develop three Adarsh Grams by March 2019, of which one would be achieved by 2016. Thereafter, five such Adarsh Grams (one per year) will be selected and developed by 2024.\n"+
                        "\n"+
                        "Values of Sansad Adarsh Gram Yogana:-\n"+
                        "1.Adopting people’s participation as an end in itself – ensuring the involvement of all sections of society in all aspects related to the life of village, especially in decision- making related to governance\n" +
                        "2.Adhering to Antyodaya – enabling the “poorest and the weakest person” in the village to achieve well being\n" +
                        "3.Affirming gender equality and ensuring respect for women\n" +
                        "4.Guaranteeing social justice\n" +
                        "5.Instilling dignity of labour and the spirit of community service and voluntarism and many more..\n"+
                        "\n\n"+
                        "Objectives:-\n"+
                        "To trigger processes which lead to holistic development of the identified Gram Panchayats etc..\n"+
                        "\n"+
                        "Status:-\n"+
                        "Active"+"\n");
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
