package doubles_and_booleans;
import javax.swing.JOptionPane;
public class Test_Score {
	public static void main(String[] args) {
		
	String test = JOptionPane.showInputDialog("what is your test score");
	double score = Double.parseDouble(test);
	
	if(score > 90)
	{
		JOptionPane.showMessageDialog(null, "awesome");
	}
	else if(score < 90 && score > 80)
	{
		JOptionPane.showMessageDialog(null, "good");
	}
	else if(score < 80 && score > 70)
	{
		JOptionPane.showMessageDialog(null, "ok");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "better luck next time");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
