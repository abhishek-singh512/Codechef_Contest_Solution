package Codechef_starters_99D;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number_of_team = sc.nextInt();
        if (Number_of_team >= 6 && Number_of_team <= 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
