package Codechef_starters_73;

import java.util.Scanner;

public class Cp_4 {
    public static void main(String[] args) {
        // Append For XOR
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int N_Length_OF_An_Array = sc.nextInt();
            int final_bitwise_OR_of_the_array_A = sc.nextInt();

            int Container = 0;
            for(int i=0;i<N_Length_OF_An_Array;i++){
                int X_is_the_non_Nagetive_Integer = sc.nextInt();
                Container = Container|X_is_the_non_Nagetive_Integer;
            }
            if((Container|final_bitwise_OR_of_the_array_A)==final_bitwise_OR_of_the_array_A){
                System.out.println(Math.abs(Container-final_bitwise_OR_of_the_array_A));
            }else {
                System.out.println(-1);
            }
        }
    }
}
