package Codechef_starters_99D;

import java.util.Scanner;

public class Cp_2_Endless_Appetizers {
    public static void main(String[] args) {
        // Endless Appetizers
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int x =sc.nextInt();
            int y =sc.nextInt();
            int r = sc.nextInt();

            int total = x+(r/30);

            if(total%y > 1){
                System.out.println((total/y) + 1);
            }else{
                System.out.println((total/y)+(total%y));
            }
        }
    }
}
