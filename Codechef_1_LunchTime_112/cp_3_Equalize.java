package Codechef_1_LunchTime_112;
import java.util.Scanner;

public class cp_3_Equalize{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Abhi = sc.nextInt();
        while(Abhi -->0){

            int x = sc.nextInt();
            int a = sc.nextInt();
            int z = sc.nextInt();

            if((a-x)%(z*2)==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

