package Codechef_1_Jan_Long_Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Cp_4_Asymmetric_Swaps {
    public static void main(String[] args) {
        // Asymmetric Swaps
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {

            int Numbers = sc.nextInt();

            int array_First[] = new int[Numbers];
            int array_Second[] = new int[Numbers];
            int final_no = array_First.length;
            int starting_No = array_Second.length;
            int arr[] = new int[final_no + starting_No];
            for (int i = 0; i < Numbers; i++) {
                array_First[i] = sc.nextInt();
            }
            for (int i = 0; i < Numbers; i++) {
                array_Second[i] = sc.nextInt();
            }
            System.arraycopy(array_First,0, arr, 0, final_no);
            System.arraycopy(array_Second, 0, arr,final_no, starting_No);
            Arrays.sort(arr);
            int min = arr[2 * Numbers - 1] - arr[0];
            for (int i = 0; i <= Numbers; i++) {
                min = Math.min(min, arr[i + Numbers - 1] - arr[i]);
            }
            System.out.println(min);
        }
    }
}
