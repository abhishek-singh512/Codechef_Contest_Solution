package Codechef_starters_74;

import java.util.Scanner;

public class Cp_3_Odd_Even_Binary_String {
    public static void main(String[] args) {
        // Odd Even Binary String
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Numbers = sc.nextInt();
            int counting_Valus = 0;
            for(int i=0;i<Numbers;i++){
                int Enter_String_Value= sc.nextInt();
                if(Enter_String_Value==0){
                    counting_Valus++;
                }
            }
            if(counting_Valus % 2 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
