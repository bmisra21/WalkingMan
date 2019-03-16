import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class Ball extends JComponent
{
	private Ellipse2D.Double ball;
	private int dX = 0, dY=0;
	
	public Ball()
	{
		ball = new Ellipse2D.Double(0, 0, 20, 20);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(ball);
	}
	public void shoot()
	{
		setLocation(getX(), getY()-5);
	}
}
