package Codechef_starters_71;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        // Snapchat
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        int count = 0;
        while (Test_case-- > 0) {
            int n = sc.nextInt();
            int[] array1 = new int[n];
            int[] array2 = new int[n];
            for (int i = 0; i < n; i++) {
                //reading array elements from the user
                array1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                //reading array elements from the user
                array2[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if (array1[i] >= 1 && array2[i] >= 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
