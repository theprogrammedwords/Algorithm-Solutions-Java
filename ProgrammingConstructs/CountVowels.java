/*Given a string, count the total number of vowels present in that string.

Note: The string contains uppercase and lowercase english alphabets only.*/

import java.util.*;

class CountVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    static int countVowels(String str) {
        char[] ch = str.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++ ){
        if(ch[i]== 'a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'  || ch[i]=='u' || ch[i]== 'A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O'  || ch[i]=='U'  ){
            count++;
        }
        }
    return count;
    }
}
