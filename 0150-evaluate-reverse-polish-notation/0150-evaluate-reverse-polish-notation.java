
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                // Convert the token to an integer and push onto the stack
                stack.push(Integer.parseInt(token));
            } else {
                // Token is an operator
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result;

                switch (token) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        // Perform integer division
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown operator: " + token);
                }

                // Push the result back onto the stack
                stack.push(result);
            }
        }

        // The result should be the only element in the stack
        if (stack.size() != 1) {
            throw new IllegalStateException("Invalid expression.");
        }
        return stack.pop();
    }

    // Helper method to check if a token is a number
    private boolean isNumber(String token) {
        // A valid number in this context is an integer without any spaces or commas
        return token.matches("-?\\d+");
    }
}