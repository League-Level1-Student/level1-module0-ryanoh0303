import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		FortuneCookie cookie= new FortuneCookie();
		cookie.showButton();

	}
	public void showButton() {
		JFrame jframe= new JFrame("hello");
		jframe.setSize(800, 800);
		jframe.setVisible(true);
		JPanel jpanel= new JPanel();
		JLabel jlabel= new JLabel("Fortune Cookie");
		jpanel.add(jlabel);
		jframe.add(jpanel);
		jframe.pack();
		
		JButton button= new JButton();
		button.setSize(100,100);
		jframe.add(button);
		button.addActionListener(this);
		
		
		System.out.println("Button Clicked");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Whoohoo");
		int rand= new Random().nextInt(5);
		
		if(rand==1) {
			JOptionPane.showMessageDialog(null,"You will die at an Arby's in Columbus, Ohio");
		       
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null,"Success is a journey, not a destination");
		}
		else if (rand==3) {
			JOptionPane.showMessageDialog(null, "Even Bad Luck Brian will have better luck than you");
		}
		else if (rand==4) {
			JOptionPane.showMessageDialog(null, "Don't eat any cinese food today or you'll be very sick");
		}
		else {
			JOptionPane.showMessageDialog(null, "You will die alone and poorly dressed");
		}
	}

}
