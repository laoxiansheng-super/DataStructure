package io.缓冲流;/*

 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
            HashMap<Character, Integer> stringIntegerHashMap = new HashMap<>();
            File file = new File("C:\\Users\\abc\\Desktop\\DataStructure\\hello1.txt");
 fileReader = new FileReader(file);
            int len=0;
            while((len=fileReader.read())!=-1){
             char ch  =(char)len;
             if(stringIntegerHashMap.get(ch)==null){
                 stringIntegerHashMap.put(ch,1);

             }
             else{
                 stringIntegerHashMap.put(ch,stringIntegerHashMap.get(ch)+1);
             }
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
