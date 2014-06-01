import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


public class Main 
{
	// Textfields //
	public static JTextField textfield = new JTextField("Enter the exact URL...");
	// String Query //
	public static String currentQuery = "";
	// Check Condition for null click //
	public static boolean singleClickText = true;

	public static void main(String[] args)
	{

		// For setting our apps position //
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


		// ActionListeners //
		ActionListener actionListener = new ActionListener() 
		{
			public void actionPerformed(ActionEvent actionEvent)
			{
				currentQuery = textfield.getText(); // now we use this to craft our query search //
				eBayHandler handler = new eBayHandler(currentQuery);
				handler.getURL();
			}
		};
		textfield.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				if(singleClickText)
				{
					textfield.setText("");
					singleClickText = false;
				}
			}
		});

		// Frame Actions //
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(searchButton);
		frame.setJMenuBar(menuBar);
		frame.add(textfield);

		// ALL FRAME ADDS MUST BE DONE ABOVE THIS //
		frame.getContentPane().add(label, BorderLayout.CENTER);		
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

		// Menu Actions //
		fileMenu.add(fileItem1);
		optionsMenu.add(optionsItem1);
		helpMenu.add(helpItem1);

		// MenuBar Actions //
		menuBar.add(fileMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);

		// Button Actions //
		searchButton.addActionListener(actionListener);
		searchButton.setSize(100, 25);
		searchButton.setLocation(0, 50);

		// TextField Actions //
		textfield.setSize(300, 25);
		textfield.setLocation(0, 25);

		// End Frame Work -> Pack and visible are final actions //
		frame.pack();
		frame.setSize(500, 250);
		frame.setVisible(true);
	}
}
