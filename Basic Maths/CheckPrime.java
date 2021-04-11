//Given a number, find if it is a prime number or not.
import java.util.*;

class CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            nums.add(n);
        }

        ArrayList<Boolean> ans = checkPrime(t, nums);

        for (boolean res : ans) {
            System.out.println(res);
        }

    }

    static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        for(int i=0; i<t; i++){
            ans.add(isPrime(nums.get(i)));
        }
    return ans;
    }
    
    static boolean isPrime(int n)
        {
    
            if (n <= 1)
                return false;
    
            else if (n == 2)
                return true;
    
            else if (n % 2 == 0)
                return false;
    
            for (int i = 3; i <= Math.sqrt(n); i += 2)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

}
