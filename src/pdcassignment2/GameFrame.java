//Zachary Annabell 19067182
//The game frame handles the GUI elements of the game when the user is playing and shows active questions 

package pdcassignment2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameFrame extends javax.swing.JFrame {

    private char answer;
    private Question currentQuestion;
    private final Game activeGame;
    public Player player;
    
    public GameFrame(Player player) {
        //ADD: if signed in, get name and stick to this player. else set name to Guest and save score
        this.player = player;
        activeGame = new Game(player);
        initComponents();
        
        updateFields();
        background = new javax.swing.JLabel("", new ImageIcon("blackLoop.gif"), JLabel.CENTER);
        background.setBounds(0,0,getWidth(),getHeight());
        this.add(background);
        this.setResizable(false);  //stops users from changing size of program
        this.setLocationRelativeTo(null); //centres the program
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staticLabel = new javax.swing.JLabel();
        answerButtonA = new javax.swing.JButton();
        answerButtonC = new javax.swing.JButton();
        QuestionNumberLabel = new javax.swing.JLabel();
        answerButtonD = new javax.swing.JButton();
        answerButtonB = new javax.swing.JButton();
        playingAsLabel = new javax.swing.JLabel();
        playerNameLabel = new javax.swing.JLabel();
        QuestionLabel = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        staticLabel1 = new javax.swing.JLabel();
        moneyWonLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));

        staticLabel.setBackground(new java.awt.Color(0, 102, 51));
        staticLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        staticLabel.setForeground(new java.awt.Color(51, 255, 51));
        staticLabel.setText("Question:");

        answerButtonA.setBackground(new java.awt.Color(0, 102, 51));
        answerButtonA.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        answerButtonA.setForeground(new java.awt.Color(51, 255, 51));
        answerButtonA.setText("a filler");
        answerButtonA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        answerButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonAActionPerformed(evt);
            }
        });

        answerButtonC.setBackground(new java.awt.Color(0, 102, 51));
        answerButtonC.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        answerButtonC.setForeground(new java.awt.Color(51, 255, 51));
        answerButtonC.setText("c filler");
        answerButtonC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        answerButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonCActionPerformed(evt);
            }
        });

        QuestionNumberLabel.setBackground(new java.awt.Color(0, 102, 51));
        QuestionNumberLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        QuestionNumberLabel.setForeground(new java.awt.Color(51, 255, 51));
        QuestionNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        QuestionNumberLabel.setText("1");

        answerButtonD.setBackground(new java.awt.Color(0, 102, 51));
        answerButtonD.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        answerButtonD.setForeground(new java.awt.Color(51, 255, 51));
        answerButtonD.setText("d filler");
        answerButtonD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        answerButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonDActionPerformed(evt);
            }
        });

        answerButtonB.setBackground(new java.awt.Color(0, 102, 51));
        answerButtonB.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        answerButtonB.setForeground(new java.awt.Color(51, 255, 51));
        answerButtonB.setText("b filler");
        answerButtonB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        answerButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonBActionPerformed(evt);
            }
        });

        playingAsLabel.setBackground(new java.awt.Color(0, 102, 51));
        playingAsLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        playingAsLabel.setForeground(new java.awt.Color(51, 255, 51));
        playingAsLabel.setText("Playing as:");

        playerNameLabel.setBackground(new java.awt.Color(0, 102, 51));
        playerNameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        playerNameLabel.setForeground(new java.awt.Color(51, 255, 51));
        playerNameLabel.setText("Guest");

        QuestionLabel.setBackground(new java.awt.Color(0, 102, 51));
        QuestionLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        QuestionLabel.setForeground(new java.awt.Color(51, 255, 51));

        menuButton.setBackground(new java.awt.Color(0, 102, 51));
        menuButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        menuButton.setForeground(new java.awt.Color(51, 255, 51));
        menuButton.setText("Menu/Cashout");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        staticLabel1.setBackground(new java.awt.Color(0, 102, 51));
        staticLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        staticLabel1.setForeground(new java.awt.Color(51, 255, 51));
        staticLabel1.setText("/ 10");

        moneyWonLabel.setBackground(new java.awt.Color(0, 102, 51));
        moneyWonLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        moneyWonLabel.setForeground(new java.awt.Color(51, 255, 51));
        moneyWonLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        moneyWonLabel.setText("Current winnings: $0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(answerButtonA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(answerButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answerButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(answerButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(staticLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuestionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(staticLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(moneyWonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playingAsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staticLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuestionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staticLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(menuButton)
                        .addGap(8, 8, 8)
                        .addComponent(moneyWonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playingAsLabel)
                    .addComponent(playerNameLabel))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        activeGame.saveScoreAndExit();  //save their winnings and add to winnings board
        this.dispose();  //close this window
        MenuFrame menuFrame = new MenuFrame(player);
        menuFrame.setVisible(true);
        
    }//GEN-LAST:event_menuButtonActionPerformed

    private void answerButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonAActionPerformed
        nextQuestion(activeGame.checkIfAnswerCorrect('a'));
    }//GEN-LAST:event_answerButtonAActionPerformed

    private void answerButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonBActionPerformed
        nextQuestion(activeGame.checkIfAnswerCorrect('b'));
    }//GEN-LAST:event_answerButtonBActionPerformed

    private void answerButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonCActionPerformed
        nextQuestion(activeGame.checkIfAnswerCorrect('c'));
    }//GEN-LAST:event_answerButtonCActionPerformed

    private void answerButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonDActionPerformed
        nextQuestion(activeGame.checkIfAnswerCorrect('d'));
    }//GEN-LAST:event_answerButtonDActionPerformed

    private void nextQuestion(boolean playerWasCorrect){
        if (playerWasCorrect & activeGame.getQuestionNumber() != 9){  //if the player was right and theres another question, go to that question
            updateFields();
        } else { 
            if (!playerWasCorrect) {
                //tell player they lost
                JOptionPane.showMessageDialog(null, "That was Incorrect! You lost all your money :(\nYour name was added to the scoreboard with $0 next to it.");
            } else {
                //tell player they won
                JOptionPane.showMessageDialog(null, "That was Correct! you won $1,000,000!\nCheck the scoreboard to see your name!");
            }
            
            this.dispose();  //close this window
            MenuFrame menuFrame = new MenuFrame(player);
            menuFrame.setVisible(true);
            
        }
    }
    private void updateFields(){  // update the text fields on the labels and buttons when a new question is loaded
        currentQuestion = activeGame.getCurrentQuestion();   //update current question from game.java
        setQuestionLabel(currentQuestion.getQuestionText());  //update the question label and all buttons with current info
        setAnswerButtonA(currentQuestion.getOptionA());
        setAnswerButtonB(currentQuestion.getOptionB());
        setAnswerButtonC(currentQuestion.getOptionC());
        setAnswerButtonD(currentQuestion.getOptionD());
        setQuestionNumberLabel(activeGame.getQuestionNumber());  //update question number from game.java
        setWinningsLabel(activeGame.getWinnings());
        playerNameLabel.setText(MillionaireMainGUI.staticPlayerName);
    }
    
    private void setQuestionLabel(String questionText) {
        this.QuestionLabel.setText(questionText);
    }

    private void setQuestionNumberLabel(int QuestionNumberLabel) {
        QuestionNumberLabel++;   //this is to make it 1/10 not 0/9
        this.QuestionNumberLabel.setText("" +QuestionNumberLabel++);
    }

    private void setAnswerButtonA(String answerButtonA) {
        this.answerButtonA.setText(answerButtonA);
    }

    private void setAnswerButtonB(String answerButtonB) {
        this.answerButtonB.setText(answerButtonB);
    }

    private void setAnswerButtonC(String answerButtonC) {
        this.answerButtonC.setText(answerButtonC);
    }

    private void setAnswerButtonD(String answerButtonD) {
        this.answerButtonD.setText(answerButtonD);
    }

    private void setPlayerNameLabel(String playerNameLabel) {
        this.playerNameLabel.setText(playerNameLabel);
    }

    
    private void setWinningsLabel(String text){
        this.moneyWonLabel.setText("Current winnings: $" + text);
    }
    public char getplayerAnswer(){
        return answer;
    }
    
    
    private final javax.swing.JLabel background;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel QuestionLabel;
    private javax.swing.JLabel QuestionNumberLabel;
    private javax.swing.JButton answerButtonA;
    private javax.swing.JButton answerButtonB;
    private javax.swing.JButton answerButtonC;
    private javax.swing.JButton answerButtonD;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel moneyWonLabel;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JLabel playingAsLabel;
    private javax.swing.JLabel staticLabel;
    private javax.swing.JLabel staticLabel1;
    // End of variables declaration//GEN-END:variables
}
