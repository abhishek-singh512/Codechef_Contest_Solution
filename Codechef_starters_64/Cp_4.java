package Codechef_starters_64;

import java.util.Scanner;

public class Cp_4 {
    public static void main(String[] args) {
       // Luigy
       Scanner sc = new Scanner(System.in);
       int Test_case = sc.nextInt();
       while (Test_case-->0){
           int n = sc.nextInt();
           int arr[] = new int[n];
           int min = Integer.MAX_VALUE;
           for(int i=0;i<n;i++)
           {
               arr[i] = sc.nextInt();
               if (min > arr[i]) {
                   min = arr[i];
               }
           }
               int count = 0;
               int count1 = 0;
               for(int i = 0;i<n;i++) {
                   if(arr[i] != min) {
                       if(arr[i]%min==0){
                           count++;
                       }else{
                        count1 =1;
                        break;
                   }
               }
           }
             if(count1==1) {
                 System.out.println(n);
             }else {
                 System.out.println(count);
             }
       }
    }
}

