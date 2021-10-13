package 动态规划.迭代;/*

 */

import 单链表.面试题.one;

public class test02 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int n){
        if(n<1){
            System.out.println("异常");
        }
        if(n==1 || n==2){
            return n;
        }
        int one=1;
        int two =2;
        int sum=0;
        for (int i = 3; i <=n ; i++) {
            sum=one+two;
            one=two;
            two=sum;
        }
        return sum;
    }
}
