import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	JButton button1= new JButton("First Video");
	JButton button2= new JButton("Second Video");
	JButton button3= new JButton("Third Video");
	 public static void main(String[] args) {
		CutenessTv hello= new CutenessTv();
		hello.CreateUI();
	}
	public void CreateUI() {
		JFrame jframe= new JFrame();
		
		JPanel jpanel= new JPanel();
		 
		JLabel jlabel= new JLabel("Choose a video");
	
		
		jpanel.add(button1);
		jpanel.add(button2);
		jpanel.add(button3);
		jpanel.add(jlabel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		jframe.add(jpanel);
		jframe.setSize(800,800);
		
		jframe.setVisible(true);
	}

void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
     try {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     } catch (Exception e) {
          e.printStackTrace();
     }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub\
	JButton buttonPressed=(JButton) e.getSource();
	if(buttonPressed==button1) {
		showDucks();
	}
	else if(buttonPressed== button2) {
		showFrog();
	}
	else {
		showFluffyUnicorns();
	}
}
}
