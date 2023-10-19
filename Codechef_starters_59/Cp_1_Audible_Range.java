package Codechef_starters_59;
import java.io.*;
import java.util.Scanner;

public class Cp_1_Audible_Range {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

       while(t-->0){
           int abhi=sc.nextInt();
           if(abhi>=67 && abhi<=45000){
               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }
       }
    }
}


