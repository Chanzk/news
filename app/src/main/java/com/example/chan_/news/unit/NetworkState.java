package com.example.chan_.news.unit;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * 判断当前的网络状态，是否有连接网络
 * 移动数据或者wifi
 */
public class NetworkState {
    /**
     * 检查是否连接到网络
     * @param context
     * @return
     */
    public static boolean networkConnect(Context context){
        if(context!=null){
            ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = manager.getActiveNetworkInfo();
            if(info!=null)
                return info.isAvailable();
        }
        return false;
    }

    /**
     * 检查wifi连接
     * @param context
     * @return
     */
    public static boolean wifiConnect(Context context){
        if(context!=null){
            ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = manager.getActiveNetworkInfo();
            if(info!=null) {
                if(info.getType()==ConnectivityManager.TYPE_WIFI)
                return info.isAvailable();
            }
        }
        return false;
    }

    /**
     * 检查是否连接到移动网络
     * @param context
     * @return
     */
    public static boolean mobileDataConnect(Context context){
        if(context!=null){
            ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = manager.getActiveNetworkInfo();
            if(info!=null){
                if(info.getType()==ConnectivityManager.TYPE_MOBILE)
                    return true;

            }

        }
        return false;
    }


}


