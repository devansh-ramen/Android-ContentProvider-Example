package com.devanshapps.programmingreferences;


import android.net.Uri;
import android.provider.BaseColumns;

public class ContractPhonebook {

    public static final String AUTHORITY = "com.devanshapps.programmingreferences.Phonebook";
    public static final String PATH  = "/phonebook";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + PATH);

    public static final String CONTENT_PHONEBOOK_LIST = "vnd.android.cursor.dir/vnd.com.devanshapps.programmingreferences.phonebook";
    public static final String CONTENT_PHONEBOOK_ITEM = "vnd.android.cursor.item/vnd.com.devanshapps.programmingreferences.phonebook";

    public static final String DATABASE_NAME = "phone_book_db";
    public static final int DATABASE_VERSION = 2;


    public static class Phonebook implements BaseColumns {

        private Phonebook(){}

        public static final String TABLE_NAME = "phone_book";

        public static final String ID = "_id";
        public static final String PERSON_NAME = "person_name";
        public static final String PHONE_NUMBER = "phone_number";

    }
}
