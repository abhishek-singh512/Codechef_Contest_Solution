package Codechef_starters_76;

import java.util.Scanner;

public class Cp_6 {
    public static void main(String[] args) {
        // Make Array odd
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while(Test_case-->0){
        int No_Of_element_we_take = sc.nextInt();
        int X=sc.nextInt();
        int array[] = new int[No_Of_element_we_take];
        int Even_no=0, odd_no=0;
        for(int i=0;i<No_Of_element_we_take;i++){
            array[i]=sc.nextInt();
            if(array[i]%2==0){
                Even_no++;
            }else{
                odd_no++;
            }
        }
        if(Even_no ==0){
            System.out.println(0);
        }else{
            if(odd_no==0 && X % 2==0){
                System.out.println(-1);
            }else if(odd_no!=0 && X%2==0){
                System.out.println(Even_no);
            }else{
                System.out.println(Even_no % 2 + Even_no/2);
            }
        }
        }
    }
}
