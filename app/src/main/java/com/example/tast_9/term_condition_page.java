package com.example.tast_9;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class term_condition_page extends AppCompatActivity {
    Toolbar toolbar;
    Button btn;
    TextView tv1;
    String s1;
    DrawerLayout drawer;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_condition_page);
        drawer=findViewById(R.id.drawer);
        tv1=findViewById(R.id.te1);
        toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_dehaze);

        Intent intent=getIntent();
        String s1=intent.getStringExtra("Email");
        tv1.setText(s1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(term_condition_page.this,Home_page.class);
                startActivity(intent);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder=new AlertDialog.Builder(term_condition_page.this);
                        builder.setTitle("Alert");
                        builder.setMessage("Are You Sure You Want To Exit?");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(term_condition_page.this,login_Fragment.class);
                                startActivity(intent);
                                onBackPressed();
                            }
                        });
                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        builder.show();


                    }
                });
            }
        });











        }
}