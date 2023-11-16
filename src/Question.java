import java.util.List;

// Record class to represent a question with its options and correct option number
record Question(String question, List<String> options, int correctOption) {
    public String question() {
        return question;
    }
}