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

public class Commercial extends AppCompatActivity {

    private ViewFlipper f,f2,f3;
    private CardView c,d,e,k,l,m;
    private Button b1,b2,b3;
    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial);

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

                alert.setTitle("Scheme for Leather Industries");
                alert.setMessage("Ministry:-\n" +
                        "Ministry of commerce & industry\n" +
                        "\n" +
                        "Description:-\n" +
                        "This scheme aims to provide world class infrastructure to integrate the production chain in a manner that caters to the business needs of leather industry.\n" +
                        "\n" +
                        "\n" +
                        "Sponsored By:-\n" +
                        "Central Government of India\n" +
                        "\n" +
                        "Objective:-\n" +
                        "To Provide infrastructure to meet the business needs of leather industry\n" +
                        "\n" +
                        "Eligibility:-\n" +
                        "Production units of all segments namely footwear, footwear components, leather goods (including gloves), leather garments & saddlery & harness items are eligible under this scheme.\n" +
                        "\n"  +
                        "Benefits:-\n" +
                        "The total project cost for the purpose of the Mega Leather Cluster sub-scheme comprises the cost of land development, infrastructure, capacity building and engagement of consultant by the SPV. GoI assistance can be up to 50% of project cost, subject to limitations as follows, depending on total land area of the MLC:\n" +
                        "\n" +
                        "1. MLC of 25-60 acres land (to be set up without tanneries)\n" +
                        "2. Land (to be set up with tanneries) - GoI assistance limited to Rs.50 crore\n" +
                        "3. MLC of 61-100 acres land - GoI assistance limited to Rs.70 crore\n" +
                        "4. MLC of 101-150 acres land - GoI assistance limited to Rs.105 crore\n" +
                        "5. MLC of more than 151 acres land - GoI assistance limited to Rs.125 crore.\n" +
                        "How To Apply:-\n" +
                        "A Udyami Helpline: Dial 1800-180-6763 [Toll Free Number] for queries relating to this Schemes.\n" +
                        "\n" +
                        "Contact to:-\n" +
                        "\n" +
                        "To the Department Of Industrial Policy & Promotion\n\n" +
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
                alert.setTitle("Scheme for Small &amp; Medium Exporters");
                alert.setMessage("Ministry:-\n" +
                        "Ministry of commerce & industry\n" +
                        "\n" +
                        "Description:-\n" +
                        "The policy particularly provides SME sector easy administrative and operational convenience.\n" +
                        "\n" +
                        "Sponsored By:-\n" +
                        "Central Government of India\n" +
                        "\n" +
                        "Objective:-\n" +
                        "To provide ease and convenience to SMEs\n" +
                        "\n" +
                        "Eligibility:-\n" +
                        "Exporters engaged in manufacturing activities having invested in plant and machinery or engaged in export of services having invested in equipment are eligible to avail the benefits under this scheme.\n" +
                        "\n"  +
                        "Benefits:-\n" +
                        "An insurance policy for small and medium exporters issued for a period of 12 months with 90% coverage and with a maximum loss limit of Rs.10 lakh is given to beneficiaries.\n" +
                        "\n" +
                        "How To Apply:-\n" +
                        "A Udyami Helpline: Dial 1800-180-6763 [Toll Free Number] for queries relating to this Schemes.\n" +
                        "\n" +
                        "Contact to:-\n" +
                        "\n" +
                        " To the nearest branch office of the corporation.\n\n" +
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
                alert.setTitle("Scheme for Small Exporters Policy");
                alert.setMessage("Ministry:-\n" +
                        "Ministry of commerce & industry\n" +
                        "\n" +
                        "Description:-\n" +
                        "This is a basically Standard Policy, incorporating certain improvements in terms of cover, in order to encourage small exporters to obtain and operate the policy. It is issued to exporters whose anticipated export turnover for the period of one year does not exceed Rs.5 crore. The maximum liability shall not exceed Rs.2 crore. The nature of commercial risks and political risks cover is similar to that of the Shipment Comprehensive Risk (SCR) or standard policy.\n" +
                        "\n" +
                        "\n" +
                        "Sponsored By:-\n" +
                        "Central Government of India\n" +
                        "\n" +
                        "Objective:-\n" +
                        "For exporters with anticipated export turnover below Rs.5 crore, for one year; standard policy with certain improvements\n" +
                        "\n" +
                        "It aims to provide financial assistance to exporters.\n" +
                        "\n" +
                        "Eligibility:-\n" +
                        "Exporters whose anticipated export turnover for the period of one year does not exceed Rs.5 crore are eligible.\n" +
                        "\n" +
                        "Beneficiaries:-\n" +
                        "Exporters\n" +
                        "\n" +
                        "Benefits:-\n" +
                        "An insurance policy for small exporters issued for a period of 12 months\n" +
                        "\n" +
                        "How To Apply:-\n" +
                        "A Udyami Helpline: Dial 1800-180-6763 [Toll Free Number] for queries relating to this Schemes.\n" +
                        "\n" +
                        "Contact to:-\n" +
                        "\n" +
                        " To the nearest branch office of the corporation.\n\n" +
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
}
