package Codechef_starters_62;

import java.util.Scanner;

public class Cp_3_X_Jumps {
    public static void main(String[] args) {
        // X Jumps
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int No_of_Stair_chef_want_to_reach = sc.nextInt();
            int No_of_stair_he_can_climb_in_one_move = sc.nextInt();
            int min_moves = No_of_Stair_chef_want_to_reach % No_of_stair_he_can_climb_in_one_move + No_of_Stair_chef_want_to_reach /No_of_stair_he_can_climb_in_one_move ;
            System.out.println(min_moves);
        }
    }
}
