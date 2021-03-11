package 浦发银行;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/7 10:45
 * @author: 1931559710@qq.com
 * ClassName: 约瑟夫环
 * Description:
 */
public class 约瑟夫环 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int count = 0;
        int j = 0;
        int k = scanner.nextInt();
        while (list.size() != 0) {
            j++;
            if (j - 1 == list.size()) {
                j = 1;
            }
            count++;
            if (count == k) {
                for (int i=0; i<list.size(); i++) {
                    System.out.print(list.get(i)+" ");
                }
                System.out.println(" +"+list.get(j - 1) + " ");
                list.remove(j - 1);
                count = 0;
                j--;
            }
        }
    }
}
