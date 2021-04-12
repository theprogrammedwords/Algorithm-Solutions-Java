//Given coordinates of a point (x,y) in 2D plane, find in which quadrant does this point lie.     

import java.util.*;

class FindQuadrant {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        int result = findQuadrant(x, y);
        System.out.println(result);

    }

    static int findQuadrant(float x, float y) {
        int result=0;
        if(x > 0 && y > 0) result= 1; 
        if(x < 0 && y > 0) result= 2;
        if(x < 0 && y < 0) result= 3;
        if(x > 0 && y < 0) result= 4;

        return result;
    }
}
