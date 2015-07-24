import javax.swing.JOptionPane;


public class project
{
public static void main(String[] args)
{
	String feet = JOptionPane.showInputDialog("How tall are you?");
	int number = Integer.parseInt(feet);
if (number <= (4))
{
	JOptionPane.showMessageDialog(null, "You need to grow taller!");
}
if(number >= (4))
{
	JOptionPane.showMessageDialog(null, "Enjoy the ride!");
}

}
}
