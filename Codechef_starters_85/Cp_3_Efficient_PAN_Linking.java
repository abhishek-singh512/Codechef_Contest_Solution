package Codechef_starters_85;

import java.math.BigInteger;
import java.util.Scanner;

public class Cp_3_Efficient_PAN_Linking {
    public static void main(String[] args) {
        // Cp_Efficient_PAN_Linking
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while(Test_case-->0){
            String Enter_Total_Application = sc.next();
            String Application_unProcessed = Application_unProcessed_calculate(Enter_Total_Application);
            System.out.println(Application_unProcessed);
        }
    }
    public static String Application_unProcessed_calculate(String Total_Application){
        BigInteger n = new BigInteger(Total_Application);
        BigInteger Total_no_officers_in_chefland= new BigInteger("20");
        BigInteger processed = n.divide(Total_no_officers_in_chefland);
        BigInteger Application_unProcessed_till = n.subtract(processed.multiply(Total_no_officers_in_chefland));
        return  Application_unProcessed_till.toString();
    }

}
