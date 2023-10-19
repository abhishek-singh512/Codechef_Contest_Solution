package Codechef_1_Jan_Long_Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Cp_5_Array_Halves {
    public static void main(String[] args) {
        // Array Halves
        Scanner sc=new Scanner(System.in);
        int Test_case=sc.nextInt();
        while(Test_case-->0) {

            int Numbers = sc.nextInt();
            int array_first[]=new int[2*Numbers];
            int array_Second[]=new int[2*Numbers];
            for(int i=0;i<2*Numbers;i++){
                array_first[i]=sc.nextInt();
            }
            for(int i=0;i<2*Numbers;i++){
                array_Second[i]=array_first[i];
            }
            Arrays.sort(array_Second);
            int target_value=array_Second[Numbers-1];
            long index_value=Numbers;
            long result_Value=0;
            for(int i=0;i<index_value;i++){
                if(array_first[i]>target_value){
                    result_Value+=index_value-i;
                    index_value++;
                }
            }
            System.out.println(result_Value);
        }
    }
}


