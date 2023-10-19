package Codechef_starters_62;

import java.util.Scanner;

public class Cp_2_Test_Score {
    public static void main(String[] args) {
        // Test Score
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y % x ==0 ){
                if(n >= y/x ){
                    System.out.println("Yes");
                       }else
                           System.out.println("No");
            }else {
                System.out.println("No");
            }
        }
    }
}

