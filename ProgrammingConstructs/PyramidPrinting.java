/*Given a number n, you have to print a triangle-shaped pattern with n rows using '*'.
For eg. if n = 4 pattern will be:
* 
* * 
* * * 
* * * * 
*/
import java.util.*;

class PyramidPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }

    static String[] pyramidPrinting(int n) {
        String[] result =new String[n];
        for(int i=0; i<n; i++){
            result[i]="";
            for(int j=0; j<=i; j++){
                result[i]= result[i]+ "* ";
            }
        }
        return result;
    }
}
