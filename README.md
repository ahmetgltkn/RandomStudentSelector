# Random Student Selector

This is a simple Java application that selects a random number of students from a list of names stored in a text file.

## Installation

To use this application, you need to have the following installed on your system:

- Java Development Kit (JDK) 8 or later
- Git (optional)

You can download the latest version of the JDK from the official Oracle website:
https://www.oracle.com/java/technologies/javase-downloads.html

Git can be downloaded from the official Git website:
https://git-scm.com/downloads


To install the application, you can clone the repository using Git:

git clone https://github.com/ahmetgltkn/RandomStudentSelector.git

Alternatively, you can download the ZIP file and extract it to a directory of your choice.

## Usage

To use the application, you need to have a text file containing a list of names, with each name on a new line. By default, the application looks for a file named `studentList.txt` in the `src/main/resources` directory. You can modify this behavior by passing a command-line argument with the file name and location.

To run the application, navigate to the project directory and use the following command:
**java -jar build/libs/random-student-selector.jar numStudents filePath**

Replace `numStudents` with the number of students you want to select, and `filePath` with the path to the text file containing the list of names. For example, to select 5 students from a file named `myStudentList.txt` located in the `data` directory, use:
**java -jar build/libs/random-student-selector.jar 5 data/myStudentList.txt**




The application will select the specified number of students at random and print their names to the console.

## License

This project is licensed under the MIT License. See the <a href="https://github.com/ahmetgltkn/RandomStudentSelector/blob/main/LICENSE"> LICENSE </a> file for details.

## Contributing

If you encounter a bug or have a feature request, please feel free to create an issue on the <a href="https://github.com/ahmetgltkn/RandomStudentSelector">GitHub repository</a> page. Contributions are always welcome!