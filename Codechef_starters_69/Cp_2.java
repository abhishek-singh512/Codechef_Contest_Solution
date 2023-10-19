package Codechef_starters_69;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
      //  Scalene Triangle Starter_69
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while (test_case-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ( a !=b && b!=c && c!=a ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
