package sample;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="Sample1" width=500 height=500> </applet>*/
public class Sample1 extends Applet implements ActionListener {
	
	
	
	  /**
	 * 
	 */
	Label l1,l2,l3;
	  TextField t1,t2,t3;
	  Button b1,b2;
	  public void init()
	  {
	      l1=new Label("Enter a value: ");
	      l2=new Label("Enter a value: ");
	      l3=new Label("Result:");
	      t1=new TextField(10);
	      t2=new TextField(10);
	      t3=new TextField(10);
	      b1=new Button("Calculate");
	      b2=new Button("Clear");
	      add(l1);
	      add(t1);
	      
	      add(l2);
	      add(t2);
	     add(l3);
	      
	      add(b1);
	      add(b2);
	      add(t3);
	      b1.addActionListener(this);
	      b2.addActionListener(this);
	  }
	  public void actionPerformed(ActionEvent ae)
	  {
	      int n=Integer.parseInt(t1.getText());
	    int n1=Integer.parseInt(t2.getText());
	      int p;
	      if(ae.getSource()==b1)
	      {
	          p=(int) Math.pow(n, n1);
	     t3.setText(String.valueOf(p));
	      }
	      else if(ae.getSource()==b2)
	      {
	          t1.setText("");
	          t2.setText("");
	        t3.setText("");
	      }
	     
	  }
	}