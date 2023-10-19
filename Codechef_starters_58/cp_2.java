package Codechef_starters_58;

import java.util.*;
import java.lang.*;

public class cp_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int number=sc.nextInt();
            int num2=0;
            int d=number/25;
            if(number%25!=0)
            {
                d++;
            }
            System.out.println(d);
            t=t-1;
        }
    }
}

