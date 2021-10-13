package 字符串.字符串在另一个字符串出现到次数;/*

 */

public class demo {
    public static void main(String[] args) {
        String s="ab";
        String temp="abdabsfdsabababababablllldmcdsk";
        demo(s,temp);
    }

    public static void demo(String s,String temp){
//        String[] s1 = temp.split("ab");
//        System.out.println(s1.length);
//        for (int i = 0; i < s1.length; i++) {
//            System.out.println(s1[i]);
//        }
        System.out.println((temp.length()-temp.replace(s, "").length())/s.length());
    }
}
