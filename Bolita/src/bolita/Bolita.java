
package bolita;

import java.awt.Canvas;
import java.awt.Graphics;


public class Bolita extends Canvas {

    int moverX, moverY;
    
    public Bolita(){
        this.setSize(400,200);
    }
    
    public void paint(Graphics g ){
        super.print(g);
        g.fillOval(moverX, moverY, 30, 30);
    }

    public static void main(String[] args) {
        
    }
    
}
