package com.example.alpacadh.abc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Alpacadh on 2017/12/18.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<fragment> fragments;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<fragment>fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments!=null?fragments.size():0;
    }
    //得到页面标题
    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }

}


