package 排序.插入排序;/*

 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class insert {
    public static void main(String[] args) {
        int arr[] = {5555, 4, 2,999, 68, 24, 33,99999};
        int[] test = test(arr);

        System.out.println(Arrays.toString(test));


//        int [] arr2=new int[800000];
//        for (int i = 0; i <800000 ; i++) {
//            arr2[i]=(int)(Math.random()*800000);
//        }
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);
//        System.out.println("排序前时间"+format);
//        test(arr2);
//        Date date2 = new Date();
//        String format2 = simpleDateFormat.format(date2);
//        System.out.println("排序后时间"+format2);
    }

    public static int[] test(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index] > value) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] =value;

        }
        return arr;
    }

}
