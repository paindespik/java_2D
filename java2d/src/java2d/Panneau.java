package java2d;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	public int a=0;
	public void paintComponent(Graphics g) {
		a++;
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		//Je verrais cette phrase à chaque fois que cette méthode sera invoquée
		System.out.println("Je suis exécutée une fois! a = " + a);
		g.drawRect(x1, y1, x1*2, y1*2);
	}
	
}
