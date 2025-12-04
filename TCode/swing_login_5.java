import javax.swing.*;
import java.awt.event.*;

class swing_login_5
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("This is demo program");
		
		JLabel l1=new JLabel();
		l1.setBounds(20,20,200,30);
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
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String uname=t1.getText();
				String password=p1.getText();
				if(uname.equals("abc") && password.equals("123"))
				{
					l1.setText("You are welcome");
				}
				else
				{
					l1.setText("Invalid username or password");
				}
			}
		});
		f.add(b1);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}