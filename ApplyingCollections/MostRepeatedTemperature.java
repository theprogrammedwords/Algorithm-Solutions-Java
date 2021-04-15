/*
Find the temperature that has been repeated the maximum number of days.

Input format
First line contains an integer N, number of days.

Next line contains N space separated integers, the temperature of each day.

Output format
Print the temperature which has occured most number of times. If two temperatures have occured the same number of times print the one which is higher.
*/

import java.util.*;

class MostRepeatedTemperature {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = mostRepeatedTemperature(n, a);
        System.out.println(ans);
    }

    static int mostRepeatedTemperature(int n, int a[]) {

        Map<Integer,Integer> mymap = new HashMap<Integer,Integer>();
        for(int intEle : a){
            if(mymap.containsKey(intEle)){
                mymap.put(intEle, mymap.get(intEle)+1 );
            }else{
                mymap.put(intEle, 1 );
            }
        }

        int max=0;
        int maxVal=0;
        for(Map.Entry me : mymap.entrySet() ){
            if((Integer) me.getValue() >= max  ){
                maxVal= (Integer)me.getKey();
                max = (Integer)me.getValue();
            }
        }
        
        return maxVal;

    }
}
