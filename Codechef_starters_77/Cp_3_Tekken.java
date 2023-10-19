//package Codechef_starters_77;
//
//import java.util.Scanner;
//
//public class Cp_3_Tekken {
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int Test_case = sc.nextInt();
//      while (Test_case-->0){
//          int Anna = sc.nextInt();
//          int Bob = sc.nextInt();
//          int Calido = sc.nextInt();
//          if(Anna>Bob & Anna>Calido){
//              int First_fight=Math.min(Anna,Bob);
//              int new_Anna = Anna-First_fight,new_Bob = Bob-First_fight;
//              int Second_fight=Math.min(new_Bob,Calido);
//              int new_Bob_2 = new_Bob-Second_fight,new_calido =Calido-Second_fight;
//              int Third_fight = Math.min(new_Anna,new_calido);
//              int positive_Anna=new_Anna-Third_fight;
//              if(positive_Anna>0){
//                  System.out.println("Yes");
//              }else{
//                  System.out.println("NO");
//              }
//          }else{
//              System.out.println("NO");
//          }
//      }
//    }
//}

package Codechef_starters_77;

import java.util.Scanner;

public class Cp_3_Tekken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int Anna = sc.nextInt();
           int Bob = sc.nextInt();
           int Calido = sc.nextInt();
           if(Math.abs(Bob-Calido)>=Anna){
               System.out.println("No");
           }else{
               System.out.println("Yes");
           }
        }
    }
}


