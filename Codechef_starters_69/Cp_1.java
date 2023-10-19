package Codechef_starters_69;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int rainfall=sc.nextInt();
            if(rainfall < 3){
                System.out.println("Light");
            }
            else if(rainfall >=3 && rainfall<7){
                System.out.println("Moderate");
            }else{
                System.out.println("Heavy");
            }
        }
    }
}
