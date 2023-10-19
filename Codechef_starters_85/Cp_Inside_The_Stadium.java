package Codechef_starters_85;

import java.util.Scanner;

public class Cp_Inside_The_Stadium {
    public static void main(String[] args) {
        // Inside The Stadium
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
           int No_of_Match_Played = sc.nextInt();
           int[] array = new int[No_of_Match_Played];
           for(int i=0;i<array.length;i++){
               array[i]=sc.nextInt();
           }

           int sum =0;
           int count=0;
           for(int i=0;i<array.length;i++){
               sum = sum+array[i];
              int  Strik_rate_of_a_player = sum % (array[i]+1) ;
              int  strike_per_ball = Strik_rate_of_a_player *100;

              if(strike_per_ball == 100){
                  count++;
              }
           }
            System.out.println(count);
        }
    }
}
