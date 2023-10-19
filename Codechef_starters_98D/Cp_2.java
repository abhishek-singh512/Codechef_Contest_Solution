package Codechef_starters_98D;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0) {
               int x_numbers = sc.nextInt();
                int y_numbers = sc.nextInt();
                int z_numbers = sc.nextInt();
                if (x_numbers*z_numbers % y_numbers == 0) {
                    System.out.println(x_numbers*z_numbers + " " + y_numbers);
                } else if (y_numbers*z_numbers % x_numbers == 0) {
                    System.out.println(y_numbers*z_numbers + " " + x_numbers);
                } else if (x_numbers*y_numbers % z_numbers == 0) {
                    System.out.println(x_numbers*y_numbers + " " + z_numbers);
                }
                else {
                    System.out.println("-1");
                }
        }
    }
}
