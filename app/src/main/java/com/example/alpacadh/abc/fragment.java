package com.example.alpacadh.abc;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Alpacadh on 2017/12/18.
 */

public class fragment extends Fragment {
    private final String content;
    private final String title;
    Context mContext;
    TextView textView;

    //得到内容
    public String getContent() {
        return content;
    }
    //得到标题
    public String getTitle() {
        return title;
    }


    public fragment(String title, String content){
        super();
        this.title =title;
        this.content=content;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    //创建视图
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        textView=new TextView(mContext);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
    //绑定数据
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //设置内容
        textView.setText(content);


    }
}
