import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(convertInfixToPostfix(exp));
    }

    static int findPrecedence(char theChar) {
        if (theChar == '+' || theChar == '-') {
            return 1;
        } else if (theChar == '*' || theChar == '/') {
            return 2;
        } else if (theChar == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    static String convertInfixToPostfix(String exp) {
        String result = new String("");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char myChar = exp.charAt(i);

            if (Character.isLetterOrDigit(myChar))
                result += myChar;

            else if (myChar == '(')
                stack.push(myChar);

            else if (myChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Error";
                else
                    stack.pop();
            } else {
                while (!stack.isEmpty() && findPrecedence(myChar) <= findPrecedence(stack.peek()))
                    result += stack.pop();
                stack.push(myChar);
            }

        }

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

}