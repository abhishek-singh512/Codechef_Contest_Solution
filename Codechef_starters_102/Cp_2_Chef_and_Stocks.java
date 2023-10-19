package Codechef_starters_102;

import java.util.Scanner;

public class Cp_2_Chef_and_Stocks {
    public static void main(String[] args) {
        //Chef and Stocks
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int profit_earned_by_Chef = sc.nextInt();
            int answer=0;
            int minimun_Value_Assumption =1000;
            while(profit_earned_by_Chef > 0){
                int value =sc.nextInt();
                answer += value;
                if(value < minimun_Value_Assumption){
                    minimun_Value_Assumption = value;
                }
                profit_earned_by_Chef --;
            }
            answer = answer - minimun_Value_Assumption;
            System.out.println(answer);
        }
    }
}
