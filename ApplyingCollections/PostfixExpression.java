//Evaluate the given postfix expression. The expression is given as a string where each token is separated by a space.

//The possible operators can be +, - and *

import java.util.*;

class PostfixExpression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    static int postfixExpression(String exp) {
            //create a stack
        Stack<Integer> stack = new Stack<>();
          
        if(!exp.contains(" ")){
            return Integer.valueOf(exp);
        }
        // Scan all characters one by one
        for(int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);
              
            if(c == ' ')
            continue;
              
            else if(Character.isDigit(c))
            {
                int n = 0;
                  
                //extract the characters and store it in num
                while(Character.isDigit(c))
                {
                    n = n*10 + (int)(c-'0');
                    i++;
                    c = exp.charAt(i);
                }
                i--;
  
                //push the number in stack
                stack.push(n);
            }
              
            // If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                  
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                      
                    case '-':
                    stack.push(val2- val1);
                    break;
                      
                    case '*':
                    stack.push(val2*val1);
                    break;
            }
            }
        }
        return stack.pop(); 
    }
    
}
