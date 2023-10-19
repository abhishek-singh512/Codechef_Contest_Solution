package Codechef_starters_102;

import java.util.Scanner;

public class Cp_1_Selling_Insurance {
    public static void main(String[] args) {
        // Selling Insurance
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int Cost_of_Insurance = sc.nextInt(); // Cost of an insurance is X
            int Minimum_Insurances_Sell = (int) Math.ceil(100.0 / (Cost_of_Insurance * 0.2));
            System.out.println(Minimum_Insurances_Sell);
        }
    }
}

