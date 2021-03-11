package 浦发银行;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/6 22:49
 * @author: 1931559710@qq.com
 * ClassName: a4
 * Description:
 */

//判断两个字符串是否是异位：比如 abcn 和 banc 是一对，anc 和 nac 是一对，
//两个字符串完全奇偶互换，则称为异位，判断两个字符串是否为异位词，
//意思是判断两个字符串有相同数量的字母

//题目意思：即两个字符串中出现的字母和次数都一样，仅仅是顺序不一样
//思路：先排序，再判断
public class a4 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        String s1 = in1.nextLine();
        String s2 = in2.nextLine();

        //字符串排序要先转换成字符数组
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String ss1 = String.valueOf(c1);
        String ss2 = String.valueOf(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));

        if (Arrays.equals(c1, c2))
            System.out.println("两个字符串异位");
        else
            System.out.println("两个字符串不异位");
    }
}
