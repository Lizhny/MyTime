package com.lizhy.mytime.db;

import android.content.Context;

/**
 * Created by spark on 2016/4/22.
 */
public class MyTimeDB  {
    private MyTimeDBHelper helper;
    public MyTimeDB (Context context){
        helper =new MyTimeDBHelper(context);
    }
}
