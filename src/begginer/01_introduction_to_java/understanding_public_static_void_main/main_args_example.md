# Explanation of Java Main Method Argument Array Example

## Code Breakdown

- **`public class MainArgsExample`**: Defines a class named `MainArgsExample`.

- **`public static void main(String[] args)`**: The main method accepts an array of `String` arguments (`String[] args`) that can be passed when running the program.

- **Code Breakdown**:
  - **`if (args.length > 0)`**: Checks if any arguments were passed to the program by examining the length of the `args` array.
  - **`for (int i = 0; i < args.length; i++)`**: Iterates over the `args` array, printing each argument along with its index.
  - **`System.out.println("Argument " + i + ": " + args[i]);`**: Prints each argument and its position in the `args` array.
  - **`System.out.println("No arguments were passed to the program.");`**: If no arguments are passed, this message is displayed.

## How to Compile and Run the Program with Arguments

1. **Save the Code**: Save the code above in a file named `MainArgsExample.java`.

2. **Compile**: Open a terminal or command prompt and navigate to the directory containing `MainArgsExample.java`. Then, compile the program with:
   ```bash
   javac MainArgsExample.java
    ```