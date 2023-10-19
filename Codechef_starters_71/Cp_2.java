package Codechef_starters_71;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Perfect Trio
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b == c){
                System.out.println("Yes");
            }else if( b + c == a){
                System.out.println("Yes");
            }else if( c + a == b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
