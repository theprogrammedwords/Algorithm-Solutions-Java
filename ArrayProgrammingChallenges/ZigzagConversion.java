/*Problem Description
The string "LEARNBYDOING" is written in a zigzag pattern on a given number of rows like this

L Y
E B D G
A N O N
R I

And then read the zigzag form by row as "LYEBDGANONRI" for the given string.

Input format
First line will contain a number N and a string of size N.
Second line will contain the number of rows R.

Output format
Print the output string in a newline.

Sample Input 1
12 LEARNBYDOING
4

Sample Output 1
LYEBDGANONRI

Explanation
L Y
E B D G
A N O N
R I

Constraints
0<=N<=10000
1<=R<=10000
*/
import java.util.*;

class ZigzagConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int k = sc.nextInt();
        String result = zigzagConversion(n, str, k);
        System.out.println(result);
    }

    static String zigzagConversion(int n, String str, int k) {

        char[] myChar = str.toCharArray();
        List<StringBuilder> rows = new ArrayList<>();

        for(int i=0; i< Math.min(myChar.length, k); i++){
            rows.add(new StringBuilder());
        }

        int currPos = 0;
        boolean goingDown = false;

        for(char c : myChar){
            rows.get(currPos).append(c);
            if(currPos ==0 || currPos== k-1) goingDown = !goingDown;
            currPos += goingDown ? 1 : -1;
        }    

        String result = "";

        for(int i=0; i<rows.size(); i++){
            result += rows.get(i);
        }
        
        return result;
    }
}
