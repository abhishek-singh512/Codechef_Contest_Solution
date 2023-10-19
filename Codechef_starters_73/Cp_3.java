package Codechef_starters_73;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        // Lucky Numbers
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
          int Entered_No = sc.nextInt();
          int count_of_Seven_No = 0;
          while (Entered_No>0){
              int remainder = Entered_No % 10;
              if(remainder == 7){
                  count_of_Seven_No++;
              }
              Entered_No = Entered_No/10;
          }
          if(count_of_Seven_No!=0){
              System.out.println("Yes");
          }else{
              System.out.println("No");
          }
        }
    }
}
