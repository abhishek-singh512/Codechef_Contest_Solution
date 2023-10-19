package Codechef_starters_62;

import java.util.Scanner;

public class Cp_5_2_Make_Multiple {
    public static void main(String[] args) {
        // Make_Multiple
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b || a<=b/2){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
