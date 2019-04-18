package com.example.teacher.sqlitereglogin;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button btnreg;
    EditText _txtFname, _txtLname, _textPass, _txtEmail, _txtPhone;

    public void login(View view) {
        Intent intent = new Intent(this, Secondlogin.class);
        EditText editText = (EditText) findViewById(R.id.txtfname);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void register(View view) {
        Intent intent = new Intent(this, Register.class);
        EditText editText = (EditText) findViewById(R.id.txtfname);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
