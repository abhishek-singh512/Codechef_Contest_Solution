package Codechef_starters_64;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Water Consumption
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int Abhi = sc.nextInt();
            if(Abhi>=2000){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
