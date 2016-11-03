/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bresenham;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CHHANNZ
 */
public class garis extends JPanel{
    private int x0,y0,x1,y1;
    
    public int getx0() {
        return x0;
    }
    
    public int getx1() {
        return x1;
    }
    
    public int gety0() {
        return y0;
    }
    
    public int gety1() {
        return y1;
    }
    
    public void setx0(int xa) {
        x0 = xa;
    }
    
    public void sety0(int ya) {
        y0 = ya;
    }
    
    public void setx1(int xb) {
        x1 = xb;
    }
    
    public void sety1(int yb) {
        y1 = yb;
    }
    
    public void paint(Graphics g) {
        int x,y,xend;
        int dx = Math.abs(x1-x0);
        int dy = Math.abs(y1-y0);
        int p = 2*dy-dx;
        int duady = 2*dy;
        int duadydx = 2*(dy-dx);
        
        super.paint(g);
        this.setBackground(Color.PINK);
        g.setColor(Color.GRAY);
        
        if (x0>x1) {
            x = x1;
            y = y1;
            xend = x0;
        } else {
            x = x0;
            y = y0;
            xend = x1;
        }
        
       
        g.drawRect(x, y, 1, 1); //1, 1 besar ukuran titiknya
        while(x<xend) {
            x++;
            if(p<0) {
                p+=duady;
            } else {
                if (y0>y1) {
                    y--; } else y++;
                p+=duadydx;
            }
            g.drawRect(x, y, 1, 1);
        }
    }
    
    public garis() {
        
    }
        
}
