package com.example.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button mButton;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mButton= (Button) findViewById(R.id.button);
        mEditText= (EditText) findViewById(R.id.edit_query);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numble=mEditText.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+numble));
                startActivity(intent);
            }
        });
    }
}
