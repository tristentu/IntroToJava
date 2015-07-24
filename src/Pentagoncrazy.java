import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the tortoise will have to turn (360/5) */

public class Pentagoncrazy
{
	public static void main(String[] args)
	{
		new Pentagoncrazy().makePrettyThings();
	}

	private void makePrettyThings()
	{
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Colors.getRandomColor());
		int sides = 30;
		int angle = 100000;
		for (int i = 0; i < 10000000; i++)
		{
			Tortoise.move(i);
			Tortoise.turn(angle);
            Tortoise.turn(2);
            Tortoise.move(500);
		}
		
	}
	
	
	
	
	
	
	
	
	// Variations:
	// *9. make the pattern really huge
	// *10. change the color of the pattern
	// *11. experiment with different shapes
	// *12. create a method called, "adjustPen()"
	// that makes the pen get increasingly bigger.
	// stop the pen getting too big (width of 4 or more is too big)
	// *13. choose 5 colors and change them every time adjustPen() is called
}

// Copyright Wintriss Technical Schools 2013
