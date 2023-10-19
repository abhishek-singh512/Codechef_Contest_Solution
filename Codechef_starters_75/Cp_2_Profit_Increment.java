package Codechef_starters_75;

import java.util.Scanner;

public class Cp_2_Profit_Increment {
    public static void main(String[] args) {
        // Profit Increment
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){

            int Selling_Price = sc.nextInt();
            int Profit = sc.nextInt();

            int Buying_Price = Selling_Price - Profit;

            int New_Profit = Selling_Price / 10;

            int New_selling_Price = Selling_Price + New_Profit;

            int Over_all_Profit = New_selling_Price - Buying_Price;

            System.out.println(Over_all_Profit);

        }
    }
}
