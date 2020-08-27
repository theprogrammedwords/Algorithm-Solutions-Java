public class PigeonholePrinciple {
    
    static int Nmax = 10000005;    
    static int[] fr = new int[Nmax];
    public static void main(String[] args){

    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        findNumber(num);
    }
    
    public static void findNumber(int num){
        
        int curr_rem = 0;
        for(int i = 1; i<= num; i++){
            curr_rem = (curr_rem * 10 + 1) % num;
            if(curr_rem == 0){
                for(int j=1; j<=i ; j++)
                    System.out.print("1");
            return;
        }
        
        
        if(fr[curr_rem] != 0){
            
            for(int j=1; j<= i- fr[curr_rem]; j++)
                System.out.print("1");
            for(int k=1; k <= fr[curr_rem]; k++)
                System.out.print("0");
            return;
        }
     fr[curr_rem] = i;
     }
    } 
}
