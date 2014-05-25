import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;


public class Main 
{
	public static void main(String[] args)
	{
		//  Frame Variables //
		JFrame frame = new JFrame("Ebay Snooper");
		JLabel label = new JLabel();
		JMenuBar menuBar = new JMenuBar();
		
		
		// Frame Actions //
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		
		// End Frame Work -> Pack and visible are final actions //
		frame.pack();
		frame.setVisible(true);
	}
}
