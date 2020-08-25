public class GreedyMaxSumSubarray {
    static int Nmax = 10001;
    static int[] a = new int[Nmax];
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<= n;i++){
            a[i] = sc.nextInt();
        }
     
        System.out.println(maxSum(a,n));
    }
    
    public static int maxSum(int a[], int n){
        int ans=a[1];
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+= a[i];
        
            if(sum > ans)
                ans= sum;
        
            if(sum<0)
                sum=0;
            
        }
        
        return ans;
    }
}
