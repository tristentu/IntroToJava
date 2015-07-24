

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Birthdays {

	public static void main(String[] args) {
	
		String mom = "May 10";
		String dadsBirthday = "January 4";
		String myBirthday = "January 9";

		String birthday=JOptionPane.showInputDialog("Which birthday?");
	
		System.out.println(birthday);
		
		if(birthday.equals("mom"))
		{
		JOptionPane.showMessageDialog(null,"April 10");
		}
				else if(birthday.equals("dad"))
		{
		JOptionPane.showMessageDialog(null, "January 4");
		}
				else if(birthday.equals("Tristen's birthday"))
		{
			JOptionPane.showMessageDialog(null, "January 9");
		}
			    else 
		{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	} 
}



