 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;

public class HomeDraw extends Applet implements ActionListener
 {
Button b1,b2;
Label bcolor;
String str;
public void init()
        {
			
            Button b1 = new Button("Red");    
            Button b2= new Button("Blue");
             
            add(b1);                  
            add(b2);
			
            b1.addActionListener(this); 
            b2.addActionListener(this);
			
			
        }
        public void actionPerformed(ActionEvent ae)
        {
			
            str = ae.getActionCommand();
            repaint();      
        }
	 public void paint(Graphics g)
	 {
			
		 Font home=new Font("Century Gothic",Font.BOLD,28);
		 g.setFont(home);
		 g.setColor(Color.blue);
		 int a[]={150,300,200};   
		 int b[]={150,150,50};
		 
		 
		 
		 g.setColor(Color.yellow);
		 g.fillRect(150,150,150,200);
		 		 
		 if(str.equals("Red"))
		 {
		 g.setColor(Color.red);
		 g.fillRect(190,220,70,130);
		 }
		 
		  if(str.equals("Blue"))
		 {
		 g.setColor(Color.blue);
		 g.fillRect(190,220,70,130);
		 }
		 
		 g.setColor(Color.blue);
		 g.fillPolygon(a,b,3);
	
		 Font f=new Font("Century Gothic",Font.BOLD,20);
		 g.setFont(f);
		 g.setColor(Color.red);
		 
		
		 
	 }
 }