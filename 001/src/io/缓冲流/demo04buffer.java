package io.缓冲流;/*

 */

import java.io.*;

public class demo04buffer {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File("C:\\Users\\abc\\Desktop\\DataStructure\\001\\hyc.jpg");
            File file1 = new File("C:\\Users\\abc\\Desktop\\hyc3.jpg");
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = new byte[20];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
