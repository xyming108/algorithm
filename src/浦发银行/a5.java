package 浦发银行;

import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/6 23:16
 * @author: 1931559710@qq.com
 * ClassName: a5
 * Description:
 */

//字符串中字符替换：把字符串中的字符 a 和 A 换成 c 输出
public class a5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ss = s.replace("a", "c");
        String sss = ss.replace("A", "c");
        System.out.println(sss);
    }
}
