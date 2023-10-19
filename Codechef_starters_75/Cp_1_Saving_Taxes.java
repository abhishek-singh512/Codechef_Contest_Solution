package Codechef_starters_75;

import java.util.Scanner;

public class Cp_1_Saving_Taxes {
    public static void main(String[] args) {
        // Saving Taxes
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int denoting_the_amount_you_earned = sc.nextInt();
            int  the_amount_above_which_you_will_have_to_pay_taxes = sc.nextInt();
            System.out.println(denoting_the_amount_you_earned - the_amount_above_which_you_will_have_to_pay_taxes);
        }
    }
}
