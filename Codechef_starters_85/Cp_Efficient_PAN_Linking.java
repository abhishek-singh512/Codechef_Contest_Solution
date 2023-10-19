package Codechef_starters_85;

import java.util.Scanner;

public class Cp_Efficient_PAN_Linking {
    public static void main(String[] args) {
        // Efficient PAN Linking
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Number_of_Application = sc.nextInt();
            int Application_Remian_unprocessed = Number_of_Application % 20;
            System.out.println(Application_Remian_unprocessed);
        }
    }
}
