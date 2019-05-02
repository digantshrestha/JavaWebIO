package com.pro.app;

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Program{
    public static void main(String[] args)throws IOException{

        URL url=new URL("https://http2.mlstatic.com/pegatina-nirvana-decal-vinilo-coches-camiones-paredes-l-D_NQ_NP_914028-MCO25815074999_072017-F.webp");
        URLConnection conn=url.openConnection();
        //String agent="Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36";

        
        /*InputStream is=new FileInputStream("e:/MyFiles/Copied.jpg");*/
        InputStream is=conn.getInputStream();
        OutputStream os=new FileOutputStream("e:/MyFiles/webCopy.jpg");

        byte[] data=new byte[1024];
        int i=0;

        while((i=is.read(data))!=-1){
            os.write(data,0,i);
        }

        is.close();
        os.close();
    }
}