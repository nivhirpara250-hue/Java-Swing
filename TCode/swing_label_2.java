import javax.swing.*;
import java.awt.*;

class swing_label_2
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("This is demo program");
		
		JLabel l1=new JLabel();
		l1.setText("This is first control");
		l1.setBounds(20,20,100,30);
		f.add(l1);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}