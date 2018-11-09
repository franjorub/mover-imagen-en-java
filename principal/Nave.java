/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author francisco.rubial
 */
public class Nave {
    private Image image;
    private int posx;
    private int posy;
    
    public Nave()  {
        try {
            image = ImageIO.read(new File("src/principal/nave.png"));
        } catch (IOException ex) {
            System.out.println("no se encontro la imagen");
        }
        posx = 0;
        posy = 0;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    
    
}
