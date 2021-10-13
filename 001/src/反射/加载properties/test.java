package 反射.加载properties;/*

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class test {
    public static void main(String[] args) {
        Properties properties = new Properties();
        FileInputStream fileInputStream=null;
        try {
             fileInputStream = new FileInputStream("C:\\Users\\abc\\Desktop\\DataStructure\\001\\src\\反射\\加载properties\\properties.properties");
            properties.load(fileInputStream);
            String user = properties.getProperty("user");
            System.out.println(user);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


class test2{
    public static void main(String[] args) {
        Properties properties = new Properties();
        ClassLoader classLoader = test.class.getClassLoader();
        InputStream resourceAsStream =null;
        try {
       resourceAsStream = classLoader.getResourceAsStream("properties.properties");

            properties.load(resourceAsStream);
            String user = properties.getProperty("user");
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                resourceAsStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
