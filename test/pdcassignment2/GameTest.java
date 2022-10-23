//Zachary Annabell 19067182
//this class tests imporant features of the game
package pdcassignment2;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game(new Player("test", 3, null));
    }
    
    @Test                                           // Test checkIfAnswerCorrect method, of class Game.
    public void testCheckIfAnswerCorrect() {
        boolean expResult = true;
        boolean result = game.checkIfAnswerCorrect('c');
        assertEquals(expResult, result);
    }
    
    @Test                                           // Test Score to Money method, of Game class
    public void testScoreToMoney() {
        Player player = new Player("testPlayer",2,null);
        game.scoreToMoney(player);
        String expResult = "5,000";
        String result = player.getMoney();
        assertEquals(expResult, result);
    }
    
    @Test                                           // Test Score to Money method, of Game class with bad input
    public void testErrorInScoreToMoney() {
        Player player = new Player("testPlayer",200,null);
        game.scoreToMoney(player);
        String expResult = "5,000";
        String result = player.getMoney();
        assertNotEquals(expResult, result);
    }
    
    
    @Test//(expected = FileNotFoundException.class)  //success test: compare expexted result with actual result. (first question text)
    public void testGetCurrentQuestion() {
        String expResult = "For $1,000: AUT is an abbreviation of which of the following?";
        Question result = game.getCurrentQuestion();
        assertEquals(expResult, result.getQuestionText());
    }
    
    @Test    //if this test is run after you have played the game it will fail because by playing you have added a player.
    public void testLoadPlayersFile() {         //
        game.setPlayersFile(".//resources//players.txt");
        game.saveScoreAndExit();
        LoadPlayers load = new LoadPlayers();
        int result = load.getPlayerAmount();
        assertNotEquals(8, result);
    }  
        
}