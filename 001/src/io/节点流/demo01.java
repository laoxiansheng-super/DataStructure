package io.节点流;/*

 */


import org.junit.Test;

import java.io.*;

//File实例化
public class demo01 {
    @Test
    public void main1()  {
//        File file = new File( "io.txt");
//        File file2 = new File( "C:\\Users\\abc\\Desktop\\准备\\javaIO\\io.txt");
//        File file3= new File( "C:\\Users\\abc\\Desktop\\准备","javaIO");
//        File file4 = new File( file3,"io.txt");
//        System.out.println(file4);
//        File file = new File("hello.txt");
//        System.out.println(file.exists());
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        FileReader fileReader = null;
        try {
            File file = new File("C:\\Users\\abc\\Desktop\\DataStructure\\hello.txt");

            fileReader = new FileReader(file);
            char[] chars = new char[3];
            int read1 ;
            while ((read1=fileReader.read(chars))!=-1){
//                for (int i = 0; i < read1; i++) {
//                    System.out.println(chars[i]);
//                }
                String s = new String(chars, 0, read1);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}


