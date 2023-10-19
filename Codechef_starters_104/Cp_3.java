package Codechef_starters_104;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int numbers = sc.nextInt();
            int Max_diff_choc = sc.nextInt();
            int[] array = new int[numbers];
            long summation = 0;
            for (int i = 0; i < numbers; i++) {
                array[i] = sc.nextInt();
                summation += array[i];
            }
            if (summation< numbers) {
                System.out.println("NO");
            } else {
                summation = summation % numbers;
                if (Max_diff_choc == 0 && summation != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
            System.out.println();
        }
    }
}

