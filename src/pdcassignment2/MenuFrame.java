//Zachary Annabell 19067182
//The menu frame class handles the GUI components of the main menu page

package pdcassignment2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class MenuFrame extends javax.swing.JFrame {

    private Player player;
    
    public MenuFrame(Player player) {
        initComponents();
        background = new javax.swing.JLabel("", new ImageIcon("moneyRain.gif"), JLabel.CENTER);
        background.setBounds(0,0,getWidth(),getHeight());
        this.add(background);
        this.setResizable(false);  //stops users from changing size of program
        this.setLocationRelativeTo(null); //centres the program
        updateLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        scoreboardButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        howToPlayButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        playerNameLabel = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(51, 255, 51));

        TitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(51, 255, 51));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("WHO WANTS TO BE A MILLIONAIRE?!");
        TitleLabel.setToolTipText("Easter egg 1 found! Can you find the other 4?");

        playButton.setBackground(new java.awt.Color(0, 102, 51));
        playButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        playButton.setForeground(new java.awt.Color(51, 255, 51));
        playButton.setText("Play!");
        playButton.setBorder(null);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        scoreboardButton.setBackground(new java.awt.Color(0, 102, 51));
        scoreboardButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        scoreboardButton.setForeground(new java.awt.Color(51, 255, 51));
        scoreboardButton.setText("Score Board");
        scoreboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreboardButtonActionPerformed(evt);
            }
        });

        signInButton.setBackground(new java.awt.Color(0, 102, 51));
        signInButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(51, 255, 51));
        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tip: Signing in will let you save your score");

        howToPlayButton.setBackground(new java.awt.Color(0, 102, 51));
        howToPlayButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        howToPlayButton.setForeground(new java.awt.Color(51, 255, 51));
        howToPlayButton.setText("How to play?");
        howToPlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToPlayButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 102, 51));
        exitButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(51, 255, 51));
        exitButton.setText("X");
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Signed in as");

        playerNameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        playerNameLabel.setForeground(new java.awt.Color(51, 255, 51));
        playerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playerNameLabel.setText("Guest");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(howToPlayButton, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scoreboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerNameLabel)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(howToPlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signInButton)))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreboardButtonActionPerformed
        //goes to the scoreboard page
        this.dispose();
        ScoreBoardFrame scoreBoardFrame = new ScoreBoardFrame();
        scoreBoardFrame.setVisible(true);
    }//GEN-LAST:event_scoreboardButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        this.dispose();
        SignInFrame signInFrame = new SignInFrame();
        signInFrame.setVisible(true);
    }//GEN-LAST:event_signInButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        player = new Player(MillionaireMainGUI.staticPlayerName, 0, "0");
        
        this.dispose();       //create a new game frame after disposing of the current menu frame        
        GameFrame gameFrame = new GameFrame(player);   //player as paremeter to save the name of the player that is playing
        gameFrame.setVisible(true);
    
    }//GEN-LAST:event_playButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // exit the program
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void howToPlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToPlayButtonActionPerformed
        this.dispose();
        HowToPlayFrame howToPlayFrame = new HowToPlayFrame();
        howToPlayFrame.setVisible(true);
    }//GEN-LAST:event_howToPlayButtonActionPerformed

    
    public void  updateLabels(){
        playerNameLabel.setText(MillionaireMainGUI.staticPlayerName);
    }
    
    
    private final javax.swing.JLabel background;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton howToPlayButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JButton scoreboardButton;
    private javax.swing.JButton signInButton;
    // End of variables declaration//GEN-END:variables
}
