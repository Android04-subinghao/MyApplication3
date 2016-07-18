package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.AssetsDBManager;

import java.io.IOException;

public class TextActivity extends AppCompatActivity implements View.OnClickListener {
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        mButton= (Button) findViewById(R.id.button2);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            if (DBReader.isExistsTeldbFile()) {
                try {
                    AssetsDBManager.copyAssetsFileToFile(getApplicationContext(), "commonnum.db", DBReader.telFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
