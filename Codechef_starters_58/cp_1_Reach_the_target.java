package Codechef_starters_58;

import java.util.Scanner;

public class cp_1_Reach_the_target {
    public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            if(t<1||t>10)
            {
                System.exit(0);
            }
            else
            {
                for(int i=0;i<t;i++)
                {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    if(x>=50||y>=200||x<=200||y>100 || y<x)
                    {
                        System.out.println(x-y);
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
        }
    }

