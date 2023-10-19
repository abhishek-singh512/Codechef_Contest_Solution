package Codechef_1_Oct_Long_Challenge;

import java.util.Scanner;

public class Cp_4_Single_Operation_Part_1_Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int abhi=sc.nextInt();
        while(abhi-->0){
            int String_length = sc.nextInt();
            String Binary_String=sc.next();

            int count=1;
            for(int i=1;i<String_length;i++){
                if(Binary_String.charAt(i)=='1'){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
