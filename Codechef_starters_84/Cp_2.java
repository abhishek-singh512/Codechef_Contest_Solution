package Codechef_starters_84;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Melt Gold
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
          int Melting_point_of_Oreo = sc.nextInt();
          int initial_temperature_of_klin = sc.nextInt();
          int Count_of_min = 1;
          while ( initial_temperature_of_klin < Melting_point_of_Oreo  ) {
              initial_temperature_of_klin = initial_temperature_of_klin + Count_of_min;
              Count_of_min++;
          }
            System.out.println(Count_of_min-1);
        }
    }
}
