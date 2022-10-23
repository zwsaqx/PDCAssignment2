// zachary annabell 19067182
//the player class stores a name,score, money and password for each instance of it

package pdcassignment2;

public class Player {
    private String name, money, password;
    private int score = 0;
    

    public Player() {
        this.name = "Guest";
        this.score = 0;
        this.money = "0";
    }
    
    public Player(String name, int score, String money) {
        this.name = name;
        this.score = score;
        this.money = money;
    }
    
    public Player(String name, int score, String money, String password) {
        this.name = name;
        this.score = score;
        this.money = money;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getMoney(){
        return money;
    }
    
    public String getPassword(){
        return password;
    }

    public void setName(String username) {
        this.name = username;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public void setMoney(String money){
        this.money = money;
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
                money = "\nError: scoreToMoney > Player.java";  //make unit test for this
                break;
        }
        p.setMoney(money);
    }
}



