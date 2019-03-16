import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JFrame implements ActionListener
{
	private int x=150, y=150;
	private Man myMan = new Man();
	private Ball ball = new Ball();
	public Game()
	{
		
		setBounds(50,50, 800, 600);
		setTitle("Game");
		setLayout(null);
		setFocusable(true);
		
		Timer timer = new Timer(5, this);
		timer.start();
		
		
		myMan.setBounds(x,y,100,100);
		add(myMan);
		addKeyListener(new KeyListener()
				{
			@Override
			public void keyPressed(KeyEvent e) 
			{
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_DOWN)
				{
					myMan.setDy(10);
				} else if (keyCode == KeyEvent.VK_UP)
				{
					myMan.setDy(-10);
				} else if(keyCode == KeyEvent.VK_RIGHT)
				{
					myMan.setDx(10);
				}else if(keyCode == KeyEvent.VK_LEFT)
				{
					myMan.setDx(-10);
				}
				else if (keyCode == KeyEvent.VK_SPACE)
				{
					
					ball.setBounds(myMan.getX(), myMan.getY(), 30, 30);
					add(ball);
				}
				
			}
			@Override
			public void keyReleased(KeyEvent e) 
			{
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_DOWN)
				{
					myMan.setDy(0);
				} else if (keyCode == KeyEvent.VK_UP)
				{
					myMan.setDy(0);
				} else if(keyCode == KeyEvent.VK_RIGHT)
				{
					myMan.setDx(0);
				}else if(keyCode == KeyEvent.VK_LEFT)
				{
					myMan.setDx(0);
				}
				
			}
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
				}
				);

		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(myMan.getX()<=50)
		{
			myMan.setLocation(50, myMan.getY());
		} else if (myMan.getX() >=680)
		{
			myMan.setLocation(580, myMan.getY());
		} else if (myMan.getY() >=480)
		{
			myMan.setLocation(myMan.getX(), 380);
		} else if (myMan.getY() <=20)
		{
			myMan.setLocation(myMan.getX(), 20);
		}
		myMan.update();
		ball.shoot();
		repaint();
		
	}
	public static void main(String [] args)
	{
		Game game = new Game();
	}
	
	
	
	
}