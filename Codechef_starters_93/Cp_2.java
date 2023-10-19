package Codechef_starters_93;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Problems
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();

        while (Test_case-->0){
            int Alice_problem = sc.nextInt();
            int Bob_problems = sc.nextInt();
            // alice 5 bob 19
            if (Alice_problem >= Bob_problems){
                int Difference_of_Both = Alice_problem - Bob_problems;
                if (Difference_of_Both % 2 == 0) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            } else {
                while (Bob_problems>= Alice_problem) {
                    if (Bob_problems == Alice_problem) {
                        System.out.println("Yes");
                        break;
                    } else {
                        Bob_problems --;
                        Alice_problem = Alice_problem + 3;

                        if (Alice_problem > Bob_problems){
                            int df = Alice_problem - Bob_problems;
                            if (df % 2 == 0) {
                                System.out.println("Yes");
                            } else {
                                System.out.println("No");
                            }
                        }
                    }
                }
            }
        }
    }
}

