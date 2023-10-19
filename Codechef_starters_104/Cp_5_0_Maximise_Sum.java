package Codechef_starters_104;

import java.util.ArrayList;
import java.util.Scanner;

public class Cp_5_0_Maximise_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            ArrayList<Integer> pre = new ArrayList<>(a);
            ArrayList<Integer> suff = new ArrayList<>(a);
            for (int i = 1; i < n; i++) {
                int j = n - i - 1;
                pre.set(i, Math.max(pre.get(i), pre.get(i - 1)));
                suff.set(j, Math.max(suff.get(j), suff.get(j + 1)));
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.min(pre.get(i), suff.get(i));
            }
            System.out.println(ans);
        }
    }
}


