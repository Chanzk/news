package com.example.chan_.news;

/**
 * Created by Chan_ on 2017/3/21.
 */

public interface BasePresenter {

    // 获取数据并改变界面显示，调用时机为Fragment的OnResume()方法中
    void start();
}
