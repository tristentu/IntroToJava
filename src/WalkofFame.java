// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;


/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge. A solution
 * is printed in the red curriculum folder.
 */

public class WalkofFame
{
	public static void main(String[] args)
	{
	 WalkofFame q= new WalkofFame();
	q.Starz();
	}
	
	public void Starz()
	{
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setX(50);
		
		for (int j = 0; j < 1000; j+=50)
{
		Tortoise.setX(j);
		for (int i = 0; i < 5; i++)
		{
			Tortoise.move(30);
			Tortoise.turn(144);
		}
		
}
	}

}
