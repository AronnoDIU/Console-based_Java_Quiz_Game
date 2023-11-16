import java.util.List;
import java.util.Scanner;

class Quiz {
    private final List<Question> questions; // List of questions to be asked to the user
    private int score; // Current score of the user at the end of the quiz

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0; // Start with 0 score at the beginning of the quiz
    }

    public void startQuiz() {
        Scanner userInput = new Scanner(System.in);

        // Ask questions to the user one by one and check if the answer is correct
        for (Question question : questions) {
            displayQuestion(question); // Display the question to the user

            int userAnswer = getUserAnswer(userInput); // Get the user's answer

            // Check if the answer is correct and update the score.
            checkAnswer(question, userAnswer);
        }

        displayResult(); // Display the result of the quiz to the user at the end
    }

    // Helper methods to display the question and get the user's answer
    private void displayQuestion(Question question) {
        System.out.println(question.question()); // Display the question to the user

        // Display the options to the user and get the user's answer
        List<String> options = question.options();

        // get the user's answer and check if the answer is correct
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Helper method to get the user's answer and check if the answer is correct
    private int getUserAnswer(Scanner userInput) {

        // Get the user's answer and check if the answer is correct and update the score
        System.out.print("Your answer (1-" + questions.get(0).options().size() + "): ");
        return userInput.nextInt(); // Return the user's answer
    }

    // Helper method to check if the answer is correct and update the score
    private void checkAnswer(Question question, int userAnswer) {

        // Check if the answer is correct and update the score
        if (userAnswer == question.correctOption()) {
            System.out.println("Correct!\n");
            score++; // Update the score by 1 for each correct answer
        } else { // If the answer is incorrect
            System.out.println("Incorrect. The correct answer is: " +
                    // Display the correct answer to the user
                    question.options().get(question.correctOption() - 1) + "\n");
        }
    }

    // Helper method to display the result of the quiz to the user
    private void displayResult() {
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
    }
}