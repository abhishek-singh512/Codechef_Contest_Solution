package Codechef_1_Oct_Long_Challenge;

import java.util.Scanner;

public class cp_7_Chef_And_Array_Construction {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int test_case = sc.nextInt();
            int modulus = 998244353;

            while (test_case-- > 0) {
                int size_of_array = sc.nextInt();
                int max_limit_of_array = sc.nextInt();
                int[] temp = new int[max_limit_of_array * 10];
                int count = 0;
                for (int i = 1; i <= max_limit_of_array; i++) {
                    for (int j = 1; j <= max_limit_of_array; j++) {
                        temp[count] = (i & j);
                        count++;
                    }
                }
                int sum = 0;
                for (int i = 0; i < temp.length; i++) {
                    sum = sum + temp[i];
                }
                System.out.println(sum % modulus);
            }
            System.exit(0);
        } catch (Exception e) {
            return;
        }
    }
}
