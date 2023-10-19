package Codechef_starters_76;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        //Redistributing Chocolates
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
         int Alice_have_Chocolates = sc.nextInt();
         int Bob_have_Chocolates = sc.nextInt();
         int Charlie_have_Chocolates = sc.nextInt();
         int Total_Chocolates=Alice_have_Chocolates + Bob_have_Chocolates + Charlie_have_Chocolates;
         if(Total_Chocolates>5){
             System.out.println("yes");
         }else{
             System.out.println("No");
         }

        }
    }
}
