package com.example.tanvigupta.govtapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;
    private TextView loginemail;
    private String login,com;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        onFragmentInteraction();
        //get firebase auth instance
        auth=FirebaseAuth.getInstance();

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        loginemail=findViewById(R.id.Loginemail);

        Intent intent=getIntent();
        login= intent.getStringExtra("email");


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.notification) {

        }else{
            if(id==R.id.signout){
                AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>(){
                    public void onComplete(@NonNull Task<Void> task)
                    {
                        startActivity(new Intent(MainActivity.this,SplashActivity.class));
                        finish();
                    }
                });
                Toast.makeText(this,"You have been signed out",Toast.LENGTH_SHORT).show();

                }

        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.schemes) {
            Schemes schemes = new Schemes();
            fragmentTransaction.add(R.id.frag,schemes);
            fragmentTransaction.commit();
            onFragmentInteraction();
        } else if (id == R.id.login) {
            //  loginemail.setText(login);
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        } else if (id == R.id.discuss) {


        } else if (id == R.id.latest) {

        } else if (id == R.id.complaintbox){
           Intent my = new Intent(this,Complaint.class);
           startActivity(my);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void onFragmentInteraction(){

        Button btn1 = findViewById(R.id.btn1);
        final Intent my = new Intent(this,Communication.class);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my);
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        final Intent my1 = new Intent(this,Commercial.class);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my1);
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        final Intent my2 = new Intent(this,Rural.class);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my2);
            }
        });

        Button btn4 = findViewById(R.id.btn4);
        final Intent my3 = new Intent(this,Health.class);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my3);
            }
        });

        Button btn5 = findViewById(R.id.btn5);
        final Intent my4 = new Intent(this,Education.class);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my4);
            }
        });

        Button btn6 = findViewById(R.id.btn6);
        final Intent my5 = new Intent(this,Transport.class);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my5);
            }
        });

    }



}
