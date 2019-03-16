import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Man extends JComponent 
{
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, torso;
	private int dX = 0, dY=0;
	
	public Man()
	{
		head = new Ellipse2D.Double(20,20,20,20);
		torso = new Rectangle(20,40,20,40);
		leftArm = new Rectangle(0,40,40,10);
		rightArm = new Rectangle(40,40,20,10);
		leftLeg = new Rectangle(20,80,7,40);
		rightLeg = new Rectangle(33,80,7,40);
		
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(head);
		g2.fill(torso);
		g2.fill(leftArm);
		g2.fill(rightArm);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
	}
	
	public void setDx(int x)
	{
		dX=x;
	}
	public void setDy(int y)
	{
		dY=y;
	}
	public void update()
	{
		setLocation(getX()+dX, getY()+dY);
	}
	
	

}