package Codechef_starters_73;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Chef Plays Ludo
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Coming_No_On_The_die = sc.nextInt();
            if(Coming_No_On_The_die == 6){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
