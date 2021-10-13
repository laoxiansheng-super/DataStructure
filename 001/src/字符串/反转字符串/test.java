package 字符串.反转字符串;/*

 */

import org.junit.Test;

public class test {
    public static void main(String[] args) {
        System.out.println(demo("abcdefg", 1, 5));
    }
    //反转字符串,输入一个字符串,输入第几个到第几个反转

    public static String demo(String  s,int start,int end) {
if (s!=null) {
    char[] chars = s.toCharArray();
    for (int i = start, j = end; i < j; i++, j--) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    return new String(chars);
}
 return null;
    }
}
