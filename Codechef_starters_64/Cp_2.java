package Codechef_starters_64;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Distict color
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i = 0; i<n; i++) {
                arr[i]=sc.nextInt();
            }
            int maximum = 0;
            for(int i=0;i<n;i++)
                if(maximum<arr[i])
                {
                    maximum = arr[i];
                }
            System.out.println(maximum);
        }
    }
}
