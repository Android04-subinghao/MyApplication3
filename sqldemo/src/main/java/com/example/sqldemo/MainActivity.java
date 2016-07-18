package com.example.sqldemo;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnInsert,btnFind,btnUpdata,btnDelete,button5;
    private SQLiteDatabase db;
    private SQLiteOpenHelper mHelper;
    public static final String KEY="send";
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsert= (Button) findViewById(R.id.button1);
        btnFind= (Button) findViewById(R.id.button2);
        btnUpdata= (Button) findViewById(R.id.button3);
        btnDelete= (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);

        btnInsert.setOnClickListener(this);
        btnFind.setOnClickListener(this);
        btnUpdata.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        if (view.getId()== R.id.button5){
//
//                editText= (EditText) findViewById(R.id.edit);
//                String massage=editText.getText().toString().trim();
//                Intent intent=new Intent(this,Main2Activity.class);
//                intent.putExtra(KEY,massage);
//                startActivity(intent);
//    }

    }
}
