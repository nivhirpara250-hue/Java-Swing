import javax.swing.*;  
import java.awt.event.*;  

public class swing_radio_button_8{  
	public static void main(String[] args) {  


		JFrame f=new JFrame("example of radio button");//creating instance of JFrame  
	          
		JLabel l1=new JLabel();
		l1.setBounds(50,50,100,40);	

		JRadioButton r1=new JRadioButton("RED");
		r1.setBounds(50,100,100,40);

		JRadioButton r2=new JRadioButton("Yellow");
		r2.setBounds(50,150,100,40);

		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);		

		JButton b=new JButton("OK");    //creating instance of JButton with image  
		b.setBounds(50,200,100, 40);//x axis, y axis, width, height  
         	b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
  				if(r1.isSelected())
				{
					l1.setText(r1.getText()+" Selected");
				}
				if(r2.isSelected())
				{
					l1.setText(r2.getText()+" Selected");
				}
				
        		}  
    		});  


		f.add(b);//adding button in JFrame
		f.add(l1);
		f.add(r1);
		f.add(r2);
          
		f.setSize(400,400);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  	