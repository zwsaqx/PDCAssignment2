//Zachary Annabell 19067182
//The scoreboard frame class handles the GUI components of the score board page

package pdcassignment2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ScoreBoardFrame extends javax.swing.JFrame {

    
    public ScoreBoardFrame() {
        initComponents();
        background = new javax.swing.JLabel("", new ImageIcon("moneyRain.gif"), JLabel.CENTER);
        background.setBounds(0,0,getWidth(),getHeight());
        this.add(background);
        this.setResizable(false);  //stops users from changing size of program
        this.setLocationRelativeTo(null); //centres the program
        
        LoadPlayers load = new LoadPlayers();
        playerAmountLabel.setText("" + load.getPlayerAmount());
        playerListTextArea.setText(load.getScoreBoardText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        playerListTextArea = new javax.swing.JTextArea();
        staticTitleLabel2 = new javax.swing.JLabel();
        playerAmountLabel = new javax.swing.JLabel();

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
        TitleLabel.setText("Score Board: (sorted by oldest)");
        TitleLabel.setToolTipText("Easter egg 1 found! Can you find the other 4?");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tip: giving me an A+ will put you at the top of my scoreboard ;)");

        menuButton.setBackground(new java.awt.Color(0, 102, 51));
        menuButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        menuButton.setForeground(new java.awt.Color(51, 255, 51));
        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        playerListTextArea.setEditable(false);
        playerListTextArea.setBackground(new java.awt.Color(0, 102, 51));
        playerListTextArea.setColumns(20);
        playerListTextArea.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        playerListTextArea.setForeground(new java.awt.Color(51, 255, 51));
        playerListTextArea.setRows(5);
        playerListTextArea.setText("\n");
        playerListTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playerListTextArea.setFocusable(false);
        playerListTextArea.setHighlighter(null);
        jScrollPane2.setViewportView(playerListTextArea);

        staticTitleLabel2.setBackground(new java.awt.Color(255, 255, 255));
        staticTitleLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        staticTitleLabel2.setForeground(new java.awt.Color(51, 255, 51));
        staticTitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        staticTitleLabel2.setText("Player Amount: ");
        staticTitleLabel2.setToolTipText("Easter egg 1 found! Can you find the other 4?");

        playerAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerAmountLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        playerAmountLabel.setForeground(new java.awt.Color(51, 255, 51));
        playerAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playerAmountLabel.setText("123");
        playerAmountLabel.setToolTipText("Easter egg 1 found! Can you find the other 4?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(staticTitleLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(menuButton)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // ADD SAVE SCORE AS NAME ON SCOREBOARD

        this.dispose();  //close this window
        MenuFrame menuFrame = new MenuFrame(new Player(MillionaireMainGUI.staticPlayerName, 0, "0"));
        menuFrame.setVisible(true);

    }//GEN-LAST:event_menuButtonActionPerformed


    private javax.swing.JLabel background;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel playerAmountLabel;
    private javax.swing.JTextArea playerListTextArea;
    private javax.swing.JLabel staticTitleLabel2;
    // End of variables declaration//GEN-END:variables
}
