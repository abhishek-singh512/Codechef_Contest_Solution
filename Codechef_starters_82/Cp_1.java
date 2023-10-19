package Codechef_starters_82;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Reach Home
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int X_Amount_of_fuels_in_motorcycle = sc.nextInt();
            int Y_Distance_of_chef_Home_in_Kilometer = sc.nextInt();
            int Distance_Covered_by_avaiable_fuel = 5 * X_Amount_of_fuels_in_motorcycle;
            if(Distance_Covered_by_avaiable_fuel>=Y_Distance_of_chef_Home_in_Kilometer){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
