package com.example.tast_9;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class Fragment2 extends Fragment {
    ProgressBar progress;
    Button b1;
    ImageSlider image_slider;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View view= inflater.inflate(R.layout.fragment_2, container, false);
        image_slider=view.findViewById(R.id.image_slider);
        List<SlideModel> imageLIst=new ArrayList<>();
        imageLIst.add(new SlideModel(R.drawable.image50, ScaleTypes.FIT));
        imageLIst.add(new SlideModel(R.drawable.image51, ScaleTypes.FIT));
        imageLIst.add(new SlideModel(R.drawable.image52, ScaleTypes.FIT));
        image_slider.setImageList(imageLIst,ScaleTypes.FIT);
        b1=view.findViewById(R.id.b1);

        progress=view.findViewById(R.id.progress);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
               b1.setText("downloading....");
               progress.setVisibility(view.VISIBLE);
               new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                   @Override
                   public void run() {
                       b1.setText("Download Complete");
                       progress.setVisibility(View.INVISIBLE);

                   }
               }, 4000);
            }
        });


        return view;

    }
}