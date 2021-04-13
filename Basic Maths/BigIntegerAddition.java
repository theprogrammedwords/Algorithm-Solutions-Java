//Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find the sum of these two numbers.

import java.util.*;

class BigIntegerAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    static String bigIntegerAddition(String num1, String num2) {
        
        if(num1.length() > num2.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        String result = "";
        int n1 = num1.length();
        int n2 = num2.length();
        

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        int carry =0;
       
        
        for(int i=0; i< n1; i++){
           int sum = ((int)(num1.charAt(i) - '0') + 
                (int)(num2.charAt(i)- '0') +carry);
            result += (char)(sum % 10  + '0') ;
            carry = sum/10;
        }    

        for(int j = n1; j<n2; j++){
           int sum = ((int)(num2.charAt(j) - '0' ) +carry);
            result += (char)(sum % 10  + '0') ;
            carry = sum/10;
            
        }

        if(carry > 0){
            result += (char)(carry + '0');
        }


        result = new StringBuilder(result).reverse().toString();

        return result;
    }
}
