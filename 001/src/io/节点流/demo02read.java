package io.节点流;/*

 */

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class demo02read {
    public static void main(String[] args) {
        test02();
    }
    public static void test02(){
        FileWriter fileWriter=null;
        FileReader    fileReader=null;
        try {
            File file = new File("C:\\Users\\abc\\Desktop\\DataStructure\\hello.txt");
            File file2 = new File("C:\\Users\\abc\\Desktop\\DataStructure\\hello1.txt");
             fileReader = new FileReader(file);
             fileWriter = new FileWriter(file2,true);//flase覆盖true不覆盖追加
            char[] chars = new char[5];
            int len;
            while ((len=fileReader.read(chars))!=-1){
                fileWriter.write(chars,0,len);//复制
                //输出
//                String s = new String(chars, 0, len);
//                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
