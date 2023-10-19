package Codechef_starters_63;

import java.util.Scanner;

public class Cp_Avoid_Squares_Please {
    public static void main(String[] args) {
        // Avoid Squares Please
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int x = sc.nextInt();
            for(int i=x;i>=1;i--){
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}
