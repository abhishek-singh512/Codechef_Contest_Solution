package Codechef_starters_74;

import java.util.Scanner;

public class Cp_2 {
    public static void main(String[] args) {
        // Facebook
        Scanner sc = new Scanner(System.in);
        int Test_case =sc.nextInt();
        while (Test_case-->0){
            int num=sc.nextInt();
            int[] arr1_Likes=new int[num+2];
            int[] arr2_Comments=new int[num+2];

            for(int i=1; i<=num; ++i ){
                arr1_Likes[i]=sc.nextInt();
            }
            for(int i=1; i<=num; ++i ){
                arr2_Comments[i]=sc.nextInt();
            }
            int max = 0;
            int max_index_value =0;
            for(int i =1; i<=num; ++i)
            {
                if(arr1_Likes[i]>max )
                {
                    max = arr1_Likes[i];
                    max_index_value = i;
                }else if(arr1_Likes[i]==max )
                {
                    if(arr2_Comments[i]>arr2_Comments[max_index_value]){
                        max = arr1_Likes[i];
                        max_index_value = i;
                    }
                }
            }
            System.out.println(max_index_value);
        }
    }
}
