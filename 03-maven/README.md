### Module 03: Building Java Projects with Maven

**Objective:**  
In this module, you will learn how to use Maven, a powerful build automation tool, to manage your Java projects. You will explore how Maven simplifies project builds by managing dependencies, automating the compilation process, and creating executable JAR files with all dependencies packaged inside.

### 1. **Prerequisite: Install Maven**

Before starting this module, ensure that you have Maven installed on your system.

- **Apache Maven**: Maven is a build automation tool used primarily for Java projects. You can download Maven from the [official website](https://maven.apache.org/download.cgi) or install it via a package manager like `brew` on macOS or `apt` on Linux.

  - **Installation via Homebrew (macOS):**
    ```bash
    brew install maven
    ```

  - **Installation via APT (Ubuntu/Linux):**
    ```bash
    sudo apt-get install maven
    ```

  - **Verify Maven Installation:**
    After installation, verify that Maven is installed correctly by running:
    ```bash
    mvn -version
    ```
    This command should display the installed Maven version along with Java version details.

### 2. **Setting Up Maven Project**

#### 1. **Create a Maven Project**
   - Navigate to your `03-maven/` directory and create a new Maven project using the Maven archetype:
     ```bash
     mvn archetype:generate -DgroupId=com.example -DartifactId=hello-maven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
     ```
   - This command generates a basic Maven project with a default directory structure, including a `pom.xml` file in the project root.

#### 2. **Project Structure Explanation**
   - The generated project structure will look like this:
     ```
     hello-maven/
     ├── src/
     │   ├── main/
     │   │   └── java/
     │   │       └── com/
     │   │           └── example/
     │   │               └── App.java
     │   └── test/
     │       └── java/
     │           └── com/
     │               └── example/
     │                   └── AppTest.java
     ├── pom.xml
     └── README.md
     ```
   - The `src/main/java/` directory is where your source code resides, while `src/test/java/` is for unit tests.
   - The `pom.xml` file is the core of the Maven project, defining the project's dependencies, build configuration, and plugins.

### 3. **Configuring Maven**

#### 1. **pom.xml Configuration**
   Open the `pom.xml` file and configure it to package your project as an executable JAR file with all dependencies included:

   - This `pom.xml` setup uses the `maven-assembly-plugin` to package your project into a single, executable JAR file that includes all dependencies.

### 5. **Building the Maven Project**

#### 1. **Compile and Package**
   - To compile the project and package it as an executable JAR, run:
     ```bash
     mvn clean package
     ```
   - This command will generate a JAR file in the `target/` directory, named something like `hello-maven-1.0-SNAPSHOT-jar-with-dependencies.jar`.

#### 2. **Running the JAR**
   - Run the JAR file with:
     ```bash
     java -jar target/hello-maven-1.0-SNAPSHOT-jar-with-dependencies.jar
     ```
   - You can also pass system properties and command-line arguments:
     ```bash
     java -jar -Denv=dev target/hello-maven-1.0-SNAPSHOT-jar-with-dependencies.jar YourName
     ```

### 6. **Viewing the Contents of the JAR**
   - As in the previous module, you can view the contents of the generated JAR file:
     ```bash
     jar tf target/hello-maven-1.0-SNAPSHOT-jar-with-dependencies.jar
     ```
   - This will display all the classes and dependencies bundled inside the JAR.

### 7. **Exercises**

1. **Add a Dependency**: Add a third-party library (e.g., Google Guava) to your `pom.xml` dependencies section, and modify your `Main` class to use it. Rebuild the project and verify that the library is included in the JAR.
2. **Custom Build Configuration**: Modify the `pom.xml` to change the output directory of the JAR file or customize the build process further.
3. **Maven Profiles**: Create Maven profiles for different environments (e.g., dev, prod) and demonstrate how to build the project with different configurations.

### 8. **Summary**
In this module, you’ve learned how to set up and use Maven to manage your Java projects. You now understand how to use Maven to compile your code, manage dependencies, and build an executable JAR file with all dependencies included. Maven greatly simplifies the build process, making it easier to manage and deploy Java applications.
