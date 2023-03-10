package com.eval;

public abstract class Evaluation {
    private final int numberOfQuestions;

    abstract void evaluationTiming();

    void printNoOfQuestions(){
        System.out.println("No. of question in Evaluation is :"+numberOfQuestions);
    }


    public Evaluation(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
}
