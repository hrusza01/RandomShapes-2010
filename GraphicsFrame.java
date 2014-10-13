/** 
By Zach Hruska
*/

import javax.swing.*;

public class GraphicsFrame extends JFrame
{
	private GraphicsPanel gpanel;

	public GraphicsFrame()
	{
		super();

		this.setSize(500,500);
		this.setTitle("Smile Picture");

		gpanel = new GraphicsPanel();
		this.add(gpanel);
	}
}
