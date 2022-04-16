import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            switch(s) {
                case "+": {
                    int a1 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 + a1);
                    break;
                }
                case "-": {
                    int a1 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 - a1);
                    break;
                }
                case "*": {
                    int a1 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 * a1);
                    break;
                }
                case "/": {
                    int a1 = stack.pop();
                    int a2 = stack.pop();
                    stack.push(a2 / a1);
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(s));
                    break;
                }
            }
        }
        return stack.pop();
    }
}