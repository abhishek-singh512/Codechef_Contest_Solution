package Codechef_starters_104;

import java.util.Scanner;

public class Cp_5_Maximise_Sum {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-- > 0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            long sum = maximize(arr,n);
            System.out.println(sum);
        }

    }
    private static long maximize(int [] arr,int n){
        int [] left = new int[n];
        int [] right = new int[n];

        int max = arr[0];
        for(int i = 1 ; i<n-1 ; i++){
            max = Math.max(max,arr[i]);
            left[i] = max;
        }
        left[0] = arr[0];
        left[n-1] = arr[n-1];

        max = arr[n-1];
        for(int i = n-2 ; i>0 ; i--){
            max = Math.max(max,arr[i]);
            right[i] = max;
        }
        right[0] = arr[0];
        right[n-1] = arr[n-1];

        long sum = 0;
        for(int i = 0; i<n ; i++){
            int min = Math.min(left[i],right[i]);
            sum += min;
        }
        return sum;
    }
}
