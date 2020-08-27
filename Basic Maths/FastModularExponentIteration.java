    public class FastModularExponentIteration{
        /* Program to calculate the Modular Exponention
           in an effective way. Implements the logic of 
           divide and conquer, such that when a large exponent
           is to be calculated, such as 9^10, 
           we would break that into (9^2)^(10/2)
           
           This approach saves time. Moreover, 
           we are using iterative method, which has a an advantage 
           over recursive one, 
           i.e. memory efficiency.
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
            int ans=1;
            
            while(n>=1){
                if(n%2 ==0){
                    a = ( a*a ) % mod;
                    n /=2;
                }
                else{
                    ans= ans*a % mod;
                    n--;
                }
            }
        return ans;
        }
    }
