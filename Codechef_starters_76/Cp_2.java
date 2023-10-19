package Codechef_starters_76;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // 400M race
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){

            int X_Alice_speed = sc.nextInt();
            int y_Bob_Speed = sc.nextInt();
            int Z_Charlie_Speed = sc.nextInt();
            if(X_Alice_speed<y_Bob_Speed && X_Alice_speed<Z_Charlie_Speed){
                System.out.println("Alice");
            }else if(y_Bob_Speed<X_Alice_speed && y_Bob_Speed<Z_Charlie_Speed){
                System.out.println("Bob");
            }else{
                System.out.println("Charlie");
            }
        }
    }
}
