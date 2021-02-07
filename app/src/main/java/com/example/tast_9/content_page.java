package com.example.tast_9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class content_page extends AppCompatActivity {
    BottomNavigationView b1;

    androidx.fragment.app.Fragment f1=null;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_page);

        toolbar=findViewById(R.id.tool_bar);

        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);




        b1=findViewById(R.id.b1);
        b1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.m1:

                        f1=new Fragment1();
                        FragmentManager manager=getSupportFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        transaction.replace(R.id.f1,f1);
                        transaction.commit();
                        break;
                    case R.id.m2:

                        f1=new Fragment2();
                        FragmentManager manager1=getSupportFragmentManager();
                        FragmentTransaction transaction1=manager1.beginTransaction();
                        transaction1.replace(R.id.f1,f1);
                        transaction1.commit();
                        break;





                }
                return true;

            }
        });


    }
}