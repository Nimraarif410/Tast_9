package com.example.tast_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class Tab_Activity extends AppCompatActivity {
    TabLayout tab_id;
    FrameLayout frg_id;
    Fragment f=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_tab_);
        frg_id=findViewById(R.id.frg_id);
        tab_id=findViewById(R.id.tab_id);

        f=new login_Fragment();

        TabLayout.Tab firsttab=tab_id.newTab();
        firsttab.setText("Login" );

        TabLayout.Tab Secondtab=tab_id.newTab();
        Secondtab.setText("SignUp");

        tab_id.addTab(firsttab);
        tab_id.addTab(Secondtab);



        tab_id.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        f=new login_Fragment();
                        break;
                    case 1:
                        f=new SignUp_Fragment();
                        break;

                }
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frg_id,f);
                ft.commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });
    }
}