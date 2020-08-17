
public class Main {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number to test ");
  int number = sc.nextInt();
  System.out.print(isPrime(number));
}

public static boolean isPrime(int number){
      if(number <= 1)
          return false;

  //instead of iterating index till the number, we 
  //can iterate it over till sqrt(number) thus reducing the time complexity
  for(int i=2; i< Math.sqrt(number); i++){
          if(number%i==0)
              return false;
      }
      return true;
  }

}
