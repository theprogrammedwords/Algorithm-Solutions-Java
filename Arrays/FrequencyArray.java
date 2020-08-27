//Program based on Frequency array
public class FrequencyArray{
    static int Nmax = 1001;
    static int[] fr = new int[Nmax];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[Nmax];
        int n;
        
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        
        System.out.print(freqCount(a,n));
    }
    
    public static int freqCount(int a[], int n){
        
        int counter=0;
        for(int i=1; i<= n;i++){
            if(fr[a[i]]==0)
                counter++;
            fr[a[i]]+= 1;
        }
        return counter;
        
    }
}
