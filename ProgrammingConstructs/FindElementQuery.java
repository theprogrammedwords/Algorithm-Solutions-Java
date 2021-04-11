/*Given a sorted array containing n elements and given q queries and in each query you are given a value x. Find the index of the x in the array. 
If there are multiple occurrences then find the leftmost one and if x is not present return -1.
*/
import java.util.*;

class FindElementQuery {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int q = sc.nextInt();

        while (q-- > 0) {

            int x = sc.nextInt();
            int result = findElementQuery(n, arr, x);

            System.out.println(result);

        }

    }

    static int findElementQuery(int n, int[] arr, int x) {
        int[] result = new int[n];
        int index=0;
        Arrays.fill(result, -1);
        for(int i=0; i < arr.length; i++){
            if(arr[i]==x){
                result[index] = i;
                index++;
            }
        }   
        return result[0];
    }
}
