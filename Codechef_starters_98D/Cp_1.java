package Codechef_starters_98D;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // your code goes here
        int Messi_Goals = sc.nextInt();
        int Messi_Assists = sc.nextInt();
        int Ronaldo_Goals = sc.nextInt();
        int Ronaldo_Assists = sc.nextInt();
        int a = ((Messi_Goals * 2) + Messi_Assists); // a value show the messi points
        int b = ((Ronaldo_Goals * 2) + Ronaldo_Assists); // b value show the ronaldo points
        if (a > b) {         // greater then sign change to
            System.out.println("Messi");
        } else if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Ronaldo");
        }
    }
}
