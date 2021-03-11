package 浦发银行;

import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/11 22:14
 * @author: 1931559710@qq.com
 * ClassName: a6
 * Description:
 */
public class a6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));  //实际范围是[i, j)
            }
        }
    }
}
