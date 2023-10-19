package Codechef_starters_71;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int x = sc.nextInt();
            int y =sc.nextInt();
            if (x > (y*10) ){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
