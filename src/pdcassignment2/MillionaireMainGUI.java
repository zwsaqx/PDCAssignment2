//Zachary Annabell 19067182
//this is the main function that runs the millionaire game gui, database etc...
  
// remember five test cases in their own file! TUTORIAL: https://www.softwaretestinghelp.com/junit-tests-examples/

package pdcassignment2;

public class MillionaireMainGUI {

    public static String staticPlayerName = "Guest";  //this needs to be global for all the frames to read it.
    
    public static void main(String[] args) {
                
        /* Set the Nimbus look and feel */   //JAVAS CODE, NOT MINE! all credit for collapsable below to them.
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try { for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;} }
        } catch (ClassNotFoundException ex) { java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) { java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) { java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                MenuFrame frame = new MenuFrame(new Player());
                frame.setVisible(true);
            }
        });
    }
}
