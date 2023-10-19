package Codechef_starters_62;

import java.util.Scanner;

public class Cp_1_Max_minus_Min {
    public static void main(String[] args) {
        // Max minus Min
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            // condition given is A < B < C means C is greatest Among all 3 no
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ( a<b && b<c && a <c){
                System.out.println(c-a);
            }
        }
    }
}
