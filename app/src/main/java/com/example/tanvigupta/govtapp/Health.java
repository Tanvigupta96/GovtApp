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

public class Health extends AppCompatActivity {
    private ViewFlipper f,f2,f3;
    private CardView c,d,e,k,l,m;
    private Button b1,b2,b3;
    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
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

                alert.setTitle("Pradhan Mantri Swasthya Suraksha Yojana (PMSSY)");
                alert.setMessage("Description:-\n"+
                        "The Pradhan Mantri Swasthya Suraksha Yojana (PMSSY) was announced in 2003 with objectives of correcting regional imbalances in the availability of affordable/ reliable tertiary healthcare services and also to augment facilities for quality medical education in the country.\n"+
                        "\n"+
                        "Launched Year:-\n"+
                        "2003\n"+
                        "\n"+
                        "Provisions:-\n"+
                        "Correcting regional imbalances in the availability of affordable and reliable tertiary healthcare services and also to augment facilities for quality medical education in the country.\n"+
                        "\n"+
                        "Approval:-\n"+
                        "The scheme was approved in March 2006.\n"+
                        "\n"+
                        "Project Cost:-\n"+
                        "The project cost for upgradation of each medical college institution has been estimated at Rs. 150 crores per institution, out of which Central Government will contribute Rs. 125 crores and the remaining Rs. 25 crore will be borne by the respective State Governments.\n"+
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
                alert.setTitle("National Rural Health Mission(NRHM)");
                alert.setMessage("Description:-\n"+
                        "The National Rural Health Mission (NRHM) was launched on 12th April 2005, to provide accessible, affordable and quality health care to the rural population, especially the vulnerable groups.\n"+
                        "\n"+
                        "Launched Year:-\n"+
                        "2005"+
                        "\n"+
                        "Objective:-\n"+
                        "Under the NRHM, the Empowered Action Group (EAG) States as well as North Eastern States, Jammu and Kashmir and Himachal Pradesh have been given special focus. The thrust of the mission is on establishing a fully functional, community owned, decentralized health delivery system with inter-sectoral convergence at all levels, to ensure simultaneous action on a wide range of determinants of health such as water, sanitation, education, nutrition, social and gender equality.\n"+
                        "\n\n"+
                        "Initiatives:-\n"+
                        "Some of the major initiatives under National Health Mission (NHM) are as follows:\n"+
                        "1.Accredited Social Health Activists\n"+
                        "2.Rogi Kalyan Samiti (Patient Welfare Committee) / Hospital Management Society\n"+
                        "3.Untied Grants to Sub-Centres\n"+
                        "4.Health care contractors\n"+
                        "5.National Mobile Medical Units (NMMUs)\n"+
                        "6.National Ambulance Services\n"+
                        "7.Janani Shishu Suraksha Karyakram (JSSK)\n"+
                        "8.Rashtriya Bal Swasthya Karyakram (RBSK) and many more..\n"+
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
                alert.setTitle("Rashtriya Swasthya Bima Yojana");
                alert.setMessage("Description:-\n"+
                       "\n" +
                        "Rashtriya Swasthya Bima Yojana (RSBY) is a government-run health insurance programme for the Indian poor.It provides for cashless insurance for hospitalisation in public as well as private hospitals.\n"+
                        "\n"+
                        "Launched Year:-\n"+
                        "1 April 2008; 10 years ago"+
                        "\n"+
                        "Objective:-\n"+
                        "The scheme aims to provide health insurance coverage to the unrecognised sector workers belonging to the BPL category and their family members shall be beneficiaries under this scheme."+
                        "\n\n"+
                        "The Scheme:-\n"+
                        "In the Union Budget for 2012-13, the government made a total allocation of ₹1,096.7 crore (US$150 million) towards RSBY. Although meant to cover the entire BPL population, (about 37.2 per cent of the total Indian population according to the Tendulkar committee estimates) it had enrolled only around 10 per cent of the Indian population by March 31, 2011. Also, it is expected to cost the exchequer at least ₹3,350 crore (US$470 million) a year to cover the entire BPL population.\n"+
                        "\n"+
                        "Success:-\n"+
                        "One of the big changes that this scheme entails is bringing investments to unserved areas. Most private investments in healthcare in India have been focused on tertiary or specialized care in urban areas. However, with RSBY coming in, the scenario is changing. New age companies like Glocal Healthcare Systems, a company based out of Kolkata and funded by Tier I Capital Funds like Sequoia Capital and Elevar Equity are setting up State of Art Hospitals in Semi Urban - rural settings. This trend can create the infrastructure that India's healthcare system desperately needs.\n"+
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

