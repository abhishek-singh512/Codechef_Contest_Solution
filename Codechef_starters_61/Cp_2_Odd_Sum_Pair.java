package Codechef_starters_61;

import java.util.Scanner;

public class Cp_2_Odd_Sum_Pair {
    public static void main(String[] args) {
        // Odd Sum Pair
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while(Test_case-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a%2!=0 && b%2!=0 && c%2!=0){
                System.out.println("No");
            }else if(a%2!=0 || b%2!=0 || c%2!=0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
