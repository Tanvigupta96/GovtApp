package com.example.tanvigupta.govtapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class Communication extends AppCompatActivity implements View.OnClickListener {

    private ViewFlipper f,f2,f3;
    private CardView c,d,e,k,l,m;
    private Button b1,b2,b3;
    private AlertDialog.Builder alert;
    private ImageButton documentation1,share1,documentation2,share2,documentation3,share3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

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
        documentation1=findViewById(R.id.documentation1);
        share1=findViewById(R.id.share1);
        documentation2=findViewById(R.id.documentation2);
        share2=findViewById(R.id.share2);
        documentation3=findViewById(R.id.documentation3);
        share3=findViewById(R.id.share3);
        documentation1.setOnClickListener(this);
        share1.setOnClickListener(this);
        documentation2.setOnClickListener(this);
        share2.setOnClickListener(this);
        documentation3.setOnClickListener(this);
        share3.setOnClickListener(this);

        alert = new AlertDialog.Builder(this);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert.setTitle("R & D Funding Scheme for Instutions Organisations");
                alert.setMessage("Description:-\n" +
                        "Funds are provided under this scheme (Grant-in-Aid) to institutions/ organisations in the area of research and development, for technical collaboration, etc.\n" +
                        "\n" +
                        "Sponsored By:-\n" +
                        "Central Government of India\n" +
                        "\n" +
                        "Objective:-\n" +
                        "To grant to institutions, organisations for R&D, technical collaboration, etc.\n" +
                        "\n" +
                        "Eligibility:-\n" +
                        "Any institution/firm with atleast 2 years after incorporation, must be registered under ISO 9001/13485 is eligible.\n" +
                        "\n"  +
                        "Benefits:\n" +
                        "Financial assistance for R& D projects (Funding varies based on the total cost of project)\n" +
                        "\n" +
                        "How To Apply:-\n" +
                        "A Udyami Helpline: Dial 1800-180-6763 [Toll Free Number] for queries relating to this Schemes.\n" +
                        "\n" +
                        "Contact to:-\n" +
                        "\n" +
                        "To DeitY (Department of Electronics and Information Technology)\n" +
                        "\n" +
                        "Status:-\n" +
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
                alert.setTitle("TIDE Scheme");
                alert.setMessage("Technology Incubation and Development of Entrepreneurs (TIDE) Scheme \n\n" +
                        "Ministry:-\n" +
                        "Ministry of Communication and Information Technology Schemes\n" +
                        "\n" +
                        "Description:-\n" +
                        "Institutions of higher learning to strengthen their Technology Incubation Centres and thus enable young entrepreneurs to initiate technology start-up companies for commercial exploitation of technologies. The schemes aims to assist institutions of higher learning to strengthen them Technology Incubation Centres and enable young entrepreneurs to initiate technology start-up companies for commercial exploitation of technologies developed by them. TIDE Incubation Centres provide a gamut of services to new enterprises and facilitate linkages congenial for their survival and growth. The centres network with angel investors and venture capitalists who provide mentoring and financial support to start-ups and enable tenant companies to mature over a period of 2-3 years and ultimately graduate to a commercial place to transact actual business.\n" +
                        "\n" +
                        "\n" +
                        "DeiTY is providing financial and policy support for strengthening technology incubation activities on the premise that this would, in the long run, result in indigenous development of products and packages in the ICT sector.\n" +
                        "\n" +
                        "Sponsored By:-\n" +
                        "Central Government of India\n" +
                        "\n" +
                        "Objective:-\n" +
                        "the objectives of this scheme are as:\n" +
                        "\n" +
                        "1. To set up/strengthen the Technology Incubation Centres and thus nurture technology entrepreneurship development\n" +
                        "2. To promote a product oriented research and development\n" +
                        "3. To encourage and accelerate the development of indigenous products and packages\n" +
                        "4. To bridge the gap between R&D and commercialisation.\n\n" +
                        "Eligibility:-\n" +
                        "Entrepreneurs\n" +
                        "\n" +
                        "Beneficiaries:-\n" +
                        "Entrepreneurs\n" +
                        "\n" +
                        "Benefits:-\n" +
                        "Each TIDE centre would be given financial support as Grant-in-aid of up to Rs.155 lakh, payable in instalments. These funds can be used for infrastructure improvement– up to Rs.30 lakh and for providing financial support to incubating companies – Rs.125 lakh (@ Rs.25 lakh per company). The grants under the proposed scheme would be subject to terms & conditions. DeitYwould constitutes a Project Review and Steering Group (PRSG). The release of funds to the HI/TIDE will be made based on the recommendations of PRSG.\n" +
                        "\n" +
                        "How To Apply:-\n" +
                        "A Udyami Helpline: Dial 1800-180-6763 [Toll Free Number] for queries relating to this Schemes.\n" +
                        "\n" +
                        "Status:-\n" +
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
                alert.setTitle("MG scheme");
                alert.setMessage("Multiplier Grants(MG Scheme) industry-institute\n\n"+
                        "Ministry:-\n" +
                        "Ministry of Communication and Information Technology Schemes\n" +
                        "\n" +
                        "Description:-\n" +
                        "Under the scheme, if the industry supports R&D for development of products that can be commercialised at institutional level, then the government will also provide financial support that is up to twice the amount provided by industry. The industry and institutions jointly have to submit the proposals for getting financial support under this scheme\n" +
                        "\n" +
                        "\n" +
                        "In this scheme, if an industry supports innovation at institute(s) and commits its resources.\n" +
                        "\n" +
                        "Government grants, for individual industry, would be limited to a maximum of Rs.2 crore per project; and the duration of each project should, preferably, be less than 2 years; for an industry consortium these would be Rs.4 crore and 3 years respectively. The contribution of industry and grant-in-aid from DeitYwill be given to academic/R&D institution(s) only.\n" +
                        "\n" +
                        "Sponsored By:-\n" +
                        "Central Government of India\n" +
                        "\n" +
                        "Objective:-\n" +
                        "Broad objectives:\n" +
                        "\n" +
                        "1. To strengthen the industry-institute linkages\n" +
                        "2. To encourage and accelerate the development of indigenous products/packages\n" +
                        "3. To bridge the gap between R&D and commercialisation\n\n" +
                        "Eligibility:-\n" +
                        "Industry and academic institutions are eligible.\n" +
                        "\n" +
                        "Beneficiaries:-\n" +
                        "Industry and academic institutions\n" +
                        "\n" +
                        "Benefits:-\n" +
                        "Grant for projects of less than 2 years duration, with a limit of Rs.2 crore, are given to the beneficiary.\n" +
                        "\n" +
                        "How To Apply:-\n" +
                        "A Udyami Helpline: Dial 1800-180-6763 [Toll Free Number] for queries relating to this Schemes.\n" +
                        "\n" +
                        "Contact to:-\n" +
                        "\n" +
                        "To Department of Electronics and Information Technology\n" +
                        "\n" +
                        "Status:-\n" +
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

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.documentation1){
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("http://www.dst.gov.in/general-information-research-and-development-funding-schemes-central-government-departments-agencies");
            intent.setData(uri);
            startActivity(intent);

        }
        else if(v.getId()==R.id.share1){
            ArrayList<String> data=new ArrayList<>();
            data.add("R & D Funding scheme");
            data.add("http://www.dst.gov.in/general-information-research-and-development-funding-schemes-central-government-departments-agencies");
            String data1= TextUtils.join("\n",data);
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,data1);
            startActivity(intent);

        }
        else if(v.getId()==R.id.documentation2){
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("http://meity.gov.in/content/technology-incubation-and-development-entrepreneurs");
            intent.setData(uri);
            startActivity(intent);

        }
        else if(v.getId()==R.id.share2){
            ArrayList<String> data=new ArrayList<>();
            data.add("TIDE schemes");
            data.add("http://meity.gov.in/content/technology-incubation-and-development-entrepreneurs");
            String data1= TextUtils.join("\n",data);
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,data1);
            startActivity(intent);


        }
        else if(v.getId()==R.id.documentation3){
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("https://www.mapsofindia.com/my-india/government/mnrega-progress-made-by-modi-government-in-one-year");
            intent.setData(uri);
            startActivity(intent);
        }
        else if(v.getId()==R.id.share3){
            ArrayList<String> data=new ArrayList<>();
            data.add(" MG Schemes");
            data.add("https://www.mapsofindia.com/my-india/government/mnrega-progress-made-by-modi-government-in-one-year");
            String data1= TextUtils.join("\n",data);
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,data1);
            startActivity(intent);

        }



    }
}
