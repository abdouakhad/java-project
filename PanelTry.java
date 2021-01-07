import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JLabel;

public class PanelTry extends JFrame{
	public PanelTry(){
		setTitle("Trying Panel this time");
		setSize(400,400);

		// setLayout(null); To Help if we want to position our way.

		// Panel creation
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		// Label Creation
		JLabel myLabelTop = new JLabel("Welcome to The Bank");
      	JLabel myLabelMiddle = new JLabel("How Can we help You");
      	JLabel myLabelBottom = new JLabel("copyright © 2020-2021");

      	//Button Creation
      	JButton button1 = new JButton("Withdraw Money");
      	JButton button2 = new JButton("Make Deposit");
      	JButton button3 = new JButton("Check Balance");

      	// Putting Backgroung Colors to panels
      	panel.setBackground(Color.decode("#490a0a"));
      	panel2.setBackground(Color.decode("#757575"));
      	panel3.setBackground(Color.decode("#490a0a"));
      	panel4.setBackground(Color.decode("#490a0a"));

      	// Putting Borders in our panels
		Border blackline = BorderFactory.createLineBorder(Color.black);
      	panel.setBorder(blackline);
      	panel2.setBorder(blackline);
      	panel3.setBorder(blackline);
      	
      	// Putting Colors to our text
      	myLabelTop.setForeground(Color.WHITE);
      	myLabelMiddle.setForeground(Color.WHITE);
      	myLabelBottom.setForeground(Color.WHITE);

      	// adding to our Panels and Frames
      	panel3.add(myLabelBottom);

      	panel2.add(myLabelMiddle);
      	panel4.add(button1);
      	panel4.add(button2);
      	panel4.add(button3);

      	panel2.add(panel4);
		panel.add(myLabelTop);

		this.add(panel2,BorderLayout.CENTER);
		this.add(panel,BorderLayout.NORTH);
		this.add(panel3,BorderLayout.SOUTH);

	}

	// The main Class to run the program
	public static void main(String[] args) {
		PanelTry stack = new PanelTry();
		stack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stack.setVisible(true);
	}
	
}