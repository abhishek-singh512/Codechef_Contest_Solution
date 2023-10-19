package Codechef_starters_74;

import java.util.Scanner;

public class Cp_5 {
    public static void main(String[] args) {
        // HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int Enter_the_First_No = sc.nextInt();
            int Enter_Second_No = sc.nextInt();
            int Storing_gcd_of_First_Second_No = gcd(Enter_the_First_No,Enter_Second_No);
            int d = lcm(Enter_the_First_No, Storing_gcd_of_First_Second_No) - gcd(Enter_Second_No, Storing_gcd_of_First_Second_No);
            System.out.println(d);
        }
    }
    static int gcd(int Enter_First_value, int Enter_Second_Value) {
        int r = 0, First_No, Second_No;
        First_No = (Enter_First_value > Enter_Second_Value) ? Enter_First_value : Enter_Second_Value; // a is greater number
        Second_No = (Enter_First_value < Enter_Second_Value) ? Enter_First_value : Enter_Second_Value; // b is smaller number
        r = Second_No;
        while (First_No % Second_No != 0) {
            r = First_No % Second_No;
            First_No = Second_No;
            Second_No = r;
        }
        return r;
    }
    static int lcm(int Calling_First_value, int Calling_Second_value) {
        int First_value_No;
        First_value_No = (Calling_First_value > Calling_Second_value) ? Calling_First_value : Calling_Second_value; // a is greater number
        while (true) {
            if (First_value_No % Calling_First_value == 0 && First_value_No % Calling_Second_value == 0)
                return First_value_No;
            ++First_value_No;
        }
    }
}




