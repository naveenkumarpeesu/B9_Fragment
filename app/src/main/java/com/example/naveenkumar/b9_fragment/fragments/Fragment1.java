package com.example.naveenkumar.b9_fragment.fragments;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.naveenkumar.b9_fragment.R;
import com.example.naveenkumar.b9_fragment.interfaces.FragmentCallback;

import java.util.zip.Inflater;

/**
 * Created by Naveenkumar on 11/9/2015.
 */
public class Fragment1 extends Fragment {

    private Button replaceBtn;
    private FragmentCallback fragmentCallback;

    public Fragment1(FragmentCallback fragmentCallback){
        this.fragmentCallback =fragmentCallback;
    }

    @Override
   public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment1_layout,container,false);

        replaceBtn= (Button)view.findViewById(R.id.replaceBtn);
        return view;

    }

    @Override
    public void onResume(){
        super.onResume();
        replaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentCallback.buttonIsClicked();

            }
        });
    }



}
