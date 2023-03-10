package com.eval;

public class MainE {
    void messageToStudents(Evaluation evaluation){
        if(evaluation == new DsaEvaluation(5)){
            System.out.println("Its a DSA evaluation");

        }
        else if(evaluation== new CodingEvaluation(3)) {
            System.out.println("Its a coding evaluation");
        }


    }





    public static void main(String[] args) {
        MainE main = new MainE();
        main.messageToStudents(new DsaEvaluation(5));


        DsaEvaluation dsa = new DsaEvaluation(5);


        dsa.evaluationTiming();
        dsa.printNoOfQuestions();
        System.out.println("-------------------------");

        CodingEvaluation coding = new CodingEvaluation(3);
        coding.evaluationTiming();
        coding.printNoOfQuestions();



    }
}
