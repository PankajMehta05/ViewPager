package com.example.pankaj.viewpager;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {
   ViewPager viewPager;
    SwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    viewPager=(ViewPager)findViewById(R.id.viewpager);

        adapter=new SwipeAdapter(this);
        viewPager.setAdapter(adapter);

    }

}
