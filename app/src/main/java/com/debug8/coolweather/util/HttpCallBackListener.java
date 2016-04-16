package com.debug8.coolweather.util;

/**
 * Created by Debug8 on 2016/4/16.
 */
public interface HttpCallBackListener {
    void onFinish(String response);
    void onError(Exception e);
}
