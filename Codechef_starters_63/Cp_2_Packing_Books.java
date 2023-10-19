package Codechef_starters_63;

import java.util.Scanner;

public class Cp_2_Packing_Books {
    public static void main(String[] args) {
        // Packing Books
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(z>=y){
                System.out.println(x);
            }else if(y % z==0){
                System.out.println(x*(y/z));
            }else {
                System.out.println(x * (y / z +1) );

            }

        }
    }
}


/*
import java.util.Scanner;

public class Cp_2_Packing_Books {
    public static void main(String[] args) {
        // Packing Books
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(y==z){
                System.out.println(x);
            } else if(y > z) {
                int p = y / z;
                p = p + 1;
                System.out.println(p * x);
            } else if(z > y){
                System.out.println(x);
            }

        }
    }
}

*/
