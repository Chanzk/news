package com.example.chan_.news;

import android.view.View;

/**
 * Created by Chan_ on 2017/3/21.
 */

public interface BaseView<T> {
    /**
     * 设置与view关联的presenter
     * @param presenter
     */
    void setPresenter(T presenter);

    /**
     * 初始化view
     * @param view
     */
    void initView(View view);

}
