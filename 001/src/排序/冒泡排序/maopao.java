package 排序.冒泡排序;/*

 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class maopao {
    public static void main(String[] args) {
//        int [] arr2=new int[80000];
//        for (int i = 0; i <80000 ; i++) {
//            arr2[i]=(int)(Math.random()*800000);
//        }
////        int arr[] = {1, 4, 2, 68, 24, 33};
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);
//        System.out.println("排序前时间"+format);
//        test(arr2);
////        System.out.println(Arrays.toString(test(arr2)));
////        System.out.println(Arrays.toString(ints));
//        Date date2 = new Date();
//        String format2 = simpleDateFormat.format(date2);
//        System.out.println("排序后时间"+format2);


        int arr [] ={33,32,22,18,14,3};
        int[] test = test(arr);
        String s = Arrays.toString(test);
        System.out.println(s);
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = test.length-1; i >=0 ; i--) {
            objects.add(test[i]);
        }
        System.out.println(objects);
    }
    public static int [ ] test(int []arr){
        int a=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int num=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=num;
                    a++;
                }
            }
            if (a==0){break;}
        }
        return arr;
    }
}
