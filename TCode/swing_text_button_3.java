import javax.swing.*;
import java.awt.*;

class swing_text_button_3
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("This is demo program");
		
		JLabel l1=new JLabel();
		l1.setText("This is first control");
		l1.setBounds(20,20,100,30);
		f.add(l1);
		
		JTextField t1=new JTextField();
		t1.setBounds(20,60,100,30);
		f.add(t1);
		
		JPasswordField p1=new JPasswordField();
		p1.setBounds(20,100,100,30);
		f.add(p1);
		
		JButton b1=new JButton();
		b1.setText("Click");
		b1.setBounds(20,140,100,30);
		f.add(b1);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}