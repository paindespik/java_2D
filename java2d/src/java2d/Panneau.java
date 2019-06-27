package java2d;
import java.awt.*;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	public int a=0;
	private int posX=0;
	private int posY=0;
	public void paintComponent(Graphics g) {
		a++;
		int x1 = this.getWidth()/6;
		int y1 = this.getHeight()/6;
		//Je verrais cette phrase à chaque fois que cette méthode sera invoquée
		System.out.println("Je suis exécutée une fois! a = " + a);
		
		//TODO rectangle centré : 
		g.setColor(Color.blue);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		// TODO croix sur toute la fenetre :
		
	/*	g.drawLine(0, 0, this.getWidth(), this.getHeight());
		g.drawLine(this.getWidth(), 0, 0, this.getHeight());
	*/	
		// TODO polygon : relie les points entre eux. Relie le dernier point au premier (pareil avec polyline mais ne relie pas le dernier point au premier)
	
		/*	g.setColor(Color.red);
		int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
	    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
	    g.drawPolygon(x, y, 8);
	*/  
	    //TODO écrire du texte  : 
		
	/*	Font font = new Font("Courier",Font.BOLD,20);
		g.setFont(font);
		g.setColor(Color.red);
		
		g.drawString("beuleu", 10,20);
	*/	
		// TODO inserer une image avec drawImage() :
	/*	
		try {
		      Image img = ImageIO.read(new File("Apple_black.jpg"));
		      g.drawImage(img, 0, 0, this);
		      //Pour une image de fond
		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		*/
		//TODO arc-en-ciel avec passage d'une couleur a l'autre (graphics2d) : 
		
		/*
	    Graphics2D g2d = (Graphics2D)g;
	    GradientPaint gp, gp2, gp3, gp4, gp5, gp6; 
	    gp = new GradientPaint(0, 0, Color.RED, 1*x1, 0, Color.magenta, true);
	    gp2 = new GradientPaint(1*x1, 0, Color.magenta, 2*x1, 0, Color.blue, true);
	    gp3 = new GradientPaint(2*x1, 0, Color.blue, 3*x1, 0, Color.green, true);
	    gp4 = new GradientPaint(3*x1, 0, Color.green, 4*x1, 0, Color.yellow, true);
	    gp5 = new GradientPaint(4*x1, 0, Color.yellow, 5*x1, 0, Color.orange, true);
	    gp6 = new GradientPaint(5*x1, 0, Color.orange, 6*x1, 0, Color.red, true);

	    g2d.setPaint(gp);
	    g2d.fillRect(0, 0, x1, this.getHeight());               
	    g2d.setPaint(gp2);
	    g2d.fillRect(x1, 0, x1, this.getHeight());
	    g2d.setPaint(gp3);
	    g2d.fillRect(2*x1, 0, x1, this.getHeight());
	    g2d.setPaint(gp4);
	    g2d.fillRect(3*x1, 0, x1, this.getHeight());
	    g2d.setPaint(gp5);
	    g2d.fillRect(4*x1, 0, x1, this.getHeight());
	    g2d.setPaint(gp6);
	    g2d.fillRect(5*x1, 0, x1, this.getHeight());
		
		*/
		
		// TODO animation : 
		
	    g.setColor(Color.red);
	    g.fillOval(posX, posY, 50, 50);
	  }

	  public int getPosX() {
	    return posX;
	  }

	  public void setPosX(int posX) {
	    this.posX = posX;
	  }

	  public int getPosY() {
	    return posY;
	  }

	  public void setPosY(int posY) {
	    this.posY = posY;
	  }        
	
		
		
		
		
	
	
}
