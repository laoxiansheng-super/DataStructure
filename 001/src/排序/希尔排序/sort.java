package 排序.希尔排序;/*

 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class sort {
    public static void main(String[] args) {
//        int [] arr2=new int[8000000];
//        for (int i = 0; i <8000000 ; i++) {
//            arr2[i]=(int)(Math.random()*800000);
//        }
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);
//        System.out.println("排序前时间"+format);
//         sort(arr2);
//        Date date2 = new Date();
//        String format2 = simpleDateFormat.format(date2);
//        System.out.println("排序后时间"+format2);

        int arr[] = {9999,55, 2666, 2, 68, 24, 33};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static  int [] sort(int [] arr){
        for (int grap = arr.length/2; grap >0 ; grap/=2) {
            for (int i = grap; i < arr.length ; i++) {
                int value=arr[i];
                int index=i-grap;
                while(index>=0&&arr[index]>value)
                {
                    arr[index+grap]=arr[index];
                    index-=grap;
                }
                arr[index+grap]=value;
            }
        }

        return arr;
    }
}
