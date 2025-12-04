import javax.swing.*;  
import java.awt.event.*;  

public class swing_list_10{  
	public static void main(String[] args) {  


		JFrame f=new JFrame();//creating instance of JFrame  
	          
		JLabel l1=new JLabel();
		l1.setBounds(130,50,800,40);	

		String country[]={"India","Aus","U.S.A","England","Newzealand"}; 
		JList list1 = new JList(country);         
		list1.setBounds(130, 150,100,100);

		JButton b=new JButton("OK");
		b.setBounds(130,250,100, 40);//x axis, y axis, width, height  
         	b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				String str = "";                                 
				int index[]=list1.getSelectedIndices();
				for(int i=0;i<index.length;i++)				{
					str=str+list1.getModel().getElementAt(index[i])+", ";
				}
				l1.setText(str);
			}  
    		});  


		f.add(b);//adding button in JFrame
		f.add(list1);
		f.add(l1);

         	f.setSize(1000,1000);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  	