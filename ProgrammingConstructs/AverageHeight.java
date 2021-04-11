/*There are n students in a class. You are given the heights of the students, you have to calculate the average height of students in the class. 
Your answer should be accurate upto 5 decimal places.
*/
import java.util.*;


class AverageHeight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = Float.parseFloat(sc.next());
        }

        float avgHeight = averageHeight(n, a);
        System.out.println(avgHeight);
    }

    static float averageHeight(int n, float[] a){
        float sum=0;
        float average=0;
        for(int i=0; i<a.length;i++){
            sum += a[i];
        }
        average = sum/a.length;
        return average;
    }
}
