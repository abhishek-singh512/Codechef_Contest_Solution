package Codechef_starters_85;

import java.util.Scanner;

public class Cp_Inside_The_Stadium_1 {
    public static void main(String[] args) {
        // Cp_Inside_The_Stadium
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int No_of_Match_Played = sc.nextInt();
            int[] runs_array = new int[No_of_Match_Played];
            for(int i=0;i<No_of_Match_Played;i++){
                runs_array[i]=sc.nextInt();
            }
            int Count = Strike_of_Subham_Gill(No_of_Match_Played , runs_array);
            System.out.println(Count);
        }
    }
    public static int Strike_of_Subham_Gill(int number_of_runs,int runs_made_by_Subham_gill[]){
        int Strike_runs=0,count_of_Exactly_100_Strike=0;
        for(int i=0;i<number_of_runs;i++){
            Strike_runs = Strike_runs + runs_made_by_Subham_gill[i];
            if(Strike_runs * 100 == (i+1) * 100){
                count_of_Exactly_100_Strike ++;
            }
        }
        return count_of_Exactly_100_Strike;
    }
}
