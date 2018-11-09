/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author francisco.rubial
 */
public class Panel extends JPanel{
    private Nave nave;
    private JButton boton;
    public Panel() {
        JPanel self = this;
        Timer t = new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nave.setPosx(nave.getPosx() + 5);
                repaint();
            }
        });
        nave = new Nave();     
        boton = new JButton("Clickeame");
       t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cargado el paint");
        g.drawImage(nave.getImage(), nave.getPosx(), nave.getPosy(), this);
    }
    
    
    
    
    
    
}
