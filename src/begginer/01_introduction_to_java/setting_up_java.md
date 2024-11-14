# Java Installation and Environment Setup

## Understanding JDK, JRE, and JVM

### Java Development Kit (JDK)
- **JDK** (Java Development Kit) is a software development kit that includes tools required to develop Java applications.
- It contains:
    - **JRE** (Java Runtime Environment)
    - **Java Compiler**: Translates Java code into bytecode (.class files)
    - **Java Debugger** and other development tools.

### Java Runtime Environment (JRE)
- **JRE** provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java.
- **Purpose**: If you only need to run Java applications (not develop), installing the JRE alone is sufficient.

### Java Virtual Machine (JVM)
- **JVM** is an abstract machine responsible for executing Java bytecode.
- **Purpose**: It provides platform independence by converting bytecode into machine-specific code.

### Relationship Overview
1. **JDK** is required for developing Java applications.
2. **JRE** is used for running Java applications.
3. **JVM** is the runtime environment that executes Java bytecode.

---

## Installation Guide for JDK on Different Platforms

### Windows

1. **Download the JDK**:
    - Go to [Oracle's Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) and download the latest JDK version for Windows.

2. **Install the JDK**:
    - Run the installer and follow the setup instructions.
    - Note the installation path, e.g., `C:\Program Files\Java\jdk-xx.x.x`.

3. **Set JAVA_HOME Environment Variable**:
    - Go to **System Properties > Advanced > Environment Variables**.
    - Under **System Variables**, click **New** and set:
        - **Variable Name**: `JAVA_HOME`
        - **Variable Value**: Path to your JDK installation, e.g., `C:\Program Files\Java\jdk-xx.x.x`
    - Add `%JAVA_HOME%\bin` to the `Path` variable under System Variables.

4. **Verify Installation**:
    - Open Command Prompt and type:
      ```bash
      java -version
      javac -version
      ```

### macOS

1. **Download the JDK**:
    - Visit [Oracle’s Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) or use `brew` to install OpenJDK:
      ```bash
      brew install openjdk
      ```

2. **Set JAVA_HOME**:
    - Add the following line to your `~/.zshrc` (or `~/.bash_profile`):
      ```bash
      export JAVA_HOME=$(/usr/libexec/java_home)
      ```

3. **Verify Installation**:
    - Open Terminal and type:
      ```bash
      java -version
      javac -version
      ```

### Linux (Ubuntu/Debian)

1. **Install OpenJDK**:
   ```bash
   sudo apt update
   sudo apt install openjdk-17-jdk -y
