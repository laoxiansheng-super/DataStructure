package 欧基里得算法_最大公约数;/*

 */

public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd2(1, 3));
    }

//    public static int  gcd(int a, int b) {
//        if (a >=b) {
//            if (b == 0) {
//                return a;
//            }
//            int r = a % b;
//            return gcd(b, r);
//        }else {
//            if(a==0){
//
//                return b;
//            }
//            int r=b%a;
//            return gcd(a,r);
//        }
//    }


    public  static int  gcd2(int a,int b){
        if (b==0){
            return a;
        }
        int r=a%b;
        return  gcd2(b,r);
    }
}
