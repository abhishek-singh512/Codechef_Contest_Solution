package Codechef_starters_73;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Multivitamin Tablets
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int No_Of_Days = sc.nextInt();
            int No_of_Tablets_chef_Already_have = sc.nextInt();
            if( 3 * No_Of_Days <= No_of_Tablets_chef_Already_have){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
