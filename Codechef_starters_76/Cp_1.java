package Codechef_starters_76;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Read Pages
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int a = sc.nextInt();
            int b=sc.nextInt();
            int c = sc.nextInt();
            if(b*c>=a){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
