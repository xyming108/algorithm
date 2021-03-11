package 顺丰科技;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @user: Hasee
 * @date: 2021/3/10 21:52
 * @author: 1931559710@qq.com
 * ClassName: sf
 * Description: 考完才做出来，晚了，差一点点
 */

/*
5 4
1 5 2 3 2
1 2
1 3
2 5
1 1
 */
public class sf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, q;
        n = in.nextInt();
        q = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int[] out = new int[q];
        int[] L = new int[q];
        int[] R = new int[q];
        int sum;

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < q; i++) {
            L[i] = in.nextInt();
            R[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int m = R[i] - L[i] + 1;
            if (m < 3) {
                out[i] = -1;
            } else {
                sum = 0;
                int[] p = new int[m];
                int x = 0;
                for (int j = L[i] - 1; j <= R[i] - 1; j++) {
                    p[x++] = list.get(j);       //这里x应该从0开始，我考试的时候用的是j，导致数组越界
                }
                Arrays.sort(p);
                for (int j = 1; j < p.length - 1; j++) {
                    sum += p[j];
                }
                out[i] = sum;
            }
        }

        for (int i = 0; i < q; i++) {
            if (out[i] == -1) {
                System.out.println("NoScore");
            } else {
                System.out.println(out[i] / (R[i] - L[i] - 1));
            }
        }
    }
}
