package Codechef_starters_59;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int abhi= sc.nextInt();
      while (abhi-->0){
          int p=sc.nextInt();
          int q= sc.nextInt();
          int r=sc.nextInt();

          int top1=p;
          int top2=q;
          if(top1>q && top1>r){
              System.out.println("Setter");
          }
          else if(top2>p && top2>r){
              System.out.println("Tester");
          }
          else{
              System.out.println("Editorialist");
          }
      }
    }
}

