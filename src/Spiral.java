// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{

	public static void main(String[] args)
	{
	
		String shape = JOptionPane.showInputDialog("Which spiral shape; square, triangle, or pentagon?");	
		if (shape.equals("square"))
		{
			Tortoise.show();
			Tortoise.setSpeed(10);
			Tortoise.setPenColor(Colors.Blues.MidnightBlue);
			for (int i = 0; i < 500; i += 5)
			{
				Tortoise.move(i);
				Tortoise.turn(90);
			}
		} else if (shape.equals("triangle"))
		{
			Tortoise.show();
			Tortoise.setSpeed(10);
			for (int i = 0; i < 600; i += 7)
			{
				Tortoise.move(i);
				Tortoise.turn(360 / 3);
			}
			Tortoise.setX(370);
			Tortoise.setY(200);
			Tortoise.setPenColor(Colors.getRandomColor());
			for (int i = 0; i < 300; i += 5)
			{
				Tortoise.move(i);
				Tortoise.turn(360 / 3);
			}
			Tortoise.setPenColor(Colors.getRandomColor());
			for (int i = 0; i < 100; i -= 5)
			{
				Tortoise.move(i);
				Tortoise.turn(360 / 3);
			}
		} else if (shape.equals("pentagon"))
		{
			Tortoise.show();
			Tortoise.setSpeed(10);
			for (int i = 0; i < 600; i += 15)
			{
				Tortoise.move(i);
				Tortoise.turn(360 / 5);
		}
			Tortoise.show();
			Tortoise.setSpeed(10);
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.setX(500);
			for (int i = 0; i < 400; i +=7)
			{
				Tortoise.move(i);
				Tortoise.turn(360 / 5);
			}
		}
		else 
			
			{
				JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + shape); 
			}
		}
	{
		Tortoise.show();
		Tortoise.setSpeed(10);
		int side = 0;
		for (int i = 0; i < 400; i += 5)
		{
			Tortoise.move(i);
			Tortoise.turn(side);
		}

	}
}
