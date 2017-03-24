package com.example.chan_.news.homepage;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class mainFragment extends Fragment {
    private Context context;

    private  newsFragment newsfragment;
    private newsPresenter newspresenter ;

    public mainFragment() {
    }

    public static mainFragment newInstace(){
        return  new mainFragment();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context=getActivity();


        //fragment回复状态
        if(savedInstanceState!=null){
            FragmentManager manager=getChildFragmentManager();
            newsfragment = (newsFragment)manager.getFragment(savedInstanceState, "new");

        }else {
            //创建view实例
            newsfragment=newsFragment.newInstance();
        }

        //创建presenter实例
        newspresenter = new newsPresenter(context,newsfragment);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
