import javax.swing.*;  

public class swing_menu_11{
	public static void main(String args[])
	{
		JFrame f= new JFrame("Menu and MenuItem Example");  
		//JMenu menu1=new JMenu("Sub Menu");  
	    JMenuItem i1, i2, i3, i4, i5;  
		
		i1=new JMenuItem("Item 1");  
		i2=new JMenuItem("Item 2");  
		i3=new JMenuItem("Item 3");  
		i4=new JMenuItem("Item 4");  
		i5=new JMenuItem("Item 5");  
		
	    JMenu menu=new JMenu("Menu");
		JMenu menu1=new JMenu("Menu1");
		menu.add(i1); menu.add(i2); menu.add(i3);  
		menu1.add(i4); menu1.add(i5);  
		//menu.add(menu1);
		JMenuBar mb=new JMenuBar();  
		mb.add(menu);
		mb.add(menu1);

		f.setJMenuBar(mb);  
	        f.setSize(400,400);  
        	f.setLayout(null);  
		f.setVisible(true);  
		
	}
}