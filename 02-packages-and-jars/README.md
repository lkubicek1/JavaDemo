### Module 02: Organizing Code with Packages and JARs

**Objective:**  
In this module, you will learn how to organize your Java code using packages, compile multiple `.java` files that belong to different packages, and bundle them into a JAR (Java Archive) file. Additionally, you'll gain an understanding of how the class path works, which is essential for allowing the JVM to locate dependent files during runtime.

### 1. **Directory Structure**
First, let's set up the directory structure for this module.

```
02-packages-and-jars/
    ├── src/
    │   ├── com/
    │   │   └── example/
    │   │       ├── Main.java
    │   │       ├── utils/
    │   │       │   └── GreetingUtil.java
    └── README.md
```

### 2. **Java Files**

#### `Main.java`
This is the entry point to the application which resides inside the `src/com/example/` directory
#### `GreetingUtil.java`
This is a simple utility class that resides inside the `src/com/example/utils/` directory

### 3. **Lesson Steps**

#### 1. **Understanding Packages**
   - Packages in Java are used to group related classes and help manage the namespace, making your project more organized.
   - In this module, the `com.example` package contains the `Main` class, while `com.example.utils` contains utility classes like `GreetingUtil`.

#### 2. **Compiling the Java Files**
   - Compile the `Main.java` and `GreetingUtil.java` files using the `javac` command with the `-d` option to specify the output directory:
     ```bash
     javac -d out/ src/com/example/Main.java src/com/example/utils/GreetingUtil.java
     ```
   - This creates a directory structure in `out/` that mirrors the package structure:
     ```
     out/
         └── com/
             └── example/
                 ├── Main.class
                 └── utils/
                     └── GreetingUtil.class
     ```
#### 3. **Understanding the Class Path**
   - The **class path** is a critical concept in Java that tells the JVM where to look for classes and packages during runtime.
   - By default, the JVM looks for classes in the current directory, but you can specify additional directories or JAR files using the `-cp` (or `-classpath`) option.
   - When running your Java program, you must include the base directory (e.g., `out/`) that contains your package structure in the class path.

   - Example:
     ```bash
     java -cp out com.example.Main
     ```
   - Here, `out` is the base directory where the JVM will look for the `com.example.Main` class.

#### 4. **Running the Compiled Program**
   - Run the `Main` class:
     ```bash
     java -cp out com.example.Main
     ```
   - Pass an argument:
     ```bash
     java -cp out com.example.Main John
     ```

#### 5. **Creating a JAR File**
   - Create a JAR file that contains all your compiled classes and specify the entry point:
     ```bash
     jar cfe myapp.jar com.example.Main -C out/ .
     ```

#### 6. **Running the JAR File**
   - Execute the JAR file:
     ```bash
     java -jar myapp.jar
     ```
   - Pass an argument:
     ```bash
     java -jar myapp.jar John
     ```
   - Bonus: Java System Properties:
     ```bash
     java -Denv=dev -jar myapp.jar John
     ```
     Notice the change in environment.  Using the `-D` flag allows you to pass system properties to the JVM.

### 4. **Exercises**

1. **Modify Class Path**: Create a new package and class. Adjust the class path to include this new package when running your program.
2. **Custom Class Path**: Create a directory outside `out/` and move one of your compiled `.class` files there. Modify the class path to include this new location and successfully run your program.
3. **Manifest File and Class Path**: Modify the `MANIFEST.MF` file in your JAR to include a class path that points to additional libraries or directories.

### 5. **Summary**
In this module, you’ve learned how to organize Java code using packages, compile and run Java files with an understanding of the class path, and create and execute JAR files. Mastering the class path is essential for managing dependencies and organizing larger projects in Java.
