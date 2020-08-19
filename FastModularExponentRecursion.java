    public class FastModularExponentRecursion{
        /* Program to calculate the Modular Exponention
           in an effective way. Implements the logic of 
           divide and conquer, such that when a large exponent
           is to be calculated, such as 9^10, 
           we would break that into (9^2)^(10/2)
           
           This approach saves time. Moreover, 
           we are using recursive method, which has a drawback, 
           i.e. excess stack usage and memory inefficiency.
          */
        
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int base = sc.nextInt();
            int expo = sc.nextInt();
            int mod = sc.nextInt();
            
            System.out.println(fastExpo(base, expo, mod));
            
        }
        
        /* int a : the base
           int b : the exponent 
           int mod : the mod variable 
        */
        
        
        static int fastExpo(int a, int n, int mod){
            // corner case
            if (n == 0)
                return 1;

            // case if exponent is even
            if(n%2 ==0)
                //a ^ n = (( a ^ 2) ^ (n / 2 ))
                return fastExpo( a*a % mod, n/2, mod);
        
            //case if exponent is odd    
            // a ^ n = a * (a ^ (n-1))
            return (a * fastExpo( a, n-1, mod)) % mod;
        }
    }
