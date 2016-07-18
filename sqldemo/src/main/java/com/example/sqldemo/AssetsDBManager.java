package com.example.sqldemo;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/7/14.
 */
public class AssetsDBManager {
    public static void copyAssetsFileToFile(Context context, String path,File toFile) throws IOException{
        InputStream inStream=null;
        BufferedInputStream buffinputStream=null;
        BufferedOutputStream buffoutputStream=null;
        try {
            inStream=context.getAssets().open(path);
            buffinputStream=new BufferedInputStream(inStream);
            buffoutputStream=new BufferedOutputStream(new FileOutputStream(toFile,false));
            int len=0;
            byte[] buff=new byte[2*1024];
            while((len=buffinputStream.read(buff))!=-1){
                buffoutputStream.write(buff,0,len);
            }
            buffoutputStream.flush();
        } catch (IOException e) {
            throw e;
        }finally {
                buffoutputStream.close();
                buffinputStream.close();
                inStream.close();
            }
        }
    }


