package Codechef_starters_77;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int speeds_of_Jerry = sc.nextInt();
            int speeds_of_Tom = sc.nextInt();
            if(speeds_of_Jerry<speeds_of_Tom){
                System.out.println("Yes");
            }else if(speeds_of_Jerry == speeds_of_Tom){
                System.out.println("No");
            }else{
                System.out.println("No");
            }
        }
    }
}
