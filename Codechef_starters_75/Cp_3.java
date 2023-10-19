package Codechef_starters_75;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int First_no = sc.nextInt();
            int Second_no = sc.nextInt();
            int Third_no = sc.nextInt();
            int Fourth_no = sc.nextInt();
            int count = 0;
            int lower_bound_Value = Math.max(First_no,Third_no);
            int upper_bound_Value = Math.min(Second_no,Fourth_no);

            if(lower_bound_Value > upper_bound_Value){
                count = (Second_no -First_no+1) + (Fourth_no-Third_no+1);
            }else {
                count = (Second_no-First_no+1)+(Fourth_no-Third_no+1)-(upper_bound_Value - lower_bound_Value +1);
            }
            System.out.println(count);
        }
    }
}
