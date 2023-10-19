package Codechef_starters_78;

import java.util.Scanner;

public class Cp_3_Add_smallest_prime_factor {
    public static void main(String[] args) {
        // Distinct Opposite Sums
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            long input_value_of_a_no_1 = sc.nextInt();
            long input_value_of_a_no_2 = sc.nextInt();
            input_value_of_a_no_1 = input_value_of_a_no_1 + small_Divisor_of_a_no(input_value_of_a_no_1);
            System.out.println(1 + (input_value_of_a_no_2 - input_value_of_a_no_1 + 1) / 2);
        }
    }

    public static long small_Divisor_of_a_no(long n) {
        if (n % 2 == 0) {
            return 2;
        }
        for (long Abhi = 3; Abhi*Abhi<=n; Abhi = Abhi+2) {
            if (n % Abhi == 0)
                return Abhi;
        }
        return n;
    }
}
