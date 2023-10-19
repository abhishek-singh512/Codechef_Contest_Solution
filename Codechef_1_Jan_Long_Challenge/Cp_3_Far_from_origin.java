package Codechef_1_Jan_Long_Challenge;

import java.util.Scanner;

public class Cp_3_Far_from_origin {
    public static void main(String[] args) {
        // Far from origin
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y2 = sc.nextInt();

            double hypotlen1 = StrictMath.hypot(x1,y1);
            double hypotlen2 = StrictMath.hypot(x2,y2);
            if(hypotlen2 > hypotlen1){
                System.out.println("Bob");
            }else if(hypotlen1 == hypotlen2){
                System.out.println("Equal");
            }else{
                System.out.println("Alex");
            }
        }
    }
}
