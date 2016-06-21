package com.lizhy.mytime.utils;

import android.support.annotation.Nullable;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

/**
 * 日志工具
 * <p/>
 * Created by lizhy on 2016/3/24.
 */
public class LogUtil {
    public static boolean D = false;
    public static boolean E = false;

    public static void openAll() {
        D = true;
        E = true;
    }

    public static void closeAll() {
        D = false;
        E = false;
    }

    /**
     * 获取类名
     *
     * @return
     */
    private static String getClassName() {
        String result;
        StackTraceElement thisMethodStack = (new Exception()).getStackTrace()[2];
        result = thisMethodStack.getClassName();
        int lastIndex = result.lastIndexOf(".");
        result = result.substring(lastIndex + 1, result.length());
        return result;
    }

    /**
     * 显示当前方法名和所在类并加超链
     *
     * @return
     */
    private static String callMethodAndLine() {
        String result = "at";
        StackTraceElement thisMethodStack = (new Exception()).getStackTrace()[1];
        result += thisMethodStack.getClassName() + ".";//当前的类名（全名）
        result += thisMethodStack.getMethodName();
        result += "(" + thisMethodStack.getFileName();
        result += ":" + thisMethodStack.getLineNumber() + ")";
        return result;
    }

    public static void d(@Nullable String tag, @NotNull String msg) {
        if (!D) return;
        if (tag == null) tag = callMethodAndLine();
        Log.d(tag, msg);
    }

    public static void e(@Nullable String tag, @NotNull String msg) {
        if (E) return;
        if (tag == null) tag = callMethodAndLine();
        Log.e(tag, msg);
    }

    public static void e(@Nullable String tag, @NotNull String msg, Throwable tr) {
        if (E) return;
        if (tag == null) tag = callMethodAndLine();
        Log.e(tag, msg, tr);
    }
}
