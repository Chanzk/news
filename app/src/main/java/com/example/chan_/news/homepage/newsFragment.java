package com.example.chan_.news.homepage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Chan_ on 2017/3/21.
 */

public class newsFragment extends Fragment implements newsContract.View{


    public newsFragment() {}  //无参构造函数

    public static newsFragment newInstance(){return  new newsFragment();}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }



    @Override
    public void setPresenter(newsContract.Presenter presenter) {

    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showPickDialog() {

    }
}
