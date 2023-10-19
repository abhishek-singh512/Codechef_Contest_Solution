package Codechef_starters_75;

import java.util.Scanner;

public class Cp_4 {
    public static void main(String[] args) {
        // Power of Two
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
       while (Test_case-->0){
            int String_str = sc.nextInt();
            String str = sc.next();
            int j_position = 0;
            for(int i_position=0; i_position<str.length();i_position++){
                if(str.charAt(i_position) == '1'){
                    j_position++;
                }
            }
            if(str.equals("1") || str.equals("10")){
                System.out.println("No");
            }else if(j_position<=3){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
