import javax.swing.*;
import java.awt.event.*;
class TEXT implements ActionListener
{
JFrame jfrm;
JButton jb1,jb2,jb3,jb4;
JTextField jtx1,jtx2,jtx3;
	float a,b,c;
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(
				new Runnable()
				{
					public void run()
					{
						TEXT T=new TEXT();
						T.create();
					}
				
				}
		);
	
	}
public void create()
{	
	jfrm = new JFrame(".........database........");
		jfrm.setSize(1600,1600);
		jfrm.setVisible(true);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setLayout(null);
		
	JPanel panel=new JPanel();
	panel.setBounds(0,0,1500,1500);
	jfrm.add(panel);
	panel.setLayout(null);
	jtx1=new JTextField("0");
	jtx1.setBounds(100,10,150,30);
	panel.add(jtx1);
	jtx2=new JTextField("0");
	jtx2.setBounds(100,60,150,30);
	panel.add(jtx2);
	jtx3=new JTextField("ENTER FIRST NUMBER");
	jtx3.setBounds(400,300,150,30);
	panel.add(jtx3);
	jb1=new JButton("ADD");
	jb1.setBounds(100,100,70,30);
	panel.add(jb1);
	jb2=new JButton("SUB");
	jb2.setBounds(200,100,70,30);
	panel.add(jb2);
	jb3=new JButton("MUL");
	jb3.setBounds(300,100,70,30);
	panel.add(jb3);
	jb4=new JButton("DIV");
	jb4.setBounds(400,100,70,30);
	panel.add(jb4);
	 a=Integer.parseInt(jtx1.getText());
		  b=Integer.parseInt(jtx2.getText());
	
	System.out.println(a);
	System.out.println(b);
	
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	jb4.addActionListener(this);
	
	
	
	
	}

	public void actionPerformed(ActionEvent ae)
{		 a=Integer.parseInt(jtx1.getText());
		  b=Integer.parseInt(jtx2.getText());

	String str=ae.getActionCommand();
	System.out.print(str);
	if(str.equals("ADD"))
	{
		c=a+b;
	jtx3.setText(c+" ");
	}
	if(str.equals("SUB"))
	{
		c=a-b;
	jtx3.setText(c+" ");
	
	}
	if(str.equals("MUL"))
	{
		c=a*b;
	jtx3.setText(c+" ");
	
	}
	if(str.equals("DIV"))
	{
		c=a/b;
	jtx3.setText(c+" ");
	
	}
}
	
	


}