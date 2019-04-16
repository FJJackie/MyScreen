package com.test.ssmc.myscreen.Views.View;

import android.content.Context;

public interface UpDateWebViewInterface {
    void LoadJsView(String js);
    void ShowSnackbar(String msg);
    //更新亮度
    void updateBrightness(float brightness);
    //获取ui界面活动的context
    Context getContext();
    void showWaiting();
}
