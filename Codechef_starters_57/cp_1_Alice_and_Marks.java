package Codechef_starters_57;

import java.util.Scanner;

public class cp_1_Alice_and_Marks {
    public static void main(String[] args) {
            //program using nested if-else
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>=1 && x<=1000 || y>=1 && y<=1000 )
            {
                if(x>=2*y){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
    }
}

