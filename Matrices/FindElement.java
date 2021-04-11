import java.util.*;

class FindElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int result = findElement(n, arr, x);

        System.out.println(result);

    }

    static int findElement(int n, int[] arr, int x) {
        int[] ans= new int[arr.length];
        int index=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                ans[index]=i;
                index++;
            }
            
        }
        if (index==0)
            ans[index]=-1;

    return ans[0];
    }
}
