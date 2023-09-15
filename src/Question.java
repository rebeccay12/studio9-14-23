//package org.example;

import java.util.ArrayList;

public abstract class Question {
    private String quizQuestion;
    private ArrayList<Integer> correctAnswer;
    private Boolean isAnswerCorrect;

    public Question(String quizQuestion, ArrayList<Integer> correctAnswer, Boolean isAnswerCorrect) {
        this.quizQuestion = quizQuestion;
        this.correctAnswer = correctAnswer;
        this.isAnswerCorrect = isAnswerCorrect;
    }

    public String getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        this.quizQuestion = quizQuestion;
    }

    public ArrayList<Integer> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(ArrayList<Integer> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Boolean getAnswerCorrect() {
        return isAnswerCorrect;
    }

    public void setAnswerCorrect(Boolean answerCorrect) {
        isAnswerCorrect = answerCorrect;
    }
}

