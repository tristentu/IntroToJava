import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady
{
	public static void main(String[] args)
	{
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		int numCats = Integer.parseInt(cats);

		if (numCats > 3)
		{
			JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");
		}
		else if (numCats == 0)
		{
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
		
		else if (numCats < 3)
		{
			playVideo("https://www.youtube.com/watch?v=QScxSMWOT-c");
		}
		

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like
		// a Human
		
	}

	static void playVideo(String videoURL)
	{
		try
		{
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
