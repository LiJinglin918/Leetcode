/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each operand may be an integer or another expression.
*/

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int x = stack.pop();
                int y = stack.pop();
                
                switch (s) {
                    case "+":
                        stack.push(x + y);
                        break;
                    case "-":
                        stack.push(y - x);
                        break;
                    case "*":
                        stack.push(x * y);
                        break;
                    case "/": 
                        stack.push(y / x);
                        break;
                }
            }
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}
