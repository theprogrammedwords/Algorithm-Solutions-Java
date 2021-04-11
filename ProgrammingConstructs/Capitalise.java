//Given a paragraph of words, capitalise the first character of each word and return the paragraph.

import java.util.*;

class Capitalise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    static String capitalise(String str) {
        String[] words = str.split(" "); 
        String ans="";
        char[] chararray = new char[100];
        for(int i=0; i< words.length; i++){
            ans += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1)+ " ";
        }
    return ans;
    }
    
}
