//Given 3 numbers a,b,c. Find the largest among them.
import java.util.*;

class FindLargestNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float result = findLargestNumber(a, b, c);

        if (result - (int) result == 0.0)
            System.out.println((int) result);
        else
            System.out.println(result);

    }

    static float findLargestNumber(float a, float b, float c) {
        float max =0;
        if(a > b && a> c)
            max = a;
        else if(b> a && b > c){
            max = b;
        }
        else max = c;

    return max;
}
}
