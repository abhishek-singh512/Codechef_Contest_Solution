package Codechef_starters_73;

import java.util.Scanner;

public class Cp_6 {
    public static void main(String[] args) {
        // Find an integer
        Scanner sc = new Scanner(System.in);
        long Test_case= sc.nextInt();
        while(Test_case-->0){
            long First_No = sc.nextInt();
            long Second_No = sc.nextInt();
            long Number = First_No * Second_No-First_No-Second_No;
            if(Number==-1){
                Number = Math.max(First_No,Second_No)-1;
            }
            if(Number==0){
                Number=2;
            }
            if(Number ==0){
                System.out.println(5);
            }else{
                System.out.println(Number);
            }
        }
    }
}
