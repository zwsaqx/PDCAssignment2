//Zachary Annabell 19067182
//The game class handles the methods used when users are plaing the game, it also handles the questions list and file
package pdcassignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.PrintWriter; 

public final class Game {

    private final List<Question> questionList;
    private final Player player;
    private String questionsFile;
    private String playersFile;
    private int questionNumber;
    private Question currentQuestion;

    public Game(Player player) {
        setQuestionsFile(".//resources//questions.txt");  //for getting questions
        setPlayersFile(".//resources//players.txt");      //for saving players info
        this.questionList = new ArrayList();
        this.player = player;
        loadQuestionList(); //get all the questions and add to the list
        currentQuestion = questionList.get(this.questionNumber);
        this.questionNumber = 0;
    }

    public void loadQuestionList() {
        String currentQuestionText = "", optionA = "", optionB = "", optionC = "", optionD = "";
        String currentAnswer;
        int counter = 1;
        Scanner scanner;

        try {
            File file = new File(questionsFile);
            scanner = new Scanner(file);
            String data;

            while (scanner.hasNextLine()) {
                data = scanner.nextLine();
                switch (counter) {
                    case 1:
                        currentQuestionText += data;  //gets the line and saves as question
                        break;
                    case 2:
                        optionA += data;
                        break;
                    case 3:
                        optionB += data;
                        break;
                    case 4:
                        optionC += data;
                        break;
                    case 5:
                        optionD += data;
                        break;
                    case 6:
                        currentAnswer = data;
                        Question q = new Question(currentQuestionText, currentAnswer, optionA, optionB, optionC, optionD);  //make a new question
                        this.questionList.add(q);
                        currentQuestionText = optionA = optionB = optionC = optionD = "";  //reset fields
                        counter = 0;  //reset counter
                        break;
                    default:
                        System.out.println("Error in the counter > getQuestionList > Game.java");  //error handeling
                }
                counter++;
            }

            scanner.close();

        } catch (FileNotFoundException error) {
            System.out.println("An error has occurred. The questions File was not found.");
        }
    }

    public boolean checkIfAnswerCorrect(char playerAnswer) {
        try {
            if (playerAnswer == getCurrentCorrectAnswer(questionNumber)) {          //compare user answer with correct answer
                //if correct, tell player give point to move to next round
                this.player.setScore(player.getScore() + 1);
                scoreToMoney(this.player);
                questionNumber++;
                currentQuestion = questionList.get(this.questionNumber);
                return true;
            } else {
                this.player.setScore(0);
                saveScoreAndExit();
                return false;
            }
        } catch (IndexOutOfBoundsException e){
            scoreToMoney(this.player);
            saveScoreAndExit();
            return true;
        }
    }

    

    public void scoreToMoney(Player p) {                                       //depending on the score of the player, the money won will change
        String money = "";

        int score = p.getScore();
        switch (score) {
            case 0:
                money = "0";
                break;
            case 1:
                money = "1,000";
                break;
            case 2:
                money = "5,000";
                break;
            case 3:
                money = "10,000";
                break;
            case 4:
                money = "20,000";
                break;
            case 5:
                money = "50,000";
                break;
            case 6:
                money = "100,000";
                break;
            case 7:
                money = "200,000";
                break;
            case 8:
                money = "500,000";
                break;
            case 9:
                money = "1,000,000";
                break;
            default:
                money = "\nError: scoreToMoney > Game.java";  //make unit test for this
                break;
        }
        p.setMoney(money);
    }
    
    public void saveScoreAndExit() {
        scoreToMoney(this.player);

        try {  //save score to file
            String fullFile = "";
            FileReader fread = new FileReader(this.playersFile);
            Scanner reader = new Scanner(fread);

            while (reader.hasNextLine()) {
                fullFile += reader.nextLine();
                fullFile += "\n";
            }
            reader.close();

            String name = player.getName();
            int score = player.getScore();

            PrintWriter writer = new PrintWriter(this.playersFile);
            writer.print(fullFile);
            writer.println(name + " " + score);
            writer.close();
        } catch (FileNotFoundException e) {
            // if the file is not found
            System.out.println("Error: File not found for saving players.");  //make unit test for this
        }
    }

    public char getCurrentCorrectAnswer(int questionNumber) {
        return currentQuestion.getAnswer().charAt(0);
    }
    
    public List<Question> getQuestionList() {
        return this.questionList;
    }

    public Question getCurrentQuestion() {
        return this.questionList.get(questionNumber);
    }

    public int getQuestionNumber() {
        return this.questionNumber;
    }

    public String getWinnings() {
        return this.player.getMoney();
    }
    
    public void setQuestionsFile(String s){
        this.questionsFile = s;
    }
    
    public void setPlayersFile(String playersFile){
        this.playersFile = playersFile;
    }
    
    public void setQuestionNumber(int i){
        this.questionNumber = i;
    }
}
