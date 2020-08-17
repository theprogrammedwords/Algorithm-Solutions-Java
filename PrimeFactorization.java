// PRIME FACTORIZATION
public class PrimeFactorization {
    
    
    
    /* 
    In this code, the prime factors for a given input 
    is generated in O(sqrt(n)) time complexity.
    
    f : array to store factors
    expo : array to store exponents of respective factors
    len : len of factor array
       
    */
    static int[] f = new int[100];
    static int[] expo = new int[100];
    static int len;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        primeFact(number);
    
        // loop to print output in the form factor, exponent
        // such as for primeFact(13) we will print 13, 1
        
        for(int i=1; i<=len; i++){
            System.out.println(f[i]+ " "+ expo[i]);
        }
}
    public static void primeFact(int number){
        // d : an index iterating to check factors
        int d =2 ;
        // basic condition for prime evalution
        // square of primefactor should be lesser than the 'number'
        while(d*d <=number && number >1){
            // k : the exponent count for prime factor d
            int k=0;
            //check in loop how many times can d factorise the number
            while(number%d == 0){
                //if d factorises the number, increment the exponent count k
                k++;
                number = number/d;
            }
            // if k is non zero, a factor is found thus increment length of factor count
            // assign values to factor, exponent array
            if(k>0){
                len++;
                f[len] = d;
                expo[len] = k;
            }
            d++;
        }
        
        // if no factor is found, return
        // number to its exponent
        // eg : for primeFact(13) we will return 13,1 
        if(number > 1){
            len++;
            f[len] = number;
            expo[len] = 1;
        }
    }
}
