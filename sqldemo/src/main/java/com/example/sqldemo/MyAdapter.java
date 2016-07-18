package com.example.sqldemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/14.
 */
public class MyAdapter extends BaseAdapter {
    private ArrayList<TelclassInfo> mList;
    private ArrayList<TelclassInfo> adapterDatas = new ArrayList<TelclassInfo>();
    private Context mContext;
    public MyAdapter(ArrayList<TelclassInfo> list,Context context){
        mList=list;
        mContext=context;
    }
    @Override
    public int getCount() {
        if (mList!=null){
            return mList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            view= LayoutInflater.from(mContext).inflate(R.layout.item_list_show,null);
        }
        TextView tv_1= (TextView) view.findViewById(R.id.tv_1);

        tv_1.setText(DBReader.readTeldbClasslist().get(i));
        return view;
    }
}
