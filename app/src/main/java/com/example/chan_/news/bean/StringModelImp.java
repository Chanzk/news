package com.example.chan_.news.bean;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.chan_.news.app.VolleySingleton;
import com.example.chan_.news.interfaze.OnStringListener;

/**
 * Created by Chan_ on 2017/3/21.
 */

public class StringModelImp {
    private Context context;
    public StringModelImp(Context context){
        this.context=context;
    }

    public void load(String url, final OnStringListener listener){
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                listener.onSuccess(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                listener.onError(volleyError);
            }
        });

        VolleySingleton.getVolleySingleton(context).addToRequestQueue(request);
    }

}
