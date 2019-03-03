import java.applet.AudioClip;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button1= new JButton("Sound 1");
	JButton button2= new JButton("Sound 2");
	JButton button3= new JButton("Sound 3");

	public static void main(String[] args) {
		SoundEffects sound= new SoundEffects();
		sound.createUI();
		

	}
	public void createUI() {
		JFrame jframe= new JFrame("Sound Machine");
		JPanel jpanel= new JPanel();
		
		JLabel jlabel= new JLabel("Choose a sound");
		jpanel.add(jlabel);
		
		button1.setSize(100,100);
		button2.setSize(100,100);
	    button3.setSize(100,100);
	    
	    jpanel.add(button1);
	    jpanel.add(button2);
	    jpanel.add(button3);
	    
	    
	    jframe.add(jpanel);
		jframe.setSize(800, 800);
		jframe.setVisible(true);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
	}

private void playSound(String fileName) {
     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
     sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed= (JButton) e.getSource();
	if(buttonPressed==button1) {
		playSound("cymbal.wav");
	}
	else if(buttonPressed==button2) {
		playSound("drum.wav");
	}
	else {
		playSound("homer-woohoo.wav");
	}
	
}


}
