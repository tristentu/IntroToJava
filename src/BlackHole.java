
// Copyright The League of Amazing Programmers 2014

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class BlackHole {

    public static void main(String[] args) {
   	 // 4. Set Tortoise speed to 10
    	Tortoise.setSpeed(10);
   	 
    
   	 // 10. Set pen color to black
   	 // 11. Set pen width to 5
    }

    public static void drawHole() {
   	 // 6. Do the following (steps 7-9) 360 times:
   		for (int j = 0; j < 360; j++)
		{
			
    	// 7. Call the circle method with a length of 0.5
    	circle(0.5);
   		 // 8. Move the tortoise by i
    	Tortoise.move(i);
   		 // 9. Turn the tortoise 46 degrees
    	Tortoise.turn(46);
		} 
   	 }
   		 

    /*
     * Fill in the method below to draw a circle. Use the lengthOfSide variable
     * for the size of the circle.
     */
    public static void circle(double lengthOfSide) {
   	 // 1. Do the following (steps 2-3) 360 times
    	for (int i = 0; i < 360; i++)
		{
   		 // 2. Move the tortoise lengthOfSide
    	Tortoise.move(lengthOfSide);
   		 // 3. Turn the tortoise the smallest amount
    	Tortoise.turn(1);
		}

    }

}


