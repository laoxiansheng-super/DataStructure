package 两数组合并;/*

 */

import java.util.Arrays;

public class test03 {
    public static void main(String[] args) {
        int []arr={1,9,6,4,9,42};
//        int[] xaunzhe = xaunzhe(arr);
//        int [] maopao=maopao(arr);
        int[] insert = insert(arr);
        System.out.println(Arrays.toString(insert));

    }
//插入排序
    public static int [] insert(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            int insertvalue=arr[i];
            int index=i-1;
            while(index>=0&&insertvalue<arr[index])
            {
               arr[index+1] =arr[index];
               index--;
            }
            arr[index+1]=insertvalue;

        }


        return arr;
    }

    //冒泡排序
    public  static int [] maopao(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                System.out.print(i);
                System.out.println(j);
                if(arr[j]>arr[j+1]){
                    int num=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=num;
                }
            }
        }


        return arr;
    }




    //选择排序
    public  static int [] xaunzhe(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;

                }
            }
        }
        return arr;
    }
}
