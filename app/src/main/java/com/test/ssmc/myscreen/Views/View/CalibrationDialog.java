package com.test.ssmc.myscreen.Views.View;


import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import com.test.ssmc.myscreen.R;


public class CalibrationDialog extends Dialog implements DialogInterface {
    public CalibrationDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_calivration);
    }

}
