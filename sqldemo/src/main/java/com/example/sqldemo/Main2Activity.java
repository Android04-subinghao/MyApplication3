package com.example.sqldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ListView mListView;

    MyAdapter mAdapter;
    private ArrayList<TelclassInfo> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mListView= (ListView) findViewById(R.id.lv_demo);
        mList=new ArrayList<>();
        mList=DBReader.readTeldbClasslist();
        mAdapter=new MyAdapter(mList,getApplicationContext());
        mListView.setAdapter(mAdapter);

//        Intent intent=getIntent();
//        String extra=intent.getStringExtra(MainActivity.KEY);
//
//        TextView tv=new TextView(this);
//        tv.setText(extra);
//
//        RelativeLayout rl=new RelativeLayout(this);
//        rl.addView(tv);
    }
}
