import javax.swing.*;  
import java.awt.event.*;  

public class swing_checkbox_button_7{  
	public static void main(String[] args) {  


		JFrame f=new JFrame();//creating instance of JFrame  
	          
		JLabel l1=new JLabel();
		l1.setBounds(50,50,100,40);	

		JCheckBox c1=new JCheckBox("RED");
		c1.setBounds(50,100,100,40);
		
		JCheckBox c2=new JCheckBox("Yellow");
//		JCheckBox c2=new JCheckBox("Yellow");
		c2.setBounds(50,150,100,40);
		
		JButton b1=new JButton("OK");
		b1.setBounds(50,200,100,40);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str="";
				if(c1.isSelected())
				{
					str=str+c1.getText();
				}
				
				if(c2.isSelected())
				{
					str=str+c2.getText();
				}
				
				l1.setText(str);
			}
		});
		
		f.add(l1);
		f.add(c1);
		f.add(c2);
		f.add(b1);
          
		f.setSize(400,400);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  	