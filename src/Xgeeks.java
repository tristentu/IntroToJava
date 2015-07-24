
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;


public class Xgeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String John="flying";
	String Suzy="shape-shifting";
	
	
			String superpower=JOptionPane.showInputDialog("Enter your name to see what your superpower is.");
	System.out.println(superpower);
		  if(superpower.equals("John"))
	{
	  JOptionPane.showMessageDialog(null, "invisibility");
	}
  else if(superpower.equals("Tristen"))
  {
	  JOptionPane.showMessageDialog(null, "mind-reading");
  }
  else if(superpower.equals("Suzy"))
  {
	  JOptionPane.showMessageDialog(null, "shape-shifting");
  }
  else if(superpower.equals("Bob"))
  {
	  JOptionPane.showMessageDialog(null, "X-ray vision");
  }
  else if(superpower.equals("Jilian"))
  {
	 JOptionPane.showMessageDialog(null, "flying");
  }
  else
  {
	  JOptionPane.showMessageDialog(null, "You have no superpowers; but have a nice day!");
  }
  
	}
}


