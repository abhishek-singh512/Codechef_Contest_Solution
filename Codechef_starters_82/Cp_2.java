package Codechef_starters_82;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // MIN To MAXS
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Numbers_Value_In_Array =sc.nextInt();
            int[] arr = new int[Numbers_Value_In_Array];

            int minimum = Integer.MAX_VALUE;
            for(int i=0;i<Numbers_Value_In_Array;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<minimum){
                    minimum = arr[i];
                }
            }
            int Count_value = 0;
            for(int i=0;i<Numbers_Value_In_Array;i++){
                if(arr[i]!=minimum){
                    Count_value++;
                }
            }
            System.out.println(Count_value);
        }
    }
}
