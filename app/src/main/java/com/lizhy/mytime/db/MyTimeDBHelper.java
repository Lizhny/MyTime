package com.lizhy.mytime.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lizhy on 2016/4/22.
 */
public class MyTimeDBHelper extends SQLiteOpenHelper {
    public static final String MYTIME_DBNAME = "MyTime.db";
    public static final String CONTACT_RECORDS = "contact_recoeds";
    public static final String MESSAGE_RECORDS = "message_recoeds";
    public static final String SEARCHER_RECORDS = "search_records";

    public MyTimeDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public MyTimeDBHelper(Context context) {
        this(context, MYTIME_DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE table IF NOT EXITS" + CONTACT_RECORDS
                        + "(_id INTEGER PRIMARY KEY　AUTOINCREMENT,name TEXT,number INTEGER,source INTEGER,"
                        + "inTime INTEGER,outTime INTEGER,date DATETIME DEFAULT (datetime('now','localtime')))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
