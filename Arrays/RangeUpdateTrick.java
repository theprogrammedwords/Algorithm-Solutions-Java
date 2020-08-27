public class RangeUpdateTrick {
    static int Nmax = 1001;
    static int[] a = new int[Nmax];
    static int[] b = new int[Nmax];
    static int[] s = new int[Nmax];
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len+1];
        
        for(int i=1; i<=len; i++){
            a[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int val = sc.nextInt();
        
        update(x,y,val);
        buildFindArray(len,a, s);
        
        for(int i=1; i<=len; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static void update(int x, int y, int val){
        b[x] +=val;
        b[y+1] -=val;
    }
    
    public static void buildFindArray(int n, int a[], int s[]){
        
        for(int i=1; i<= n; i++){
            s[i] = s[i-1]+b[i];
            a[i] += s[i];
        }
        
    }
}
