package io.随机读取文件流;/*

 */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class demo {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile1 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {

            randomAccessFile1 = new RandomAccessFile(new File("C:\\Users\\abc\\Desktop\\b.txt"), "r");
            randomAccessFile2 = new RandomAccessFile(new File("C:\\Users\\abc\\Desktop\\a.txt"), "rw");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = randomAccessFile1.read(bytes)) != -1) {
                randomAccessFile2.seek(2);
                randomAccessFile2.write(bytes, 0, len);
            }
//            randomAccessFile2.write("lll".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (randomAccessFile1 != null) {
                    randomAccessFile1.close();
                }
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
