package Codechef_February_Cook_Off_2023_Division_3;

import java.util.Scanner;

public class Cp_1_Netflix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int alice_input=sc.nextInt();
            int bob_input = sc.nextInt();
            int charlie_input = sc.nextInt();
            int Subscription_input = sc.nextInt();
            if(alice_input + bob_input >= Subscription_input || bob_input + charlie_input >=Subscription_input || alice_input + charlie_input>=Subscription_input){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
