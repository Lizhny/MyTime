package com.lizhy.mytime.utils;

import android.content.Context;

import com.github.johnpersano.supertoasts.SuperToast;

/**
 * Created by AI-MASK on 2016/4/18.
 */
public class SuperToastUtil {
    /**
     * 描述：Toast提示文本.
     *
     * @param text 文本
     */
    public static void showToast(Context context, String text) {
        try {
            if (context != null) {
                if (!StringUtil.isEmpty(text)) {
                    SuperToast.create(context.getApplicationContext(), text, 2000).show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showToastLong(Context context, String text) {
        try {
            if (context != null) {
                if (!StringUtil.isEmpty(text)) {
                    SuperToast.create(context.getApplicationContext(), text, 3500).show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 描述：Toast提示文本.
     *
     * @param resId 文本的资源ID
     */
    public static void showToast(Context context, int resId) {
        try {
            if (context != null) {
                SuperToast.create(context.getApplicationContext(), context.getResources().getText(resId), 2000).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 描述：Toast提示文本.
     *
     * @param resId 文本的资源ID
     */
    public static void showToastLong(Context context, int resId) {
        try {
            if (context != null) {
                SuperToast.create(context.getApplicationContext(), context.getResources().getText(resId), 3500).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
