//Zachary Annabell 19067182
//The sign in class manages the player sign in features
package pdcassignment2;

import java.util.List;

public class SignIn {
    
    private List<Player> playerList;
    private Player player;
    
    public SignIn(){
         //setLoggedIn(true);
         
         
    }
    
    
    public Player checkPlayer(String name, String password){                                     //checks if the username is taken
        LoadPlayers load = new LoadPlayers();
        playerList = load.getPlayerList();                                      //getting the list of players to check new name against
        
        for (int i = 0; i < this.playerList.size(); i++){
            if (((playerList.get(i)).getName()).equals(name + " ")){            //if the player is already in the player List
               
                player = this.playerList.get(i);
                return player;
            }
        }
        player = new Player(name, 0, null);                                     //otherwise make a new player with that name and score 0
        MillionaireMainGUI.staticPlayerName = player.getName();
        
        return player;
    }
    
}
