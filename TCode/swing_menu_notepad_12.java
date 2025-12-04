import javax.swing.*;    
import java.awt.event.*;    

public class swing_menu_notepad_12
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame();    
 
		JMenuItem cut,copy,paste,selectAll,New,print;    
		JTextArea ta=new JTextArea();
		ta.setBounds(5,5,360,320);        

		New=new JMenuItem("New");        
		New.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText("");
			}
		});

		print=new JMenuItem("Print");        
		print.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try
				{
					ta.print();
				}
				catch(Exception e1)
				{
				}
			}
		});		
		cut=new JMenuItem("cut");    
		cut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.cut();
			}
		});
		copy=new JMenuItem("copy");    
		copy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.copy();
			}
		});

		paste=new JMenuItem("paste");    
		paste.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.paste();
			}
		});

		selectAll=new JMenuItem("selectAll");        
		selectAll.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.selectAll();
			}
		});
		
		
		JMenu file,edit,help; 
		file=new JMenu("File");    
		edit=new JMenu("Edit");    
		help=new JMenu("Help");  
		
		file.add(New);file.add(print);
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
		
		JMenuBar mb=new JMenuBar();  		
		mb.add(file);mb.add(edit);mb.add(help);

		//f.add(mb);
		f.add(ta);    
		f.setJMenuBar(mb);  
		f.setLayout(null);    
		f.setSize(400,400);    
		f.setVisible(true);    

	}	
}