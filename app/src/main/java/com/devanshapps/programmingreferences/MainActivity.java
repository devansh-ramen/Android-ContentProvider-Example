package com.devanshapps.programmingreferences;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String AUTHORITY = "com.devanshapps.programmingreferences.Phonebook";
        String PATH  = "/phonebook";
        Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + PATH);
        ContentValues values = new ContentValues();
        values.put("person_name", "Devansh");
        values.put("phone_number", "12300000");
        Uri mUri = getContentResolver().insert(CONTENT_URI, values);
        if(mUri != null){
            Toast.makeText(getApplicationContext(), "Successfully added to Content Provider", Toast.LENGTH_LONG).show();
        }


    }
}
