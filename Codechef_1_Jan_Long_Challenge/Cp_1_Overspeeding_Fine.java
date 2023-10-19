package Codechef_1_Jan_Long_Challenge;

import java.util.Scanner;

public class Cp_1_Overspeeding_Fine {
    public static void main(String[] args) {
        // Overspeeding Fine
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Driving_speed_of_Chef = sc.nextInt();
            if(Driving_speed_of_Chef<=70){
                System.out.println("0");
            }else if(70<Driving_speed_of_Chef && Driving_speed_of_Chef<=100){
                System.out.println("500");
            }else{
                System.out.println("2000");
            }
        }
    }
}
