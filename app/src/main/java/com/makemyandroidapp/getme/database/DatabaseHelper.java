package com.makemyandroidapp.getme.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2017-05-20.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "events.db";
    public static final String TABLE_NAME = "events_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "DESCRIPTION";
    public static final String COL_4 = "ISLOCATION";
    public static final String COL_5 = "LATITUDE";
    public static final String COL_6 = "LONGITUDE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT, DESCRIPTION TEXT, ISLOCATION INTEGER, LATITUDE TEXT, LONGITUDE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(Event event) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, event.getName());
        contentValues.put(COL_3, event.getDescription());
        contentValues.put(COL_4, event.getIsLocation());
        contentValues.put(COL_5, event.getLatitude());
        contentValues.put(COL_6, event.getLongitude());

        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1)
            return false;
        else
            return true;


    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

//    public List<Event> getAllEvents() {
//        List<Event> events = new ArrayList<>();
//
//        // select query
//        String selectQuery = "SELECT  * FROM " + TABLE_FRIEND;
//
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//
//        // looping through all table records and adding to list
//        if (cursor.moveToFirst()) {
//            do {
//                Friend friend = new Friend();
//                friend.setId(Integer.parseInt(cursor.getString(0)));
//                friend.setName(cursor.getString(1));
//                friend.setJob(cursor.getString(2));
//
//                // Adding friend to list
//                events.add(friend);
//            } while (cursor.moveToNext());
//        }
//
//        return events;
//    }

    public boolean updateData(Event event) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_1, event.getId());
        contentValues.put(COL_2, event.getName());
        contentValues.put(COL_3, event.getDescription());
        contentValues.put(COL_4, event.getIsLocation());
        contentValues.put(COL_5, event.getLatitude());
        contentValues.put(COL_6, event.getLongitude());

        db.update(TABLE_NAME, contentValues, "ID = ?", new String[]{String.valueOf(event.getId())});
        return true;
    }

    public Integer deleteData(Event event) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[]{String.valueOf(event.getId())});
    }
}
