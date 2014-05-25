import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;


public class Main 
{
	
	public static void main(String[] args)
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		//  Frame Variables //
		JFrame frame = new JFrame("Ebay Snooper");
		JLabel label = new JLabel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		// Button Variables //
		JButton searchButton = new JButton("Search");
		frame.add(searchButton);
		
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		// Button Actions //
		// Action when the button is pressed //
		ActionListener actionListener = new ActionListener() 
		{
			public void actionPerformed(ActionEvent actionEvent)
		    	{
		        	System.out.println("Your item was searched.");
		      	}
		};
		searchButton.addActionListener(actionListener);
		
		
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
		frame.setSize(500, 250);
		frame.setVisible(true);
	}
}
