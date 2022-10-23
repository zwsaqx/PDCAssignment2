//zachary annabell 19067182
//the questions class is responsible for one question and answer each

package pdcassignment2;

public class Question {    
    private String answer;
    private final String questionText, optionA, optionB, optionC, optionD;

    public Question(String questionText, String answer, String optionA, String optionB, String optionC, String optionD){  //gui constructor
        this.questionText = questionText; 
        this.answer = answer;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        
    }
    
    public String getQuestionText(){
        return questionText;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }
}
