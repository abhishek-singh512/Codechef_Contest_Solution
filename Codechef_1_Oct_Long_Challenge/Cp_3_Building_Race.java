package Codechef_1_Oct_Long_Challenge;

import java.util.Scanner;

public class Cp_3_Building_Race {
    public static void main(String[] args){
    // Building Race
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            float a,b,x,y;
            a= sc.nextInt();
            b=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();

            float w = a/x;
            float z = b/y;
            if(z>w){
                System.out.println("chef");
            }
            else if(w>z){
                System.out.println("chefina");
            }
            else{
                System.out.println("Both");
            }
        }
    }
}
