package Codechef_starters_64;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        // Maria and Broken String
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            int count = 0;
            for (int i = 0; i < (s1.length() / 2); i++) {
                if (s1.charAt(i) == s1.charAt(i + n / 2)) {
                    count++;
                } else {
                    break;
                }
            }
                if (count == n / 2) {
                    System.out.println("yes");
                } else {
                    System.out.println("N0");
                }
        }
    }
}


