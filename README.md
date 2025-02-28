# Infix to Postfix Converter

## Description
This Java program reads an infix expression from a file (`input1.txt`), checks if it is valid, and converts it to a postfix expression using a custom stack implemented with a linked list. The program supports reading expressions both from a file and directly through user input via the `Scanner` class.

## Features
- Reads input expressions from `input1.txt`.
- Validates whether the input is a proper infix expression.
- Converts infix expressions to postfix using a linked-list-based stack.
- Allows users to enter expressions manually using `Scanner`.

## Requirements
- Java Development Kit (JDK) installed
- `input1.txt` file containing infix expressions (if using file input)

## Compilation Instructions
1. Ensure Java is installed on your system by running:
   ```sh
   java -version
   ```
   If Java is not installed, download and install it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Open a terminal or command prompt.
3. Navigate to the directory containing the `InfixToPostfix.java` file.
4. Compile the program using:
   ```sh
   javac InfixToPostfix.java
   ```

## Execution Instructions
### Option 1: Read expressions from `input1.txt`
1. Ensure the `input1.txt` file is in the same directory as the compiled Java program.
2. Run the program using:
   ```sh
   java InfixToPostfix
   ```
   The program will read expressions from the file and display the results.

### Option 2: Enter expressions manually using `Scanner`
1. Instead of reading from a file, the program also supports manual input.
2. When prompted, enter an infix expression, and the program will process it interactively.

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

### Example of Manual Input
```
Enter an infix expression:
a+b*c
Valid
Postfix exp: abc*+
```



