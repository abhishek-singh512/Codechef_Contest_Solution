package Codechef_starters_104;

import java.util.Scanner;

public class Cp_6_Lexicographically_Largest {
    public static void main(String[] args) {
        // Lexicographically Largest
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prev = arr[0];
        int[] brr = new int[n];
        brr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                brr[i] = arr[i] * (m / arr[i]);
            } else {
                int val = arr[i - 1] * ((m / arr[i - 1]) + 1) - arr[i];
                while (val > m || gcd(val, arr[i - 1]) != arr[i]) {
                    val -= arr[i];
                }
                brr[i] = val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
