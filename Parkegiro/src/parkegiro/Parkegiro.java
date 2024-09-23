/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkegiro;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import parkegiro.View.Home_VIEW;
import parkegiro.View.SplashScreen_VIEW;

/**
 *
 * @author labsfiap
 */
public class Parkegiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        // Inicie a aplicação
        java.awt.EventQueue.invokeLater(() -> {
            new SplashScreen_VIEW().setVisible(true);
        });

    }
}
