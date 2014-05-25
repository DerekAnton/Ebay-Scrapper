import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main 
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Ebay Snooper");
		JLabel label = new JLabel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
