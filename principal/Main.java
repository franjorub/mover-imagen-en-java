/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author francisco.rubial
 */
public class Main extends JFrame{
    private Panel pane;
   
    public Main() throws HeadlessException {
        this.setTitle("Nave");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //---------------------------
        
        pane = new Panel();
        
        
        
        
        
        
        
        this.setContentPane(pane);
        this.setVisible(true);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        new Main();
        
    }
    
}
