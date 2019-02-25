/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
         int score= 0;
		// 2. Set the size of the window in the initializeGui() method below
			
		// 4. Ask the user who this person is and store their answer
		String guess= JOptionPane.showInputDialog("who is this?");
		
		if(guess.equalsIgnoreCase("Arnold")) {
		    JOptionPane.showMessageDialog(null,"You guessed it correctly");
		    score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. It was Arnold");
		}
		showNextImage();
		String guess2= JOptionPane.showInputDialog("who is this?");
		if(guess2.equalsIgnoreCase("Leonardo")) {
		    JOptionPane.showMessageDialog(null,"You guessed it correctly");
		    score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. It was Leonardo");
		}
		showNextImage();
		String guess3= JOptionPane.showInputDialog("who is this?");
		if(guess3.equalsIgnoreCase("Morgan")) {
		    JOptionPane.showMessageDialog(null,"You guessed it correctly");
		    score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. It was Morgan");
		}
		showNextImage();
		String guess4= JOptionPane.showInputDialog("who is this?");
		if(guess4.equalsIgnoreCase("Jack")) {
		    JOptionPane.showMessageDialog(null,"You guessed it correctly");
		    score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. It was Jack");
		}
		JOptionPane.showMessageDialog(null,"Your total score is "+score);
 
		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1

		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
	    	// 8. Show them their current score

		// 9. .... repeat for all your images.....


	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		window.setSize(800,800);
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		window.setSize(500,500);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
