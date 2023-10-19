package Codechef_starters_77;

import java.util.Scanner;

public class Cp_2_Codechef_Airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int capacity_of_each_airplane = sc.nextInt();
            int number_of_people_willing = sc.nextInt();
            int cost_of_each_seat = sc.nextInt();
            int Available_seat_for_Passanger = 10*capacity_of_each_airplane;
            int No_of_Passanger_go = Math.min(Available_seat_for_Passanger,number_of_people_willing);
            int Maximum_Profit = No_of_Passanger_go*cost_of_each_seat;
            System.out.println(Maximum_Profit);
        }
    }
}
