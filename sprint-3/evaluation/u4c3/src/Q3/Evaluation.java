package Q3;

public abstract class Evaluation {

    private  int numberOfQuestions;
    abstract void evaluationTiming();
    void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }

}
class CodingEvaluation extends Evaluation{

    @Override
    void evaluationTiming() {
        System.out.println("Evaluation timing is 2:00 to 3:30");
    }

    @Override
    void printNoOfQuestions() {
        System.out.println("Its a Coding Evaluation");
        System.out.println("No. of Questions in Evaluation is : 4");
    }
}

class DsaEvaluation extends Evaluation{
    @Override
    void evaluationTiming() {
        System.out.println("Evaluation timing is 9:30 to 11:00");
    }
    @Override
    void printNoOfQuestions() {

        System.out.println("Its a DSA Evaluation");
        System.out.println("No. of Questions in Evaluation is : 5");
    }
}
class Main{
    public static void messageToStudents(Evaluation evaluation){
        evaluation.printNoOfQuestions();
        evaluation.evaluationTiming();

    }

    public static void main(String[] args) {

        messageToStudents(new DsaEvaluation());

        System.out.println();

        messageToStudents(new CodingEvaluation());

    }
}
