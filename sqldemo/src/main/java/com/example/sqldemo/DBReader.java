package com.example.sqldemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/14.
 */
public class DBReader {
    public static File telFile;
    static {
        String dbFileDir="data/data/com.example.sqldemo/";
        File filedir=new File(dbFileDir);
        filedir.mkdirs();
        telFile=new File(dbFileDir,"commonnum.db");
    }
    public static boolean isExistsTeldbFile(){
        File tofile=DBReader.telFile;
        if (!tofile.exists()||tofile.length()<=0){
            return false;
        }
        return true;
    }
    public static ArrayList<TelclassInfo> readTeldbClasslist(){
        ArrayList<TelclassInfo> classListInfos=new ArrayList<TelclassInfo>();
        SQLiteDatabase db=null;
        Cursor cursor=null;
        db=SQLiteDatabase.openOrCreateDatabase(telFile,null);
        cursor=db.rawQuery("select * from classlist",null);
        if (cursor.moveToFirst()){
            do {
                String name=cursor.getString(cursor.getColumnIndex("name"));
                int idx=cursor.getInt(cursor.getColumnIndex("idx"));
                TelclassInfo classListInfo=new TelclassInfo(name,idx);
                classListInfos.add(classListInfo);
            }while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return classListInfos;
    }
    public static ArrayList<TelnumberInfo> readTeldbTable(int idx){
        ArrayList<TelnumberInfo> numberInfos=new ArrayList<TelnumberInfo>();
        String sql = "select * from table" + idx;
        SQLiteDatabase db = null;
        Cursor cursor = null;
        db = SQLiteDatabase
                .openOrCreateDatabase(telFile, null);
        cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                String name = cursor
                        .getString(cursor
                                .getColumnIndex("name"));
                String number = cursor
                        .getString(cursor
                                .getColumnIndex("number"));
                TelnumberInfo numberInfo = new TelnumberInfo(
                        name, number);
                numberInfos.add(numberInfo);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return numberInfos;
    }
}
