# Lesson 01: Compiling and Running a Simple Java Program

## Overview
In this lesson, you'll learn the basics of compiling and running a Java program using the JDK. The goal is to practice converting a `.java` source file into a `.class` bytecode file using the `javac` compiler and then executing the program with the `java` command. We'll also explore how to pass command-line arguments to your Java program.

## Learning Objectives
- Understand the basic Java development workflow.
- Compile a Java source file into a bytecode file using the `javac` command.
- Run the compiled Java program using the `java` command.
- Pass command-line arguments to the Java program.

## Steps

### 1. Compile the Java Program
Use the `javac` command to compile `Main.java`:
```bash
javac Main.java
```
This command will generate a `Main.class` file in the same directory.

### 2. Run the Compiled Java Program
Execute the program using the `java` command:
```bash
java Main
```
This will run the `main` method in the `Main` class and print the output.

### 3. Pass Command-Line Arguments
Run the program with an optional argument to customize the output:
```bash
java Main YourName
```
If an argument is provided, the output will include your name.

## Exercises

1. **Handle Multiple Arguments**: Modify the `Main.java` file to handle and print multiple arguments passed from the command line.
   
2. **Syntax Error Practice**: Introduce a syntax error in `Main.java`, attempt to compile it, and review the error message provided by the compiler. Then, correct the error.

## Summary
By the end of this lesson, you should be comfortable with the basic Java development process, including writing, compiling, and running a Java program, as well as handling command-line arguments.
