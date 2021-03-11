package 浦发银行;

import java.util.*;

/**
 * @user: Hasee
 * @date: 2021/3/6 22:37
 * @author: 1931559710@qq.com
 * ClassName: a3
 * Description:
 */

//判断是否为非完全平方数
public class a3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = Math.sqrt(a);
        int c = (int) b;
        if (c - b == 0)
            System.out.println(a + "不是非完全平方数");
        else
            System.out.println(a + "是非完全平方数");
    }
}
