import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
 
                        //Paint the background
                        g.setColor(Color.ORANGE);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        /*
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                        g.setColor(Color.BLACK);
                        g.drawRect(x1+4, y1+4, width-9, height-9);
                        
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        */
                        
                        
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((width/2)-27, (height/2)-27, 55, 55);
            }
}