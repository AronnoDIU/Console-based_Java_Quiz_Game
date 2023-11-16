# Console-based Java Quiz Game

This is a console-based Java Quiz Game where players can test their knowledge by answering multiple-choice questions.

## Table of Contents

- [Prerequisites](#prerequisites)
- [How to Run the Game](#how-to-run-the-game)
- [How to Customize the Quiz Questions](#how-to-customize-the-quiz-questions)
- [Conclusion](#conclusion)
- [License](#license)

## Prerequisites

- Java Development Kit (JDK) installed
- Command line interface (CLI) or terminal

## How to Run the Game

1. Clone or download the project from the repository.
2. Open a CLI or terminal and navigate to the project directory.
3. Compile the Java source files by running the following command:
    ```bash
    javac src/*.java
    ```
4. Run the game by running the following command:
    ```bash
    java src/QuizGame
    ```

5. Follow the on-screen instructions to play the game.

## How to Customize the Quiz Questions

1. Open the `QuizGame.java` file in a text editor.
2. Modify the `questions` array to add, remove, or modify the quiz questions.

```java
String[]questions={
        "What is the capital of France?",
        "What is the largest planet in our solar system?",
        "What is the currency of Japan?",
        "Which element has the chemical symbol 'O'?",
        "Who wrote 'Romeo and Juliet'?",
        "What is the speed of light?",
        "What is the smallest prime number?",
        "Which planet is known as the 'Morning Star'?",
        "What is the capital of Canada?",
        "Who developed the theory of relativity?",
        "What is the largest ocean on Earth?"
        };
```

## Features

- Console-based game with multiple-choice questions
- Randomly generated questions
- Multiple players can play the game
- Ability to save and load the game
- Ability to exit the game
- Ability to view high scores
- Ability to play again
- Ability to view instructions
- Ability to customize the quiz questions
- Ability to save and load the game

## Contributing

Contributions are welcome! Please feel free to open a pull request or submit an issue for any suggestions or
improvements.

## Conclusion

This is a console-based Java Quiz Game that allows players to test their knowledge by answering multiple-choice
questions.

## License

This project is licensed under the MIT License.