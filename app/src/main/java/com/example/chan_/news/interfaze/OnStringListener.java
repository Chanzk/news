package com.example.chan_.news.interfaze;

import com.android.volley.VolleyError;

/**
 * Created by Chan_ on 2017/3/21.
 */

public interface OnStringListener {
    /**
     * 请求成功时回调
     * @param result
     */
    public void onSuccess(String result);

    /**
     * 请求失败时回调
     * @param error
     */
    public void onError(VolleyError error);

}
