import javax.swing.*;  
import java.awt.event.*;  

public class swing_combo_9
{  
	public static void main(String[] args) {  


		JFrame f=new JFrame();//creating instance of JFrame  
	          
		JLabel l1=new JLabel();
		l1.setBounds(130,50,100,40);	

		String country[]={"India","Aus","U.S.A","England","Newzealand"};        
		
		JComboBox cb=new JComboBox(country);    
		cb.setBounds(130, 150,100,40);

		JButton b=new JButton("OK");    //creating instance of JButton with image  
		b.setBounds(130,250,100, 40);//x axis, y axis, width, height  
         	b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				String data =  
				(cb.getItemAt(cb.getSelectedIndex())).toString(); 

				l1.setText(data);          	
			}  
    		});  


		f.add(b);//adding button in JFrame
		f.add(cb);
		f.add(l1);

         	f.setSize(1000,1000);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  	