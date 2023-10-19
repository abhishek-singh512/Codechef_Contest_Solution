package Codechef_starters_84;

import java.util.Scanner;

public class Cp_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0) {
            int integer1 = sc.nextInt();
            int integer2 = sc.nextInt();
            String str = sc.next();
            StringBuilder substring = new StringBuilder(str);
            if (str.charAt(0) == '0') {
                integer2--;
                substring.setCharAt(0, '1');
            }
            while (integer2-- > 0) {
                substring.append('0');
            }
            System.out.println(substring.toString());
        }
    }
}
