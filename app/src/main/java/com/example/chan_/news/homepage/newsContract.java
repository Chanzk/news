package com.example.chan_.news.homepage;

import com.example.chan_.news.BasePresenter;
import com.example.chan_.news.BaseView;

/**
 * Created by Chan_ on 2017/3/21.
 */

public interface newsContract  {

    public interface View extends BaseView<Presenter>{

        // 显示加载或其他类型的错误
        void showError();
        // 显示正在加载
        void showLoading();
        // 停止显示正在加载
        void stopLoading();
        // 成功获取到数据后，在界面中显示
        //void showResults(ArrayList<News.Question> list);
        // 显示用于加载指定日期的date picker dialog
        void showPickDialog();

    }

    public interface Presenter extends BasePresenter{

        // 请求数据
        void loadPosts(long date, boolean clearing);
        // 刷新数据
        void refresh();
        // 加载更多文章
        void loadMore(long date);
        // 显示详情
        void startReading(int position);
        // 随便看看
        void feelLucky();

    }


}
