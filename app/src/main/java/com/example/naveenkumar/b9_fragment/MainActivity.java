package com.example.naveenkumar.b9_fragment;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.naveenkumar.b9_fragment.fragments.Fragment1;
import com.example.naveenkumar.b9_fragment.fragments.Fragment2;
import com.example.naveenkumar.b9_fragment.interfaces.FragmentCallback;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment1 fragment1 =new Fragment1(fragmentCallback);
        android.support.v4.app.FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();

        transaction.commit();

    }

  FragmentCallback fragmentCallback =new FragmentCallback() {
      @Override
      public void buttonIsClicked() {
          Fragment2 fragment2 =new Fragment2();
          android.support.v4.app.FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
          transaction.replace(R.id.mainContainer,fragment2);
          transaction.commit();
      }
  };
}
