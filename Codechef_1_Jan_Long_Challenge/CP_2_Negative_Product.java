package Codechef_1_Jan_Long_Challenge;

import java.util.Scanner;

public class CP_2_Negative_Product {
    public static void main(String[] args) {
        // Negative Product
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int Enter_First_No = sc.nextInt();
            int Enter_Second_No = sc.nextInt();
            int Enter_Third_No = sc.nextInt();

            if(Enter_First_No*Enter_Second_No<0 || Enter_Second_No*Enter_Third_No<0 || Enter_First_No*Enter_Third_No<0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
