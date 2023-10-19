package Codechef_starters_60;

import java.util.Scanner;

public class Cp_2_Expert_Setter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Test_Case = sc.nextInt();

        while (Test_Case-->0){
            float x=sc.nextFloat();
            float y=sc.nextFloat();
            if(y/x>=0.5) {
                System.out.println("yes");
            }else {
                System.out.println("No");
            }
        }
    }
}

//            double percentage;
//            percentage= 100/x;
//            double total = percentage * y;
//            if(total >= 50){
//                System.out.println("yes");
//            }else {
//                System.out.println("No");

