package io.节点流;/*

 */

import java.io.*;

public class demo03stream {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            File file = new File("C:\\Users\\abc\\Desktop\\DataStructure\\001\\hyc.jpg");
            File file1 = new File("C:\\Users\\abc\\Desktop\\hyc2.jpg");

            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);
            byte[] bytes = new byte[96];
            int len ;
           while ((len=fileInputStream.read(bytes))!=-1){
               //复制
               fileOutputStream.write(bytes,0,len);
               //输出
//               String s = new String(bytes,0,len);
//               System.out.println(s);
           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
