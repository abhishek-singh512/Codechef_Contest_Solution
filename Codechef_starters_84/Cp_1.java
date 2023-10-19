package Codechef_starters_84;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Elections in Chefland
        Scanner sc = new Scanner(System.in);
        int Test_case =sc.nextInt();
        while (Test_case-->0){
            int Number_of_People=sc.nextInt();
            int Minimum_age=sc.nextInt();
            int[] array_of_People = new int[Number_of_People];
            for(int i=0;i<array_of_People.length;i++){
                 array_of_People[i]=sc.nextInt();
            }
            int Count_of_people=0;
            for(int i=0;i<array_of_People.length;i++){
                if(array_of_People[i]>=Minimum_age) {
                    Count_of_people++;
                }
            }
            System.out.println(Count_of_people);
        }
    }
}
// https://www.codechef.com/START84C/problems/ELECTN