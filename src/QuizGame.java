import java.util.ArrayList;
import java.util.List;

// Class representing a question with multiple choices and the correct answer index
public class QuizGame {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>(); // List of questions to be asked to the user

        questions.add(new Question("What is the capital of France?",
                List.of("Berlin", "Madrid", "Paris", "Rome"), 3));
        questions.add(new Question("Which planet is known as the Red Planet?",
                List.of("Earth", "Mars", "Jupiter", "Venus"), 2));
        questions.add(new Question("What is the largest mammal?",
                List.of("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"), 2));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?",
                List.of("Charles Dickens", "Jane Austen", "William Shakespeare", "Mark Twain"), 3));
        questions.add(new Question("What is the currency of Japan?",
                List.of("Yuan", "Euro", "Dollar", "Yen"), 4));
        questions.add(new Question("Which element has the chemical symbol 'O'?",
                List.of("Oxygen", "Osmium", "Gold", "Lead"), 1));
        questions.add(new Question("What is the capital of Australia?",
                List.of("Sydney", "Melbourne", "Canberra", "Brisbane"), 3));
        questions.add(new Question("In which year did World War II end?",
                List.of("1945", "1939", "1941", "1950"), 1));
        questions.add(new Question("Who painted the Mona Lisa?",
                List.of("Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo"), 2));
        questions.add(new Question("What is the speed of light?",
                List.of("300,000 km/s", "150,000 km/s", "500,000 km/s", "1,000,000 km/s"), 1));
        questions.add(new Question("What is the smallest prime number?",
                List.of("0", "1", "2", "3"), 3));
        questions.add(new Question("Which planet is known as the 'Morning Star'?",
                List.of("Venus", "Mars", "Jupiter", "Saturn"), 1));
        questions.add(new Question("What is the capital of Canada?",
                List.of("Toronto", "Ottawa", "Vancouver", "Montreal"), 2));
        questions.add(new Question("Who developed the theory of relativity?",
                List.of("Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"), 3));
        questions.add(new Question("What is the largest ocean on Earth?",
                List.of("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"), 4));

        Quiz quiz = new Quiz(questions); // Create a new quiz with the list of questions
        quiz.startQuiz(); // Start the quiz and ask questions to the user
    }
}