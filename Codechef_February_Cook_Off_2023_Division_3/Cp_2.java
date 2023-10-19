package Codechef_February_Cook_Off_2023_Division_3;

import java.util.HashSet;
import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Bi Palindrome
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Number_taken_as_a_Input =sc.nextInt();
            String str_taken = sc.next();
            HashSet<Character> set = new HashSet<>();
            boolean flag_input = false;
            for(int i=0;i<Number_taken_as_a_Input;i++){
                if(set.contains(str_taken.charAt(i))){
                    flag_input = true;
                    break;
                }
                set.add(str_taken.charAt(i));
            }
            if(flag_input==true){
                System.out.println(Number_taken_as_a_Input-2);
            }else{
                System.out.println(-1);
            }
        }
    }
}
