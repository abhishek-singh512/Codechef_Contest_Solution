package Codechef_starters_72;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Sum it
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b;
            if(sum == c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
