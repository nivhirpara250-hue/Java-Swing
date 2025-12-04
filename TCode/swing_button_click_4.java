import javax.swing.*;
import java.awt.*;

class swing_button_click_4
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
		b1.setText("Click Here");
		b1.setBounds(20,140,100,30);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//l1.setText("Hello from event");
				String str=t1.getText();
				l1.setText(str);
			}
		});
		f.add(b1);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}