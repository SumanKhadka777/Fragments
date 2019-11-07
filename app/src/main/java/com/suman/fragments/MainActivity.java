package com.suman.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.suman.fragments.fragments.FirstFragment;
import com.suman.fragments.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    private Boolean status=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.btnFragment);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if (status){
            FirstFragment  firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.LinearLayout,firstFragment);
            fragmentTransaction.commit();
            btn.setText("Load Second Fragment");
            status=false;




        }
        else {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.LinearLayout,secondFragment);
            fragmentTransaction.commit();
            btn.setText("Load First Fragment");
            status=true;


        }

    }
}
