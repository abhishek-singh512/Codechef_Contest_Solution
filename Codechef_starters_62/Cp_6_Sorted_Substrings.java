package Codechef_starters_62;

import java.util.Scanner;

public class Cp_6_Sorted_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sorted Substrings
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int count=0;
            for(int i=0;i<n-1;i++){
                if(str.charAt(i)=='1' && str.charAt(i+1)=='0')
                    count++;
            }
            System.out.println(count);
        }
    }
}
