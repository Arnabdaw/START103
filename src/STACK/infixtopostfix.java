package STACK;
import java.util.*;

public class infixtopostfix
{
    // Method to define operator priority
    public static int getPriority(char operator)
    {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0; // Non-operator characters
        }
    }

    // Method to check if a character is an operator
    public  static boolean isOperator(char c)
    {
         return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Method to convert infix to postfix
    public static String infixToPostfix(String infix)
    {
        Stack<Character> op = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < infix.length(); i++)
        {
            char current = infix.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(current))
            {
                ans.append(current);
            }
            // If the character is '(', push it onto the op
            else if (current == '(')
            {
                op.push(current);
            }
            // If the character is ')', pop and add to the result until '(' is found
            else if (current == ')')
            {
                while ( op.peek() != '(')
                {
                    ans.append(op.pop());
                }
                op.pop(); // Remove '(' from the op
            }
            // If the character is an operator
            else if (isOperator(current))
            {
                while (!op.isEmpty() && getPriority(op.peek()) >= getPriority(current))
                {
                    ans.append(op.pop());
                }
                op.push(current);
            }
        }

        // Pop all the remaining operators from the op
        while (!op.isEmpty())
        {
            ans.append(op.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input infix expression
        System.out.print("Enter an infix expression: ");
        String infix = scanner.nextLine();

        // Convert to postfix
        String postfix = infixToPostfix(infix);

        // Output the result
        System.out.println("Postfix expression: " + postfix);

//        scanner.close();
    }
}
