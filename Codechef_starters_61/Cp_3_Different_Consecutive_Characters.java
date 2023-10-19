package Codechef_starters_61;

import java.util.Scanner;

public class Cp_3_Different_Consecutive_Characters {
    public static void main(String[] args) {
        // Different Consecutive Characters
        Scanner sc= new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Integer_N = sc.nextInt();
            String str = sc.next();
            int count = 0;
            for(int i=0; i<Integer_N-1; i++){
                int value_1 = str.charAt(i)-'0';
                int value_2 = str.charAt(i+1)-'0';
                if(value_1 == value_2){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

