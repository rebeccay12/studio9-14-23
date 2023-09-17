import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> possibleAnswers = new ArrayList<>();

    public MultipleChoice(String quizQuestion, ArrayList<Integer> correctAnswer, Boolean isAnswerCorrect, ArrayList<String> possibleAnswers) {
        super(quizQuestion, correctAnswer, isAnswerCorrect);
        this.possibleAnswers = possibleAnswers;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String displayQuizQuestion(){
        return getQuizQuestion();
    }

    @Override
    public String displayPossibleAnswers() {
        return (getPossibleAnswers().toString());
    }

    @Override
    public Boolean isAnswerCorrect() {
        return getAnswerCorrect();
    }
}
