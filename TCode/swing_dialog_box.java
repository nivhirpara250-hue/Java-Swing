import javax.swing.*;  
import java.awt.event.*;  

public class swing_dialog_box{  
	public static void main(String[] args) {  


		JFrame f=new JFrame("example of radio button");//creating instance of JFrame  
	          
		JLabel l1=new JLabel();
		l1.setBounds(50,50,100,40);	

		JButton b1=new JButton("Message Box");
		b1.setBounds(50,50,100,40);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//JOptionPane.showMessageDialog(f,"Message box");
				JOptionPane.showMessageDialog(f,"Message box","Alert",JOptionPane.WARNING_MESSAGE);
			}
		});

		JButton b2=new JButton("Confirm Box");
		b2.setBounds(50,100,100,40);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				 int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
				if(a==JOptionPane.YES_OPTION){  
					JOptionPane.showMessageDialog(f,"Yes is clicked"); 
				}  
				else if(a==JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(f,"No is clicked"); 
				}
			}
		});

		JButton b3=new JButton("Input Box");
		b3.setBounds(50,150,100,40);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String name=JOptionPane.showInputDialog(f,"Enter Name"); 
				JOptionPane.showMessageDialog(f,name); 	
				
			}
		});

		
		f.add(b1);
		f.add(b2);
		f.add(b3);
          
		f.setSize(400,400);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  	