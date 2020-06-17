import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.*;

public class MouseMove {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
			int xCoord = 1;
			int yCoord = 1;
			int genRandomness;
			double width,height;
			
			Robot robot = new Robot();
			Random random = new Random();
			
			PointerInfo pointerInfo;
			Point point;
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			width = screenSize.getWidth();
			height = screenSize.getHeight();
			
			
			
			while (true)
			{
				robot.delay(60000);
				pointerInfo = MouseInfo.getPointerInfo();
				point = pointerInfo.getLocation();
				xCoord = (int)point.getX();
				yCoord = (int)point.getY();
				
				System.out.println("moving");
				genRandomness = random.nextInt();
				if(xCoord == 1919 || yCoord == 1079)
					robot.mouseMove(xCoord-1, yCoord-1);
				else if(xCoord == 0 || yCoord ==0)
					robot.mouseMove(xCoord+1, yCoord+1);

				else if (genRandomness%2==0)
					robot.mouseMove(xCoord+1, yCoord+1);
				else
					robot.mouseMove(xCoord-1, yCoord-1);
				
				
			}
			
			
			
	}

}
