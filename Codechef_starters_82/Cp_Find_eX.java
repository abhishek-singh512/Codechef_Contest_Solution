package Codechef_starters_82;

import java.util.Scanner;

public class Cp_Find_eX {
    public static void main(String[] args) {
        // Find eX
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            long Enter_First_no = sc.nextLong();
            long Enter_Second_no = sc.nextLong();
            long Enter_Third_no = sc.nextLong();
            long Enter_Fourth_no = sc.nextLong();
            if((Enter_First_no+1) % Enter_Second_no == (Enter_Third_no+1) % Enter_Fourth_no){
                System.out.println(1);
                continue;
            }
            long value = lcm(Enter_Second_no,Enter_Fourth_no);
            System.out.println(value-(Enter_First_no% Enter_Second_no));
        }
    }
    private  static long gcd(long First_no,long Second_no){
        if(Second_no ==0){
            return First_no;
        }else {
            return gcd(Second_no ,First_no % Second_no );
        }
    }
    private  static long lcm(long First_no,long Second_no){
      return (First_no * Second_no) / gcd(First_no,Second_no);
    }
}
