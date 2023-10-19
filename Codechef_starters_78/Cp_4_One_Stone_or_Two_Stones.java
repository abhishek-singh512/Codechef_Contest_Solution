package Codechef_starters_78;

import java.util.Scanner;

public class Cp_4_One_Stone_or_Two_Stones {
    public static void main(String[] args) {
        // One Stone or Two Stones
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int First_input_no = sc.nextInt();
            int Secound_input_no = sc.nextInt();
            if((First_input_no/2 > Secound_input_no/2) || ( First_input_no % 2==1 && (First_input_no==Secound_input_no ||First_input_no+1 == Secound_input_no))){
                System.out.println("Chef");
            }else{
                System.out.println("Chefina");
            }
        }
    }
}
