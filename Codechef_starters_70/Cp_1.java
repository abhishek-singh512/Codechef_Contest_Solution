package Codechef_starters_70;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // Kitchen Timings
        Scanner sc = new Scanner(System.in);
        int Test_case=sc.nextInt();
        while (Test_case-->0){
            int First_timing_hour = sc.nextInt();
            int Second_timimg_hour = sc.nextInt();
            System.out.println(Second_timimg_hour - First_timing_hour);
        }
    }
}
