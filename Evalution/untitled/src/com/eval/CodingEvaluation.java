package com.eval;

public class CodingEvaluation extends Evaluation{

    public CodingEvaluation(int numberOfQuestions) {
        super(numberOfQuestions);
    }

    @Override
    void evaluationTiming(){
        System.out.println("Evaluation timing is 2:00 to 3:30");

    }

//    CodingEvaluation coding = new CodingEvaluation(3);

}
