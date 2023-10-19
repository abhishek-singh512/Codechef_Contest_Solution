package Codechef_starters_104;

import java.util.Scanner;

public class Cp_5_1_Maximise_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = sumOfArr(n, arr);
        int i = n - 1;
        int j = n - 2;
        long sum = 0;
        long maxm = 0;
        long[] pref = new long[n];
        for (int k = 0; k < n; k++) {
            maxm = Math.max(maxm, 1l * arr[k]);
            pref[k] = maxm;
        }
        maxm = 0;
        while (j >= 0) {
            long i1 = (i - j - 1) * 1l * Math.min(arr[i], arr[j]);
            if (i1 >= sum)
                maxm = Math.max(maxm, i1 - sum);
            if (arr[j] >= arr[i] || pref[j] == arr[j]) {
                sum = 0;
                i = j;
                ans += maxm;
                maxm = 0;
            } else
                sum += arr[j];
            j--;
        }
        ans += maxm;
        System.out.println(ans);
    }

    public static long sumOfArr(int n, int[] arr) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
