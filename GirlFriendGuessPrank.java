import javax.swing.JOptionPane;

public class GirlFriendGuessPrank {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your Girlfriend's Name: ");
		
		if(
				name != null &&
				(
						(name.equals("I am single"))
						)
					)
			{
				JOptionPane.showMessageDialog(null, "Yes, You are single. You are not a liar :)");
				} else {
				JOptionPane.showMessageDialog(null, "Stop lying MORON! I know the fact that you are SINGLE!!!");
				}
		

	}

}
