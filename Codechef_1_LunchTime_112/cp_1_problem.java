package Codechef_1_LunchTime_112;
import java.util.Scanner;

class cp_1_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        for( int i=0;i<P;i++){
            int Abhishek = sc.nextInt();
            if(Abhishek<7){
                System.out.println("yes");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}

