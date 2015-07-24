import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class MyFirstProgram {
	public static void main(String[] args) {
		// START HERE
		String shape=JOptionPane.showInputDialog("what shape?");
		System.out.println(shape);
		if(shape.equals("square"))
		{
			Tortoise.show();
			Tortoise.setSpeed(5);
		for (int i = 0; i < 4; i++)
		{
			Tortoise.move(90);
			Tortoise.turn(90);
		}
		}
		else if(shape.equals("triangle"))
	{
		for (int i = 0; i < 3; i++)
		{
		Tortoise.move(90);
		Tortoise.turn(120);
		}
	}
		else if(shape.equals("hexagon"))
    {
    	Tortoise.setSpeed(6);
    	for (int i = 0; i < 6; i++)
		{	
    	Tortoise.move(70);
    	Tortoise.turn(360/6);
		}
    }
		else
		{
			Tortoise.setSpeed(6);
			for (int i = 0; i < 9; i++)
			{	
			Tortoise.move(99);
			Tortoise.turn(80);
			Tortoise.turn(33);
			}
		}
		
		
	}
}
