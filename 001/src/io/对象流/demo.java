//package io.������;/*
//
// */
//
//import com.sun.org.apache.bcel.internal.generic.NEW;
//
//import java.io.*;
////���л��ͷ����л�
//public class demo implements Serializable {
//    public static void main(String[] args) {
//
//        ObjectOutputStream objectOutputStream=null;
//        ObjectInputStream objectInputStream=null;
//        try {
//            //д���ļ�
//            objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\abc\\Desktop\\b.txt"));
//            objectOutputStream.writeObject(new String("hsbfkw"));
//            //���ļ�����
//             objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\abc\\Desktop\\b.txt"));
//            Object o = objectInputStream.readObject();
//           String s=(String)o;
//            System.out.println(s);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                objectOutputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
