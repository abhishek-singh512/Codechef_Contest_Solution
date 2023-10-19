package Codechef_starters_59;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int abhi = sc.nextInt();
        while (abhi-->0){
            String s=sc.next();

            int calculate=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    calculate++;
                    if(calculate>2){
                        System.out.println("Happy");
                        break;
                    }
                }
                else {
                    calculate=0;
                }
            }
            if(calculate<=2){
                System.out.println("sad");
            }
        }
    }
}
