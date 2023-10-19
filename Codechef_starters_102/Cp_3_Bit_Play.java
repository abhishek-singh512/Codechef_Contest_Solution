package Codechef_starters_102;

import java.util.ArrayList;
import java.util.Scanner;

public class Cp_3_Bit_Play {
    public static void main(String[] args) {
        //Bit Play
        Scanner sc = new Scanner(System.in);
        int Test_Case = sc.nextInt();
        while (Test_Case-- > 0) {
            int Length_of_String = sc.nextInt();
            String Binary_String_str = sc.next();
            ArrayList<Integer> Storing_ArrayList = new ArrayList<>();

            for (int i = 2; i < Length_of_String; i = i + 2) {
                char First_no = Binary_String_str.charAt(i - 2);
                char Second_no = Binary_String_str.charAt(i - 1);
                char Third_no = Binary_String_str.charAt(i);

                if (First_no != Second_no) {
                    if (Third_no == '1') {
                        Storing_ArrayList.add(2);
                    } else {
                        Storing_ArrayList.add(1);
                    }
                } else if (First_no == '1') {
                    if (Third_no == '1') {
                        Storing_ArrayList.add(2);
                    } else {
                        Storing_ArrayList.add(1);
                    }
                } else {
                    if (Third_no == '1') {
                        Storing_ArrayList.add(0);
                    } else {
                        Storing_ArrayList.add(3);
                    }
                }
            }
            long answer = 1;
            int modulo = (int) 1e9 + 7;
            for (int val : Storing_ArrayList) {
                answer *= val;
                answer %= modulo;
            }
            System.out.println(answer);
        }
    }
}
