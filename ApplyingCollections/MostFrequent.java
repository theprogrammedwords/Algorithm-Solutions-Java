/*You are given a string which comprises lower case alphabets (a-z), upper case alphabets (A-Z), numbers, (0-9) and special characters like !,-.; etc.

You are supposed to find out which character occurs the maximum number of times and the number of its occurrence, in the given string. If two characters occur an equal number of times, you have to output the character with the lower ASCII value.

For example, if your string was: aaaaAAAA, your output would be: A 4, because A has lower ASCII value than a
*/

import java.util.*;

class MostFrequent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object[] ans = mostFrequent(s);
        System.out.println(ans[0] + " " + ans[1]);
    }

    static Object[] mostFrequent(String s) {
        
        Map<Character, Integer> mymap = new HashMap<Character, Integer>();
        
        for(int i=32; i<127; i++){
            mymap.put((char)i, 0);
        }


        char[] cha = s.toCharArray();
        for(int i=0; i<cha.length; i++){
            mymap.put(cha[i], mymap.get(cha[i])+1 );
        }

        
        int max = 0;
        char maxChar = ' ';
        for(Map.Entry mapEle : mymap.entrySet()  ){
            if((Integer)mapEle.getValue() > max){
                max= (Integer)mapEle.getValue();
                maxChar = (Character) mapEle.getKey();
            }
        }
        
        Object[] result = new Object[] {maxChar, max};
        return result;

    }
}
