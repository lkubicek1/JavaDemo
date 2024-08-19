# Java Mini Course

## Overview
This mini-course is designed for experienced developers who are new to Java or need a refresher. The course focuses on practical aspects of Java development, providing hands-on exercises to familiarize you with key concepts, tools, and workflows. Each module builds on the previous one, allowing you to gradually deepen your understanding of the Java programming language.

## Prerequisites
Before starting, ensure that you have the following installed on your system:

- **Java Development Kit (JDK)**: You need JDK 8 or higher. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or install it via a package manager like `brew` on macOS or `apt` on Linux.
  - Verify your installation by running:
    ```bash
    java -version
    javac -version
    ```

- **Apache Maven**: Maven is a build automation tool used primarily for Java projects. You can download Maven from the [official website](https://maven.apache.org/download.cgi) or install it via a package manager like `brew` on macOS or `apt` on Linux.
  - Verify your installation by running:
    ```bash
    mvn -version
    ```

- **A Text Editor or IDE**: While a basic text editor like `VS Code` is sufficient, you can also use more feature-rich IDEs like `IntelliJ IDEA` or `Eclipse`.

## Modules

### 01-single/
- **Compiling and Running a Simple Java Program**: Learn the basics of compiling a `.java` file into a `.class` file using `javac` and executing it with `java`, including handling command-line arguments.

### 02-packages-and-jars/
- **Organizing Code with Packages and JARs**: Learn how to organize your Java code into packages, compile multiple `.java` files, understand the class path, and bundle your application into a JAR file for distribution and execution.

### 03-maven/
- **Building Java Projects with Maven**: Learn how to use Maven to manage your Java projects, including compiling code, managing dependencies, and building an executable JAR file with all dependencies packaged inside.

### 04-spring/
- **Introduction to Spring Boot**: Get started with the Spring Boot framework by creating a simple REST API. Learn about component scanning, the application context, singleton beans, Spring lifecycle hooks like `@PostConstruct` and `@PreDestroy`, and how to inspect the beans managed by Spring.

## Getting Started
1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/lkubicek1/java-mini-course.git
   ```
2. Navigate to the module directory you want to work on.
   ```bash
   cd 01-single/
   ```
3. Follow the instructions in the module's `README.md` to complete the exercises.

## Future Modules
Additional modules will be added to cover more advanced topics in Java. Stay tuned for updates!

## Support
If you encounter any issues or have questions while working through the modules, feel free to reach out consult the official Java documentation.

---

Happy coding!
