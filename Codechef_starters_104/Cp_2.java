package Codechef_starters_104;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        //Double Rent
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while(Test_case-->0){
            int numbers = sc.nextInt();
            if(numbers>1 && numbers%2==1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
