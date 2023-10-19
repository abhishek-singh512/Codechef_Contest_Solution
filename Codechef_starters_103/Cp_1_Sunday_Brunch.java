package Codechef_starters_103;

import java.util.Scanner;

public class Cp_1_Sunday_Brunch {
    public static void main(String[] args) {
        //Sunday Brunch
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int No_of_plate_chef_Pre = sc.nextInt();
            int No_of_Plate_each_person_Take = sc.nextInt();
            int Total_feed = No_of_plate_chef_Pre / No_of_Plate_each_person_Take;
            if(Total_feed>20){
                System.out.println("20");
            }else {
                System.out.println(Total_feed);
            }
        }
    }
}
