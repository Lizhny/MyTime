///*
// * Copyright (C) 2012 www.amsoft.cn
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.lizhy.mytime.utils;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.widget.Toast;
//
//public class ToastUtil {
//
//    /** 上下文. */
//    private static Context mContext = null;
//
//    /** 显示Toast. */
//    public static final int SHOW_TOAST = 0;
//
//    /**
//	 * 主要Handler类，在线程中可用
//	 * what：0.提示文本信息
//	 */
//	private static Handler baseHandler = new Handler() {
//
//		@Override
//		public void handleMessage(Message msg) {
//			switch (msg.what) {
//				case SHOW_TOAST:
//					if(mContext!=null){
//						showToast(mContext,msg.getData().getString("TEXT"));
//					}
//					break;
//				default:
//					break;
//			}
//		}
//	};
//
//    /**
//     * 描述：Toast提示文本.
//     * @param text  文本
//     */
//	public static void showToast(Context context,String text) {
//		try {
//			if(context!=null){
//				mContext = context.getApplicationContext();
//				if(!StringUtil.isEmpty(text)){
//					Toast.makeText(mContext,text, Toast.LENGTH_SHORT).show();
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void showToastLong(Context context,String text) {
//		try {
//			if(context!=null){
//				mContext = context.getApplicationContext();
//				if(!StringUtil.isEmpty(text)){
//					Toast.makeText(mContext,text, Toast.LENGTH_LONG).show();
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	/**
//     * 描述：Toast提示文本.
//     * @param resId  文本的资源ID
//     */
//	public static void showToast(Context context,int resId) {
//		try {
//			if(context!=null){
//				mContext = context.getApplicationContext();
//				Toast.makeText(mContext,""+mContext.getResources().getText(resId), Toast.LENGTH_SHORT).show();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//    /**
//	 * 描述：在线程中提示文本信息.
//	 * @param resId 要提示的字符串资源ID，消息what值为0,
//	 */
//	public static void showToastInThread(Context context,int resId) {
//		try {
//			if(context!=null){
//				mContext = context.getApplicationContext();
//				Message msg = baseHandler.obtainMessage(SHOW_TOAST);
//				Bundle bundle = new Bundle();
//				bundle.putString("TEXT", mContext.getResources().getString(resId));
//				msg.setData(bundle);
//				baseHandler.sendMessage(msg);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * 描述：在线程中提示文本信息.
//	 */
//	public static void showToastInThread(Context context,String text) {
//		try {
//			if(context!=null){
//				mContext = context.getApplicationContext();
//				Message msg = baseHandler.obtainMessage(SHOW_TOAST);
//				Bundle bundle = new Bundle();
//				bundle.putString("TEXT", text);
//				msg.setData(bundle);
//				baseHandler.sendMessage(msg);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//
//}
