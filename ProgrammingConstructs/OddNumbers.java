//Given a number N, you have to print all the odd numbers upto N in increasing order.
import java.util.*;

class OddNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = oddNumbers(n);

        for (int j : result)
            System.out.print(j + " ");

    }

    static ArrayList<Integer> oddNumbers(int n) {
        ArrayList ans = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                ans.add(i);
            }
        }
    return ans;
    }
}
