package 浦发银行;

import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/6 21:54
 * @author: 1931559710@qq.com
 * ClassName: a1
 * Description:
 */

//判断素数：除了 1 和该数本身，没有其他可以整除的数
public class a1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("1不是素数");    //素数是大于1的自然数
            return;
        }
        if (number == 2) {
            System.out.println("2是素数");
            return;
        }
        boolean f = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                f = false;
            }
        }
        if (f) {
            System.out.println(number + "是素数");
        } else {
            System.out.println(number + "不是素数");
        }
    }
}
