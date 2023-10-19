package Codechef_starters_104;

import java.util.Scanner;

public class Cp_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-- > 0) {
            int first_number = sc.nextInt();
            int Second_number = sc.nextInt();
            int kth_numbers = sc.nextInt();
            if (first_number > Second_number) {
                int temp = first_number;
                first_number = Second_number;
                Second_number = temp;
            }
            if (kth_numbers == 1) {
                System.out.println(first_number+ gcd(first_number, Second_number));
            } else {
                System.out.println(2 * gcd(first_number, Second_number));
            }
        }
    }
    public static int gcd(int a_number, int b_number) {
        if (b_number == 0) {
            return a_number;
        }
        return gcd(b_number, a_number % b_number);
    }
}
