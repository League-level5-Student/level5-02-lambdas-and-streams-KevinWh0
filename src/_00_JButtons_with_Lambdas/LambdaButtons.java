package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	Random rand = new Random();
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e) ->{
			int numb1 = rand.nextInt(100);
			int numb2 = rand.nextInt(100);
			
	        JOptionPane.showMessageDialog(null, numb1 + " + " + numb2 + " = " + (numb1 + numb2), "", JOptionPane.INFORMATION_MESSAGE);
		});
		randNumber.addActionListener((e) ->{
			
	        JOptionPane.showMessageDialog(null, "Random Number : " + rand.nextInt(99999999), "", JOptionPane.INFORMATION_MESSAGE);
		});
		tellAJoke.addActionListener((e) ->{
	        JOptionPane.showMessageDialog(null, "Whats the best thing about Switzerland? \n \n \n I dont know, but the flag is a big plus!", "Joke", JOptionPane.INFORMATION_MESSAGE);
		});
				
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
