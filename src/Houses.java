import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class Houses {
       
	public static void main(String[] args) {
		Robot robot= new Robot();
		robot.penDown();
		robot.setSpeed(20);
		robot.setX(70);
		robot.setY(500);
		robot.setPenWidth(10);
		for(int i=0; i<5; i++) {
			Random rand= new Random();
			int random=rand.nextInt(3);
			if(random==0) {
				drawrectangle(robot,"small","red");
			}
			else if(random==1) {
				drawrectangle(robot,"medium","BLue");
			}
			else {
				drawrectangle(robot,"large","Green");
			}
		}
	}
	 
	public static void drawrectangle(Robot robot, String size, String color) {
		if(color.equalsIgnoreCase("Blue")) {
	  		robot.setPenColor(0,0,255);
	  	}
	  	else if(color.equalsIgnoreCase("Red")) {
	  		robot.setPenColor(255,0,0);
	  	}
	  	else if(color.equalsIgnoreCase("Green")) {
	  		robot.setPenColor(0,255,0);
	  	}
	  	else {
	  		System.out.println("Color unrecognized");
	  	}
		int height=0;
		if(size.equalsIgnoreCase("Small")) {
			height=60;
			drawPointyRoof(robot, height);
		}
		else if(size.equalsIgnoreCase("Medium")) {
			height=120;
			drawPointyRoof(robot, height);
		}
		else if(size.equalsIgnoreCase("Large")) {
			height=250;
			drawFlatRoof(robot,height);
		}
		else {
			System.out.println("Size unrecognized");
		}
		
	}
	public static void drawPointyRoof(Robot robot, int height) {
        robot.move(height);
		robot.turn(45);
        robot.move(50);
        robot.turn(90);
        robot.move(50);
        robot.turn(45);
        robot.move(height);
        robot.turn(-90);
        robot.move(50);
        robot.turn(-90);
	}
	public static void drawFlatRoof(Robot robot, int height) {
		robot.move(height);
		robot.turn(90);
		robot.move(75);
		robot.turn(90);
		robot.move(height);
		robot.turn(-90);
		robot.move(50);
		robot.turn(-90);
	}

}
