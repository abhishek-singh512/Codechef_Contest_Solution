package Codechef_1_LunchTime_112;
import java.util.Scanner;

public class cp_4_StickBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abhi = sc.nextInt();
        while(abhi-->0){

            int ram = sc.nextInt();
            int sayam = sc.nextInt();

            if (ram % sayam ==0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
    }
}
