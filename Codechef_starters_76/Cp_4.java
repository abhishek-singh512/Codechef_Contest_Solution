package Codechef_starters_76;

import java.util.Scanner;
public class Cp_4 {
    public static void main(String[] args) {
        // Zero String
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-->0){
            int No_of_String =sc.nextInt();
            String str=sc.next();
            int Count_Of_Zero = 0;
            int Count_of_One = 0;
            for(int i=0;i<No_of_String;i++){
                if(str.charAt(i)=='1'){
                    Count_of_One++;
                }else{
                    Count_Of_Zero++;
                }
            }
            if(Count_of_One > Count_Of_Zero)
            {
                System.out.println(Count_Of_Zero + 1);
            }else{
                System.out.println(Count_of_One);
            }
        }
    }
}
