package 动态规划.递归;/*

 */

public class test01 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int  f(int n){
        if(n<1){
            System.out.println("异常");
        }
        if(n==1 || n==2){
            return n;
        }
        return f(n-1)+f(n-2);
    }

}
