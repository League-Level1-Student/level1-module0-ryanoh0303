import javax.swing.JOptionPane;

public class PopCornMaker {

	public static void main(String[] args) {
		String y=JOptionPane.showInputDialog("What flavor do you want?");
    	Popcorn popcorn= new Popcorn(y);
        String x= JOptionPane.showInputDialog("How many minutes do you want it to be cooked?");
        int x2=Integer.parseInt(x);
        Microwave microwave= new Microwave();
        microwave.setTime(x2);
        microwave.putInMicrowave(popcorn);
       microwave.startMicrowave();
       popcorn.applyHeat();
       
        popcorn.eat();
	}
	

}
