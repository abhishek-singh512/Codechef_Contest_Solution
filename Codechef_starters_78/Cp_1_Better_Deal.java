package Codechef_starters_78;

import java.util.Scanner;

public class Cp_1_Better_Deal {
    public static void main(String[] args) {
        // Better Deal
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int First_discount = sc.nextInt();
            int Second_discount = sc.nextInt();
            int Final_Discount_money_of_A = 100 - First_discount;
            int Discount_money_of_B = 2 * Second_discount;
            int Final_Discount_of_B = 200 - Discount_money_of_B;

            if(Final_Discount_money_of_A < Final_Discount_of_B){
                System.out.println("First");
            }else if(Final_Discount_money_of_A == Final_Discount_of_B){
                System.out.println("Both");
            }else{
                System.out.println("Second");
            }
        }
    }
}
