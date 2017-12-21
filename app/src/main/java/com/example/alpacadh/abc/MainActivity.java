package com.example.alpacadh.abc;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private ViewPager V1;
        private TabLayout T1;


        ViewPagerAdapter adapter;
        ArrayList<fragment>fragments;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            T1 = (TabLayout) findViewById(R.id.T1);
            V1 = (ViewPager) findViewById(R.id.v1);


            //初始化页面
            fragments=new ArrayList<>();
            for(int i=1;i<=30;i++)
           fragments.add(new fragment("第"+i+"个Tab", "第"+i+"个Tab"));



            //设置ViewPager的适配器
            adapter =new ViewPagerAdapter(getSupportFragmentManager(),fragments);
            V1.setAdapter(adapter);
            T1.setupWithViewPager(V1);
            T1.setTabMode(TabLayout.MODE_SCROLLABLE);
        }
    }


