package Codechef_starters_60;
import java.util.Scanner;

public class Cp_1_Tax_in_Chefland {
    public static void main(String[] args) {
        //Tax in Chefland
        Scanner sc=new Scanner(System.in);
        int Test_case=sc.nextInt();
        while(Test_case-->0){
            int Money = sc.nextInt();
            if(Money>100){
                System.out.println(Money-10);
            }else{
                System.out.println(Money);
            }
        }
    }
}
