package Codechef_starters_72;

import java.util.Scanner;

public class Cp_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int Test_case = sc.nextInt();
        while(Test_case--!=0){
            int Abhi1=sc.nextInt();
            int Abhi2=sc.nextInt();
            if(Abhi1==1){
                System.out.println("1");
            }else{
                while(Abhi1!=Abhi2){
                    if(Abhi1>Abhi2){
                        Abhi1-=Abhi2;
                }
                else{
                    Abhi2-=Abhi1;
                }
                }
                System.out.println(Abhi1);
            }
        }
    }
}
