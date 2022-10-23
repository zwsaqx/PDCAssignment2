//Zachary Annabell 19067182
//The load players class handles the file inteaction of the players text file and list

package pdcassignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class LoadPlayers {
    private final String playerFile;
    private final List<Player> playerList;
    private int playerAmount;

    public LoadPlayers() {
        playerAmount = 0;
        this.playerFile = ".//resources//players.txt";
        this.playerList = new ArrayList();
        this.LoadPlayerList();                              //each player object has a name and score
    }
    
    public String LoadPlayerList(){
        String currentName = "", playerListString = "";
        int currentScore;

        try {
            File file = new File(playerFile);
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                playerListString +=  data + "\n";                           //gets each line and adds an endline for when we put the list back
                char[] charArray = data.toCharArray();
                
                currentScore = charArray[charArray.length-1]-48;                      //set the score as the last char in each line
                
                for (int i = 0; i < charArray.length-1; i++ ){
                    currentName += charArray[i];
                }

                Player p = new Player(currentName, currentScore, null);           //add as new user
                playerAmount++;
                this.playerList.add(p);
                currentName = ""; //reset currentName
            }

        myReader.close();

        } catch (FileNotFoundException error) {
            System.out.println("ERROR. The file has the wrong location or wrong name.\n");
            System.exit(0);                                                 //google if 0 or 1 is the error number
        }
        return playerListString;
    }
    
    public List<Player> getPlayerList(){
        return this.playerList;
    }
    public String getScoreBoardText(){
        String scoreBoardText = "";
        
        for (Player p : playerList){         //for each player in the playerlist
            scoreBoardText +=String.format("%-3s",p.getName());  //add the name to the scoreBoard text
            p.scoreToMoney(p);  //convert score to money
            scoreBoardText += "$" + p.getMoney() + "\n";  //display money 
        }
        
        return scoreBoardText;
    }
    
    public Player checkPlayer(String name){                                     //checks if the user has played before
        Player player;

        for (int i = 0; i < this.playerList.size(); i++){
            if (((playerList.get(i)).getName()).equals(name + " ")){            //if the player is already in the player List
                System.out.println("Welcome back " + name + "!");
                player = this.playerList.get(i);
                return player;
            }
        }
        player = new Player(name, 0, null);                                     //otherwise make a new player with that name and score 0
        return player;
    }
    
    public int getPlayerAmount(){
        return this.playerAmount;
    }
}
