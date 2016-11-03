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
public class Main {

    /**
     * @param args the command line arguments
     */
    public Main() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Garis Bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs1 = new garis();       //memangil fungsi garis
        
        grs1.setx0(10);                 //mengatur besarnya x0 (modifikasi)
        grs1.sety0(10);                 //mengatur besarnya y0 (modifikasi)
        grs1.setx1(280);                //mengatur besarnya x1 (modifikasi)
        grs1.sety1(96);                 //mengatur besarnya y1 (modifikasi)
        grs1.setBackground(Color.WHITE); //memanggil fungsi pengaturan background (modifikasi)
        frame.add(grs1);                //menampilkan garis ke frame
        frame.setSize(600,400);         //menentukan besar frame yang akan ditampilkan (modifikasi)
        frame.setVisible(true);
        
    }

}
