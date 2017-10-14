package com.devanshapps.programmingreferences;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteDatabaseManager extends SQLiteOpenHelper{

    public SqliteDatabaseManager(Context context) {
        super(context, ContractPhonebook.DATABASE_NAME, null, ContractPhonebook.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String	CREATE_PHONEBOOK_TABLE = "CREATE	TABLE " + ContractPhonebook.Phonebook.TABLE_NAME + "(" + ContractPhonebook.Phonebook.ID + " INTEGER PRIMARY KEY,"
                + ContractPhonebook.Phonebook.PERSON_NAME + " TEXT," + ContractPhonebook.Phonebook.PHONE_NUMBER + " TEXT" + ")";
        sqLiteDatabase.execSQL(CREATE_PHONEBOOK_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ContractPhonebook.Phonebook.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
