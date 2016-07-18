package com.example.administrator.myapplication;

import java.io.File;

/**
 * Created by Administrator on 2016/7/14.
 */
public class DBReader {
    public static File telFile;
    static {
        String dbFileDir="data/data/com.example.administrator.myapplication/";
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
}
