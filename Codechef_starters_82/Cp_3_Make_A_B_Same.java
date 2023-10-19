package Codechef_starters_82;

import java.util.Scanner;

public class Cp_3_Make_A_B_Same {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Make A-B Same
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            New_Solver_Function();
        }
    }
    public static void New_Solver_Function() {
        int Numbers = sc.nextInt();
        int[] First_array = new int[Numbers];
        int[] Second_Array = new int[Numbers];
        for (int i = 0; i < Numbers; i++){
            First_array[i] = sc.nextInt();
        }
        for (int i = 0; i < Numbers; i++){
            Second_Array[i] = sc.nextInt();
        }
        if (First_array[0] != Second_Array[0]) {
            System.out.println("NO");
            return;
        }
        if (First_array[Numbers - 1] != Second_Array[Numbers - 1]) {
            System.out.println("NO");
            return;
        }
        int First_no = 0, Second_Number = 0;
        for (int i = 0; i < Numbers; i++) {
            if (First_array[i] == 0) First_no++;
            else Second_Number++;
        }
        for (int i = 1; i < Numbers - 1; i++) {
            if (First_array[i] != Second_Array[i] && First_array[i] == 0 && Second_Number == 0) {
                System.out.println("NO");
                return;
            }
            if (First_array[i] != Second_Array[i] && First_array[i] == 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
