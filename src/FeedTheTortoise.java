// Copyright Wintriss Technical Schools 2013
/****** MUST BE USED WITH JAVA 1.6 *****/

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise implements KeyEventDispatcher
{

	private void feedTheTortoise()
	{
		addFood(17, 17);
	}

	private void goUp()
	{
		System.out.println("going up");
		Tortoise.setAngle(0);
		Tortoise.move(10);
	}

	private void goDown()
	{
		Tortoise.setAngle(180);
		Tortoise.move(10);
	}

	private void goLeft()
	{
		Tortoise.setAngle(270);
		Tortoise.move(10);
	}

	private void goRight()
	{
		Tortoise.setAngle(90);
		Tortoise.move(10);
	}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();


		// 8. if tortoise is at same location as food
		// print "chomp"
		// say �chomp� with Runtime.getRuntime().exec(�say chomp�);
		// call the eatFood() method

		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);

		if (tortoiseLocationX == 20 && tortoiseLocationY == 20)
		{
			System.out.println("chomp");
			Runtime.getRuntime().exec("say chomp");
		}
	}

	private void eatFood()
	{
		component.setText("");
	}

	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();
	Label component = new Label("*");

	public static void main(String[] args)
	{
		FeedTheTortoise feeder = new FeedTheTortoise();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise()
	{
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			try
			{
				checkIfFoodFound();
			} catch (Exception exception)
			{
			}
		}
		return false;
	}

}
