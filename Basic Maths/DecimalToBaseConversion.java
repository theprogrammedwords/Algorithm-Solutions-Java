//Given two numbers n in decimal and b you have to calculate the value of that number in base b.

import java.util.*;

class DecimalToBaseConversion {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        String result = decimalToBaseConversion(n, b);
        System.out.println(result);

    }

    static String decimalToBaseConversion(int n, int b) {
        String remainder="";

        
        while(n > 0){
            if(n%b <10){
                remainder = n%b +""+remainder; 
            }else if(n%b >= 10 && n%b  <= 16){
                int val = n%b;
                String c= "";
                if(val == 10)  c = "A";
                else  if(val ==11) c = "B";
                else  if(val ==12) c = "C";
                else  if(val ==13) c = "D";
                else  if(val ==14) c = "E";
                else  if(val ==15) c = "F";
            
            remainder = c +""+remainder;
            }

        n = n/b;
        }

        return remainder;
    }
}

