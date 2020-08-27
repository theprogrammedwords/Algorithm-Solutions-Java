//Longest Consecutive Numbers Sequence Calculation 
public class LongestConsecNumbers{
    static int Nmax = 100001;
    static int[] a = new int[Nmax];
    static Boolean[] fr = new Boolean[Nmax];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
            a[i] = sc.nextInt();
        
        System.out.print(LCNCalculate(a,n));
        
    }
    
    public static int LCNCalculate(int a[], int n){
        int ans=0;
        for(int left=1;left<=n; left++){
            for(int i=1;i<=n;i++)
                fr[a[i]] = false;
            int min = a[left];
            int max = a[left];
            
            for(int right= left; right <= n; right++){
                if(fr[a[right]]== true)
                    break;
                fr[a[right]] = true;
                min = Math.min(min, a[right]);
                max = Math.max(max, a[right]);
                if(right-left == max-min)
                    ans= Math.max(ans, right-left+1);
            }
        }
        return ans;
    }
}
