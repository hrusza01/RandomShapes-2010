/** 
By Zach Hruska
*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*; 
import java.awt.event.*; 
import java.awt.event.ActionListener; 
import java.util.*;  

public class GraphicsPanel extends JPanel
{ 
	private JButton squarebutton; 
	private JButton circlebutton;
	private Random mygen; 
	private ArrayList<Shape> myshapes; 

	public GraphicsPanel() 
	{ 
		super(); 
		mygen = new Random(); 
		setBackground(Color.YELLOW); 
		squarebutton = new JButton("SQUARE"); 
		circlebutton = new JButton("CIRCLE");
		squarebutton.addActionListener(new MyButtonListener());
		circlebutton.addActionListener(new MyButtonListener());
		this.add(squarebutton); 
		this.add(circlebutton);
		myshapes = new ArrayList<Shape>(); 
	} 

	public void paintComponent(Graphics g) 
	{ 
		super.paintComponent(g); 
		Graphics2D g2 = (Graphics2D) g; 
		for (Shape s:myshapes) 
			g2.fill(s); 
	}

	private class MyButtonListener implements ActionListener 
	{ 
	
		public MyButtonListener()
		{ 
		} 

		public void actionPerformed(ActionEvent ae) 
		{ 
			int x = mygen.nextInt(400); 
			int y = mygen.nextInt(400);
			int z = mygen.nextInt(50);

			if (ae.getSource() == squarebutton)
			{
				Rectangle2D.Double myrec = new Rectangle2D.Double(x,y,z,z);
				myshapes.add(myrec);
				repaint(); 
			}
			else
			{
				Ellipse2D.Double mycir = new Ellipse2D.Double(x,y,z,z);
				myshapes.add(mycir);
				repaint();
			}
		}
	}
} 






