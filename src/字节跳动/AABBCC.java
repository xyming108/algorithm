package 字节跳动;

import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/11 20:03
 * @author: 1931559710@qq.com
 * ClassName: AABBCC
 * Description:
 */

/*
1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC

输入例子1:
2
helloo
wooooooow

输出例子1:
hello
woow

*/
public class AABBCC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();
        //自动机
        while (--N >= 0) {
            int state = 0;  //状态
            char cur;   //向后移动比较的字符

            StringBuilder str = new StringBuilder();    //目标字符
            str.append(in.next());

            char last = str.charAt(0);  //当前字符

            StringBuffer ans = new StringBuffer();  //最终返回的字符
            ans.append(str.charAt(0));

            for (int i = 1; i < str.length(); i++) {
                cur = str.charAt(i);
                switch (state) {
                    case 0: {
                        if (cur == last)    //如果是相等的，进入状态1，否则继续状态0；
                            state = 1;  //进入状态1：AA形式
                        else
                            state = 0;  //继续状态0：AB形式，即正常形式
                        break;
                    }
                    case 1: {
                        if (cur == last)
                            continue;   //三个AAA或三个以上AAA......，直接跳回for循环向后遍历
                        else
                            state = 2;  //进入状态3：AAB形式
                        break;
                    }
                    case 2: {
                        if (cur == last)
                            continue;   //AABB，忽略即可
                        else
                            state = 0;  //AABC，就是状态0
                        break;
                    }
                    default:
                        break;
                }
                ans.append(cur);
                last = cur;
            }
            System.out.println(ans);
        }
    }
}
