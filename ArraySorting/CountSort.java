/*
Problem Description
A string S is given consisting of lowercase alphabetical characters only. You need to return a sorted string using Count Sort.

Input format
First line will contain a single integer n representing size of the given string.
Second line will contain a single string S of size n.

Output format
Output the string in a single line.

Sample Input 1
10

abcdeedcba

Sample Output 1
aabbccddee

Constraints
1<=n<=1000000

String S will contain lowercase alphabetical characters only


*/

import java.util.*;

class CountSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String res = countSort(n, s);

        System.out.println(res);

    }

    static String countSort(int n, String s) {

    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    
    initializeMap(charMap, s);
    updateMap(charMap, s);
    
    char[] resArr = new char[n];

    for(int i=n-1; i>= 0 ; i--){
        int index = charMap.get(s.charAt(i));
        resArr[index] = s.charAt(i);
        charMap.put(s.charAt(i), charMap.get(s.charAt(i))+1);
    }

    String result = new String(resArr);
    return result;
    }

    public static void initializeMap(HashMap<Character, Integer> charMap, String s){
        for(int i=97; i<=122; i++){
            charMap.put((char)i, 0); 
        }
        
        for(int i=0; i< s.length(); i++){
            charMap.put(s.charAt(i), charMap.get(s.charAt(i))+1);
        }

        Iterator it = charMap.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            if(Integer.valueOf((int)me.getValue())==0){
                it.remove();
            }
        }

    }

 public static void updateMap(HashMap<Character, Integer> charMap, String s){
    Iterator it = charMap.entrySet().iterator();
    Map.Entry me = (Map.Entry)it.next();    

    Character first = (Character) me.getKey();
    Integer previous = (Integer) me.getValue();
    charMap.put(first,  0);
    

    while(it.hasNext()){
        Map.Entry curr = (Map.Entry)it.next();
        int val = (Integer) curr.getValue();
        charMap.put((Character) curr.getKey(), previous);
        previous += val;
    }    

 }


}  
