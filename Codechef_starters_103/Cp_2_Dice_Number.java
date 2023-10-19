package Codechef_starters_103;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cp_2_Dice_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0) {
            Integer[] array1 = new Integer[3];
            Integer[] array2 = new Integer[3];

           // int n = 3;
            for (int i = 0; i < 3; i++) {
                array1[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                array2[i] = sc.nextInt();
            }
            Arrays.sort(array1, Collections.reverseOrder());
            Arrays.sort(array2, Collections.reverseOrder());

            int sum1 = 0;
            for (int i = 0; i < 3; i++) {
                sum1 = array1[i] + sum1 * 10;
            }
            int sum2 =0;
            for (int i = 0; i < 3; i++) {
                sum2 = array2[i] + sum2 * 10;
            }
            if (sum2 == sum1) {
                System.out.println("Tie");
            } else if (sum2 > sum1) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
    }
}