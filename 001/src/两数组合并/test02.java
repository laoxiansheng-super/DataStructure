package 两数组合并;/*

 */

import java.util.Arrays;

public class test02 {


    public static void main(String[] args) {
        int[] arr1 = {1, 6, 8, 9};
        int[] arr2 = {2, 4, 11, 16};
        int[] arr3 = new int[arr1.length + arr2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (a < arr1.length && b < arr2.length) {
               if(arr1[a]>arr2[b])
               {
                   arr3[i]=arr2[b];
                    b++;
               }
               else {
                   arr3[i]=arr1[a];
                   a++;
               }

            }
            else if(a<arr1.length){
                arr3[i]=arr1[a];
                a++;
            }
            else if(b<arr2.length){
                arr3[i]=arr2[b];
                b++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}