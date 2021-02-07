package com.example.tast_9;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;


public class login_Fragment extends Fragment {

    Button log_in;
    Button Register;
    EditText Email;
    String s1;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login_, container, false);
        Email=view.findViewById(R.id.Email);

        log_in = view.findViewById(R.id.log_in);
        Register= view.findViewById(R.id.Register);



        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Dont have an account,sign_up First",Toast.LENGTH_SHORT).show();
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),term_condition_page.class);

                startActivity(intent);
                s1=Email.getText().toString();
                intent.putExtra("Email",Email.getText().toString());
                startActivity(intent);
            }

        });


        return view;

    }
}