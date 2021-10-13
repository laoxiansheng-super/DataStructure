package io.转换流;/*

 */

import java.io.*;

//inputstreamread 将字节输入流转成字符流
public class demo01 {
    public static void main(String[] args) {
        FileInputStream file=null;
        InputStreamReader ipr=null;
FileOutputStream file2=null;
OutputStreamWriter ipw=null;
        try {
            file = new FileInputStream("C:\\Users\\abc\\Desktop\\DataStructure\\hello1.txt");
            file2=new FileOutputStream("C:\\Users\\abc\\Desktop\\a.txt");
             ipr = new InputStreamReader(file, "utf-8");//解码   字节到字符
            ipw=new OutputStreamWriter(file2,"utf-8");//解码      字符到字节
            char[] chars = new char[5];
            int len;
            while((len=ipr.read(chars))!=-1){
//                String s = new String(chars, 0, len);
//                System.out.println(s);
                ipw.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ipr.close();
                ipw.close();
                file.close();
                file2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
