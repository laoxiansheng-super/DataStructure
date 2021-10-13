package 排序.选择排序;/*

 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class choose {
    public static void main(String[] args) {
//        int arr[] = {1, 4, 2, 68, 24, 33};
//        int[] test = test(arr);
//        System.out.println(Arrays.toString(test));
        int [] arr2=new int[80000];
        for (int i = 0; i <80000 ; i++) {
            arr2[i]=(int)(Math.random()*800000);
        }
//        int arr[] = {1, 4, 2, 68, 24, 33};
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("排序前时间"+format);
        test(arr2);
//        System.out.println(Arrays.toString(ints));
        Date date2 = new Date();
        String format2 = simpleDateFormat.format(date2);
        System.out.println("排序后时间"+format2);
    }

    public  static int []  test(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }
            }
        }
        return arr;
    }
}
