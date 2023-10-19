package Codechef_starters_59;

import java.util.Scanner;

public class Cp_4 {
    public static void main(String[] args) {
        // Suspense String
        Scanner sc=new Scanner(System.in);
        int Abhishek=sc.nextInt();
        while(Abhishek-->0){
            int abhi=sc.nextInt();
            String s=sc.next();

            String t="";
            int i=0;
            int j=abhi-1;
            while (i<=j){
                if(s.charAt(i)=='0'){
                    t=s.charAt(i)+t;
                }
                else {
                    t=t+s.charAt(i);
                }
                if(i<j) {
                    if (s.charAt(j) == '0')
                        t = t + s.charAt(j);
                    else
                        t = s.charAt(j) + t;
                    j--;
                }
                i++;
                }
            System.out.println(t);
        }
    }
}
