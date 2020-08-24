public class PartialSums {
    
    /* 
        The partial sums array calculation technique 
        helps in answering queries in constant time.
        For this we are maintaining an extra array s[] which
        stores the partial sum result. 
        
        buildPartialSum method created partial sum array in O(n),
        whereas Query function returns result in O(1).
    */
    
    static int Nmax = 1001;    
    static int[] s = new int[Nmax];
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len+1];
        
        for(int i=1; i<=len; i++){
            a[i] = sc.nextInt();
        }
        
        buildPartialSum(a, len);
        int noOfQuery = sc.nextInt();
        int start;
        int end;
        for(int i=0; i< noOfQuery; i++){
            start = sc.nextInt();
            end = sc.nextInt();
            System.out.print(query(start, end) +"\n");                
        }
        

        
    }
    //used to create partial sums array
    /*concept : 
    
        creating a consecutive sum from adding
        i-1 value to the value of i'th index.
        
    */
    public static void buildPartialSum(int a[], int n){
        s[1] = a[1];
        for(int i=2; i<= n; i++){
            s[i] = s[i-1] + a[i];
        }
    }
    
    /*concept :
        the sum of range(x,y) is equal to 
        the sum of elements till y index 
        minus the sum of elements till x-1 index
    */
    public static int query(int x, int y){
        return s[y] - s[x-1];
    }
        
    
}
