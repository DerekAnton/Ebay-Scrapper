import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Main 
{
	public static void main(String[] args)
	{
		//  Frame Variables //
		JFrame frame = new JFrame("Ebay Snooper");
		JLabel label = new JLabel();
		
		// MenuBar Variables //
		JMenuBar menuBar = new JMenuBar();
		
		// Menu Variables //
		JMenu fileMenu = new JMenu("File");
		JMenu optionsMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");
		
		// MenuItem Variables // 
		JMenuItem fileItem1 = new JMenuItem("File menu item");
		JMenuItem optionsItem1 = new JMenuItem("File options item");
		JMenuItem helpItem1 = new JMenuItem("God can only help you now...");
		
		
		
		
		
		
		// Frame Actions //
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setJMenuBar(menuBar);
		
		// Menu Actions //
		fileMenu.add(fileItem1);
		optionsMenu.add(optionsItem1);
		helpMenu.add(helpItem1);
		
		// MenuBar Actions //
		menuBar.add(fileMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);
		
		// End Frame Work -> Pack and visible are final actions //
		frame.pack();
		frame.setVisible(true);
	}
}
