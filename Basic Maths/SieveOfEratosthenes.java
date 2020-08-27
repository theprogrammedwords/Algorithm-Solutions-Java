public class SieveOfEratosthenes{
    
    /*
    This program focuses on finding prime numbers to a given 
    inputted range with max 100000 limit in a O(n.log(n)) time.
    
    isPrime is a boolean array that holds which index or number is prime,
    and which isnt 
    
    nMax is the length declared for isPrime[] array
    
    */
    static int nMax = 100001;
    static Boolean[] isPrime = new Boolean[nMax];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //sieve will run till the input number
        sieveOfEratosthenes(number);
        
        for(int i=2; i<= number; i++){
            if(isPrime[i])
                System.out.print(i+ " ");
        }
    }
        
    
    //mark all the indexes till the number with true
    public static void sieveOfEratosthenes(int number){
     for(int i=2; i<=number; i++)
            isPrime[i] = true;
    //  iterate i till number/2 as the multiple of i is greater than or 
    //  equal to i*2
    for(int i=2; i<=number/2; i++)
            if(isPrime[i])
                // mark the multiples of i as false, so that only those values which are 
                // prime resides in the memory
                for(int k = i*2; k<=number; k+=i)
                    isPrime[k] = false;
    }
    
    } 
