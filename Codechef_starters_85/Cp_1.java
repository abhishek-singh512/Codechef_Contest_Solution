package Codechef_starters_85;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Can Chef
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int X_liter_petrol_in_car = sc.nextInt();
            int Y_Distance =sc.nextInt();
            if(X_liter_petrol_in_car * 15 >= 2*Y_Distance){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
