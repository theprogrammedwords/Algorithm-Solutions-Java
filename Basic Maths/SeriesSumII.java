//Given first term A and common ratio R(R<1), find the sum of an infinite GP series.
//Your answer should be accurate upto 5 decimal places.


import java.util.*;

class SeriesSumII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double R = sc.nextDouble();

        double result = seriesSumII(A, R);

        System.out.println(result);
    }

    static double seriesSumII(double A, double R) {
        return A/(1- R);
    }
}
