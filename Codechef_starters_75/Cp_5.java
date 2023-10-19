package Codechef_starters_75;

import java.util.Scanner;

public class Cp_5 {
    public static void main(String[] args) {
        // Prefix ones
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int First_no=0;
            int Second_no=0;
            int Third_no = 0;
            int Fouth_no = 0;
            int Numbers = sc.nextInt();
            String s = sc.next();
            while (Fouth_no<Numbers && s.charAt(Fouth_no)=='1'){
                Fouth_no++;
                Second_no++;
            }
            for(int i=Fouth_no;i<Numbers;i++){
                if(s.charAt(i) =='1'){
                    First_no++;
                }else{
                    Third_no = Math.max(Third_no,First_no);
                    First_no=0;
                }
            }
            Third_no = Math.max(Third_no,First_no);
            System.out.println(Third_no + Second_no);

        }
    }
}
