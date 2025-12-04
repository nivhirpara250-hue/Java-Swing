import javax.swing.*;
import java.awt.event.*;

class swing_calc_6
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("This is demo program");
		
		JLabel l1=new JLabel();
		l1.setBounds(20,20,100,30);
		f.add(l1);
		
		JTextField no1=new JTextField();
		no1.setBounds(20,60,100,30);
		f.add(no1);
		
		JTextField no2=new JTextField();
		no2.setBounds(20,100,100,30);
		f.add(no2);
		
		JTextField op=new JTextField();
		op.setBounds(20,140,100,30);
		f.add(op);
		
		JButton b1=new JButton();
		b1.setText("Click Here");
		b1.setBounds(20,180,100,30);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int n1,n2;
				String op1;
				n1=Integer.parseInt(no1.getText());
				n2=Integer.parseInt(no2.getText());
				op1=op.getText();
				if(op1.equals("+"))
				{
					Integer res=n1+n2;
					l1.setText(res.toString());
				}
				else if(op1.equals("-"))
				{
					Integer res=n1-n2;
					l1.setText(res.toString());
				}
				else if(op1.equals("*"))
				{
					Integer res=n1*n2;
					l1.setText(res.toString());
				}
				else if(op1.equals("/"))
				{
					Integer res=n1/n2;
					l1.setText(res.toString());
				}
			}
		});
		f.add(b1);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}