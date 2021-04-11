/*Given a number n, you have to print a diamond-shaped pattern with 2n-1 rows using '*'.

For eg. if n = 5 pattern will be:*/

import java.util.*;

class DiamondPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

    }

    static String[] diamondPrinting(int n) {
        String[] result = new String[2*n+1];
        for(int i=0; i< n; i++){
            result[i] = oneline(i,n); 
        }

        for(int i=2*n-1; i>= n; i--){
            result[i-1] = oneline(i+1,n); 
        }
    return result;
    }

    static String oneline(int index, int num){

        int prefix = Math.abs(num - index);
        String spaceline ="";
        String line="";
        for(int j=1; j < prefix; j++){
            line = line+ " ";
        }


        for(int i=0; i<=num-prefix; i++){
                line+= "* ";
        }

        line= spaceline +" "+line+ spaceline;
        return line;
    }
}
