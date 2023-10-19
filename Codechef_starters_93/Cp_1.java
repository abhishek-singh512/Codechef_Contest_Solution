package Codechef_starters_93;

import java.util.Scanner;

public class Cp_1 {
    public static void main(String[] args) {
        // 7 rings
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int items_Chef_bought = sc.nextInt();
            int the_cost_per_item = sc.nextInt();

            int Total_cost = items_Chef_bought * the_cost_per_item ;

            String str = Total_cost +"";
            char first_position = str.charAt(0);

            if(first_position=='0'){
                System.out.println("NO");
            }else{
                if(str.length()==5){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
