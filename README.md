# Java To-Do App

This is a simple and interactive **To-Do List Application** built using **Java**. It allows users to add, delete, and update tasks efficiently, making it easy to manage daily to-do lists.

---

## Features

- Add new tasks to the list.
- Mark tasks as completed or pending.
- Delete tasks from the list.
- Simple and intuitive user interface.

---

## Tech Stack

- **Java**: The core programming language used to build the application.
- **Maven**: Dependency management tool used to handle external libraries.

---

## Project Files

1. **Main.java**  
   This is the main file that contains the entry point of the application, where the core logic of the To-Do app resides.

2. **Task.java**  
   A class representing a task in the to-do list, handling properties such as task name, completion status, etc.

3. **pom.xml**  
   Maven configuration file that manages project dependencies and build configurations.

4. **README.md**  
   This README file provides an overview of the project, installation steps, and other documentation.

---

## Installation and Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/java-to-do-app.git
   ```
   
2. **Navigate to the project directory**:
  ```bash
  cd java-to-do-app
  ```
  
3. **Install dependencies using Maven**:
  Make sure you have Maven installed on your machine. Run the following command to install the necessary      dependencies:
  ```bash
  mvn install
  ```
  
4. **Run the application**:
  After the dependencies are installed, you can run the application using:
  ```bash
  mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
  ```
  
## Dependencies

The project dependencies are managed by Maven, and the required libraries are specified in the pom.xml file.

Example:

```bash
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.12</version>
    <scope>provided</scope>
</dependency>

```
**How to Use**

- **Add Tasks**: Use the application interface to enter new tasks.
- **Mark as Completed**: Mark tasks as completed when done.
- **Delete Tasks**:  Remove tasks from the list once they are no longer needed.
