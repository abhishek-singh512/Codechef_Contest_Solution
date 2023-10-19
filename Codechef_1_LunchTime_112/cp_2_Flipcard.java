//import java.util.Scanner;
//
//public class cp_2_Flipcard {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int p= sc.nextInt();
//        for(int n=2; n<=p; n++) {
//
//            int s =sc.nextInt();
//            int x = sc.nextInt();
//            if (x == 0) {
//                System.out.println(x);
//            }else if(s==x){
//                System.out.println("0");
//            }
//            else if(x<s) {
//                System.out.println(x);
//            }
//
//        }
//
//
//    }
package Codechef_1_LunchTime_112;
import java.util.Scanner;

public class cp_2_Flipcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abhi = sc.nextInt();

        while (abhi -->0){

            int pura = sc.nextInt();
            int rise = sc.nextInt();
            int below = pura - rise;

            System.out.println(Math.min(rise,below));
        }
    }
}

//import java.util.Scanner;
//
//public class cp_2_Flipcard {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-->0){
//
//            int total= sc.nextInt();
//            int up = sc.nextInt();
//            int down = total - up;
//
//            System.out.println(Math.min(up,down));
//        }
//    }
//}

