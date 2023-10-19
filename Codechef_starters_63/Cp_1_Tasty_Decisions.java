package Codechef_starters_63;

import java.util.Scanner;

public class Cp_1_Tasty_Decisions {
    public static void main(String[] args) {
        // Tasty Decisions
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Testiness_of_chocolate = sc.nextInt();
            int Testiness_of_candy = sc.nextInt();

            int Total_Tastiness_of_chocolate = Testiness_of_chocolate * 2;
            int Total_Testiness_of_chandy = Testiness_of_candy * 5;

            if(Total_Tastiness_of_chocolate >Total_Testiness_of_chandy)
                System.out.println("Chocolate");

            else if(Total_Testiness_of_chandy > Total_Tastiness_of_chocolate)
                System.out.println("Candy");

            else{
                System.out.println("Either");
            }
        }
    }
}
