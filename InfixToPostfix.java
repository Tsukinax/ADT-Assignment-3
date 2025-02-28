import java.io.*;
import java.util.*;

// Node class for Linked List Stack
class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) throw new EmptyStackException();
        char data = top.data;
        top = top.next;
        return data;
    }

    public char peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class InfixToPostfix {
    
    // Check operator precedence
    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }
    
    // Validate if expression is valid
    private static boolean isValidInfix(String exp) {
        Stack stack = new Stack();
        boolean lastWasOperator = true;
        
        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                lastWasOperator = false;
            } else if (ch == '(') {
                stack.push(ch);
                lastWasOperator = true;
            } else if (ch == ')') {
                if (stack.isEmpty()) return false;
                while (!stack.isEmpty() && stack.peek() != '(') stack.pop();
                if (stack.isEmpty()) return false;
                stack.pop();
                lastWasOperator = false;
            } else if ("+-*/^".indexOf(ch) != -1) {
                if (lastWasOperator) return false;
                lastWasOperator = true;
            } else {
                return false;
            }
        }
        return stack.isEmpty() && !lastWasOperator;
    }
    
    // Convert infix to postfix
    private static String infixToPostfix(String exp) {
        Stack stack = new Stack();
        StringBuilder result = new StringBuilder();

        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else { // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        String filename = "input1.txt"; // File input that want to read
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int count = 1;
            while (scanner.hasNextLine()) {
                String expression = scanner.nextLine();
                System.out.println("Expression " + count + ":");
                System.out.println("Infix exp: " + expression);
                if (isValidInfix(expression)) {
                    System.out.println("Valid");
                    System.out.println("Postfix exp: " + infixToPostfix(expression));
                } else {
                    System.out.println("Not-Valid");
                }
                System.out.println();
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
    

