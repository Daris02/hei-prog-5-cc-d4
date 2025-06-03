# Toy Factory
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Launch

To compile and execute project:

1. Open terminal on this project.
2. Compile the project :
   ```sh
   javac -d bin src/**/*.java
   ```
3. Execute the principal program (replace from class principal name `Main`) :
   ```sh
   java -cp bin Main
   ```
