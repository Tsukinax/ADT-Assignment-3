# Infix to Postfix Converter

## Description
This Java program reads an infix expression from a file (`input1.txt`), checks if it is valid, and converts it to a postfix expression using a custom stack implemented with a linked list.

## Requirements
- Java Development Kit (JDK) installed
- `input1.txt` file containing infix expressions

## Compilation Instructions
1. Open a terminal or command prompt.
2. Navigate to the directory containing the `InfixToPostfix.java` file.
3. Compile the program using:
   ```sh
   javac InfixToPostfix.java
   ```

## Execution Instructions
1. Ensure the `input1.txt` file is in the same directory as the compiled Java program.
2. Run the program using:
   ```sh
   java InfixToPostfix
   ```

## Example Input (`input1.txt`)
```
a-b/(c+d-e)*(f^g*h+i)
1+2+3^4**
```

## Expected Output
```
Expression 1:
Infix exp: a-b/(c+d-e)*(f^g*h+i)
Valid
Postfix exp: abcd+e-/fg^h*i+*-

Expression 2:
Infix exp: 1+2+3^4**
Not-Valid
```

