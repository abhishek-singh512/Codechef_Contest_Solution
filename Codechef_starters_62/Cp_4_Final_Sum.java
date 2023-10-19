package Codechef_starters_62;

import java.util.Scanner;

public class Cp_4_Final_Sum {
    public static void main(String[] args) {
        // Final Sum
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int sum = 0;
            int count = 0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            while (q-->0){
                int left = sc.nextInt();
                int right = sc.nextInt();
                int x = left - right+1;
                if(x % 2!=0){
                    count++;
                }
            }
            System.out.println(sum + count);
        }
    }
}
