package Codechef_1_Oct_Long_Challenge;

import java.util.Scanner;

public class Cp_2_Minimum_Pizzas {
    public static void main(String[] args){
        //Minimum Pizzas
        Scanner sc=new Scanner(System.in);
        int Required_Pizza;
        int t=sc.nextInt();
        while(t-->0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            int Total_slice_Required = N*X;

            if(Total_slice_Required%4==0){
                Total_slice_Required=Total_slice_Required/4;
                System.out.println(Total_slice_Required);
            }
            else {
                Total_slice_Required =Total_slice_Required /4+1;
                System.out.println(Total_slice_Required);
            }

        }
    }
}
