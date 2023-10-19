package Codechef_starters_74;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Mana Points
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int  special_attack_costs = sc.nextInt();
            int  the_number_of_mana_points_Chefario_has_initially = sc.nextInt();

            int the_maximum_number_of_special_attacks_Chefario_can_perform = the_number_of_mana_points_Chefario_has_initially / special_attack_costs;
            System.out.println(the_maximum_number_of_special_attacks_Chefario_can_perform);
        }
    }
}
