import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        int starPosx = -10;
                        int starPosy = -10;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height/5, width +1, height/5);
                        
                        g.fillRect(x1, 3*height/5, width +1, height/5);
                        
                        Polygon p1 = new Polygon();
                        p1.addPoint(x1, y1);
                        p1.addPoint(width/2, height/2);
                        p1.addPoint(x1, height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p1);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25 + starPosx, y1 + 73 + starPosy);
                        p2.addPoint(x1 + 41 + starPosx, y1 + 73 + starPosy);
                        p2.addPoint(x1 + 47 + starPosx, y1 + 58 + starPosy);
                        p2.addPoint(x1 + 53 + starPosx, y1 + 73 + starPosy);
                        p2.addPoint(x1 + 69 + starPosx, y1 + 73 + starPosy);
                        p2.addPoint(x1 + 56 + starPosx, y1 + 83 + starPosy);
                        p2.addPoint(x1 + 61 + starPosx, y1 + 98 + starPosy);
                        p2.addPoint(x1 + 47 + starPosx, y1 + 88 + starPosy);
                        p2.addPoint(x1 + 34 + starPosx, y1 + 98 + starPosy);
                        p2.addPoint(x1 + 38 + starPosx, y1 + 83 + starPosy);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}