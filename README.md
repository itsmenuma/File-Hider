# FileHider

FileHider is a simple Java Swing application that allows users to hide and unhide files by renaming them with a dot (.) prefix. This can be useful for hiding files on Unix-based systems where files starting with a dot are considered hidden.

## Features

- **Browse Files**: Select a file using the file chooser dialog.
- **Hide Files**: Hide the selected file by adding a dot (.) at the beginning of the file name.
- **Unhide Files**: Unhide the selected file by removing the dot (.) from the beginning of the file name.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Maven (optional, for building the project)

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/FileHider.git
    cd FileHider
    ```

2. **Compile and run**:
    - Using an IDE (e.g., Eclipse, IntelliJ IDEA):
        - Import the project as a Java project.
        - Run the `main` method in the `FileHider` class.

    - Using the command line:
        ```bash
        javac -d bin -sourcepath src src/filehider/FileHider.java
        java -cp bin filehider.FileHider
        ```

## Usage

1. Launch the application. The main window will display a text field for the file path, along with "Browse," "Hide," and "Unhide" buttons.

2. **Browse for a file**:
    - Click the "Browse" button to open a file chooser dialog.
    - Select the file you want to hide or unhide. The file path will be displayed in the text field.

3. **Hide a file**:
    - Click the "Hide" button to hide the selected file. The application will rename the file by adding a dot (.) prefix, which makes the file hidden on Unix-based systems.

4. **Unhide a file**:
    - Click the "Unhide" button to unhide the selected file. The application will rename the file by removing the dot (.) prefix.

## License

This project is licensed under the APACHE License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- The Java Swing library for providing the GUI components.
- The Java I/O library for handling file operations.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## contact

Feel free to contact numarahamath@gmail.com

## Contact

For any questions or inquiries, please contact [your-email@example.com].
