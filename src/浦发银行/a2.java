package 浦发银行;

/**
 * @user: Hasee
 * @date: 2021/3/6 22:26
 * @author: 1931559710@qq.com
 * ClassName: a2
 * Description:
 */

//判断闰年：输出从 1990 年到 2010 年之间的闰年
public class a2 {
    public static void main(String[] args) {
        for (int i=1990; i<= 2010; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                System.out.println(i + "是闰年");
            else
                System.out.println(i + "不是闰年");
        }
    }
}
