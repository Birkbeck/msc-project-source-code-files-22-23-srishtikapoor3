// SQLite Helper class for creating tables, inserting data, and cross checking credentials for login
package com.example.deepthought;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;


public class SignupData extends SQLiteOpenHelper

{
    // assigning the database version and name
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DeepThought.db";

    public SignupData(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
// creating user table with column and constraints details
    // table contains emailId, username, password, test result strength, test result weakness
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query  = "CREATE TABLE user (emailid text PRIMARY KEY, username text, password text,";
        query += " strength text, weakness text)";
        db.execSQL(query);

    }
//

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }



    // adding the record in tables
    public boolean insertUser(String emailid, String username, String password, String strength, String weakness) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("emailid", emailid);
        values.put("username", username);
        values.put("password", password);
        values.put("strength", strength);
        values.put("weakness", weakness);

        long result = db.insert("user", null, values);
        db.close();

        // if data is inserted incorrectly it will return -1
        return result != -1;
    }

    // checking if email id and password exist in user table or not
    public boolean checkUserCredentials(String emailid, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM user WHERE emailid=? AND password=?", new String[]{emailid, password});
        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        db.close();
        return exists;
    }

}











