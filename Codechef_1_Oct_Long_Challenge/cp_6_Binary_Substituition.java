package Codechef_1_Oct_Long_Challenge;

import java.util.Scanner;

class cp_6_Binary_Substituition {
    public static void main(String[] args) {
        // Binary Substituition
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
    public static int solve(String s) {
        int length_of_String = s.length();
        int arr[] = new int[length_of_String + 1];
        arr[length_of_String] = 1;
        arr[length_of_String - 1] = 1;

        for (int i = length_of_String - 2; i >= 0; i--) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                arr[i] = (arr[i + 1] + arr[i + 2]) % 998244353;
            } else {
                arr[i] = arr[i + 1];
            }
        }
        return arr[0] % 998244353;
    }
}

