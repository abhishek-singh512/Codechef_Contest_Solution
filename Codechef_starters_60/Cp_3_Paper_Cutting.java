package Codechef_starters_60;
import java.util.Scanner;

public class Cp_3_Paper_Cutting {
    public static void main(String[] args) {
        //Paper Cutting
        Scanner sc=new Scanner(System.in);
        int Test_case=sc.nextInt();
        while (Test_case-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans =(x/y)*(x/y);
            System.out.println(ans);
        }
    }
}
