package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// TOO (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "waitlist.db";

    private static final int DATABASE_VERSION = 1;

    private WaitlistDbHelper(Context c){
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE "+WaitlistContract.WaitlistEntry.TABLE_NAME+" ( "+
                WaitlistContract.WaitlistEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT"+
                WaitlistContract.WaitlistEntry.COLUMN_GUEST_NAME+" TEXT NOT NULL ,"+
                WaitlistContract.WaitlistEntry.COLUMN_PARTY_SIZE+" INTEGER NOT NULL , "+
                WaitlistContract.WaitlistEntry.COLUMN_TIMESTAMP+ " TIMESTAMP DEFAULT CURRENT_TIMESTAMP "+")";

        db.execSQL(SQL_CREATE_WAITLIST_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String DROP_TABLE_QUERY = "drop table if exist "+ WaitlistContract.WaitlistEntry.TABLE_NAME;
        db.execSQL(DROP_TABLE_QUERY);
        onCreate(db);
    }

    // TOO (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"

    // TDO (3) Create a static final int called DATABASE_VERSION and set it to 1

    // TOO (4) Create a Constructor that takes a context and calls the parent constructor

    // TOD () Override the onCreate method

        // ODO (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // TOO (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    // TOO (8) Override the onUpgrade method

        // TOO (9) Inside, execute a drop table query, and then call onCreate to re-create it

}