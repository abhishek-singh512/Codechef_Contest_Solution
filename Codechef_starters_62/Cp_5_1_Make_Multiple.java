package Codechef_starters_62;

import java.util.Scanner;

public class Cp_5_1_Make_Multiple {
    public static void main(String[] args) {
        // Make Multiple
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
           int a = sc.nextInt();
           int b = sc.nextInt();
            if(b%a!=0){
                if(b>2*a)
                    System.out.println("Yes");
                else
                    System.out.println("No");
                }else {
                    System.out.println("Yes");}
        }
    }
}

