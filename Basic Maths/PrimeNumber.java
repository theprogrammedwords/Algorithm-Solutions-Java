
public class PrimeNumber {
  
// In this code, the check for a given input whether it is a prime number or not is 
// generated in O(sqrt(n)) time complexity.
  
// It is evident that the factor of a prime number can't exceed the sqrt(n),
// so instead of iterating till the n-1, by iterating till sqrt(n), the time 
// complexity is reduced 
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number to test ");
      int number = sc.nextInt();
      System.out.print(isPrime(number));
  }

public static boolean isPrime(int number){
  //corner case 
  if(number <= 1)
    return false;
  
  //instead of iterating index till the number, we 
  //are iterating it over till sqrt(number) thus reducing the time complexity
  //from O(n) to O(sqrt(n))
 
  for(int i=2; i< Math.sqrt(number); i++){
          if(number%i==0)
              return false;
      }
      return true;
  }

}
