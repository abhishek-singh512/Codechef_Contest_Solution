package Codechef_starters_70;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Spice Level
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Enter_the_No = sc.nextInt();
            if(Enter_the_No < 4 ){
                System.out.println("Mild");
            }else if(Enter_the_No >= 4 && Enter_the_No < 7){
                System.out.println("Medium");
            }else{
                System.out.println("Hot");
            }
        }
    }
}
