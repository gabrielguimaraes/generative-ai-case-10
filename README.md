# Text Validation Application

This application is developed to assist users in validating text based on specified criteria. The validation ensures the text conforms to a specific length, contains uppercase and lowercase characters, digits, and specific special characters, while ensuring no whitespace is present.

## Regular Expression Implementation

The underlying regular expression engine has been crafted to deliver a high-performance solution to text validation. It utilizes both positive and negative lookaheads to ascertain the presence or absence of specific character sets within the given text. Moreover, to expedite the validation process, distinct patterns are used to check for whitespaces, uppercase letters, lowercase letters, digits, and special characters, enabling a streamlined and efficient validation process.

## Running the Application Locally

### Pre-requisites:

1. **Java 17**: Ensure you have Java 17 installed.
   - **For macOS**: `brew install openjdk@17`
   - **For Unix**: Depending on your package manager, `sudo apt-get install openjdk-17-jdk` or `sudo yum install java-17-openjdk-devel`
   - **For Windows**: Download and install from [AdoptOpenJDK](https://adoptopenjdk.net/).

2. **Maven**: This project uses the Maven Wrapper, so no installation is required.

### Steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/gabrielguimaraes/generative-ai-case-10
   ```

2. **Navigate to the project directory**:
   ```bash
   cd generative-ai-case-10
   ```

3. **Compile the project**:
   ```bash
   ./mvnw clean compile
   ```
   (For Windows, use `mvnw.cmd clean compile`)

4. **Run the application**:

   - **For UNIX/macOS and Windows**:

     ```bash
     ./mvnw exec:java
     ```
     (For Windows, use `mvnw.cmd exec:java`).

   After running the command, you'll be prompted to:
   ```
   Enter the string to validate:
   ```
   Provide your input string, followed by:
   ```
   Enter the max length:
   ```
   Specify the maximum allowed length. The application will then display the validation results.