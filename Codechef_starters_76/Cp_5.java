package Codechef_starters_76;

import java.util.Scanner;
public class Cp_5 {
    public static void main(String[] args) {
        // Not Divisible
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int No_of_element = sc.nextInt();
            for(int i=0;i<No_of_element;i++){
                if(i%2==0){
                    System.out.println(1+" ");
                }else{
                    System.out.println(0+" ");
                }
            }
            System.out.println();
        }
    }
}
