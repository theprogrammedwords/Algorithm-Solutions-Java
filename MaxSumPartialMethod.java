public class MaxSumPartialMethod {
    static int Nmax = 1001;
    static int[] a = new int[Nmax];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
            a[i] = sc.nextInt();
        
        System.out.println(maxSum(a,n));
    }
    
    public static int maxSum(int a[], int n){
        int[] s = new int[Nmax];
        int ans = a[1];
        int minS = 0;
        
        s[1] = a[1];
        
        for(int i=2; i<=n;i++)
            s[i] += s[i-1]+a[i];
        
        for(int i=1; i<=n;i++){
            if(s[i]-minS > ans)
                ans = s[i] - minS;
            if(s[i] < minS)
                minS = s[i];
        }
        return ans;
    }
}
