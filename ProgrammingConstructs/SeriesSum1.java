//Find the sum of the series 1 x 3 + 3 x 5 + 5 x 7 + ... upto n terms.
import java.util.*;

class SeriesSumI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = seriesSumI(n);

        System.out.println(result);

    }

    static int seriesSumI(int n) {
        int sum =0;
        for (int i =1; i<=n; i++){
            sum += (2 * i -1) * (2 * i + 1);
        }

        return sum;
    }

}
