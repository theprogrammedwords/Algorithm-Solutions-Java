/*Given a string S containing the characters '(', ')', '{', '}', '[' and ']'. Determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Note: An empty string is also considered valid.*/

import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution here
    public String isValid(String s) {


        String result = "";
        if(s.length()==0) return "true";
        
        
        char[] ch = s.toCharArray();

        Stack<Character> stk = new Stack<Character>();
        
        if( ch[0] == ')' ||  ch[ch.length -1] == '(') result = "false";
        if( ch[0] == '}' ||  ch[ch.length -1] == '{') result = "false";
        if( ch[0] == ']' ||  ch[ch.length -1] == '[') result = "false";
        if( ch[0] == ' ') result = "false";
    
        
        
        for(int i=0; i< ch.length; i++)
        {
            if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[' || ch[0] == ' '){
                stk.push(ch[i]);
            }
            else if( !stk.empty() && ch[i] ==')'  && stk.peek() == '(' ){
                stk.pop();
            }
            else if(!stk.empty() && ch[i] =='}'  && stk.peek() == '{' ){
                stk.pop();
            }
            else if(!stk.empty() && ch[i] ==']'  && stk.peek() == '['){
                stk.pop();
            
                                
            }else if( !stk.empty() && ch[i] != stk.peek()) {
                result = "false";
            }
        }

        if(stk.empty() && result != "false"){
            result = "true";
        }

        if( !stk.empty() && result != "true"){
            result = "false";
        }
    return result;
    }

    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }
}
