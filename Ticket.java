import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
public class Ticket extends JFrame implements ActionListener
{
	protected static final String None = null;
	public String from,to,adult,child,cls,type;
	
	JLabel ch1;
	JButton b3,b2,b1,bu,b4;
	//public int p=0;
	JComboBox cb1,cb2;
	JTextField t1,t3,t2,t4,t10,t5,t6,t7,t8,t9;
    PrintWriter fr = null;
    JRadioButton rb1,rb2,rb3,rb4;
    ButtonGroup G1,G2; 
    Ticket()
	{
	
			//JFrame jf = new JFrame("Train ticket generation system");
			JPanel p = new JPanel();
			JPanel p1 = new JPanel();
			String n[]={"0","1","2","3","4","5","6"};   
			String s[]={"Lingampally","HI-tech City","Kacheguda","Begumpet"};   
			JButton bu = new JButton("GENERATE TICKET");
			JButton b1 = new JButton("RESET");
			JButton b2 = new JButton("EXIT");
			JButton b3 = new JButton("Print Ticket");
			JButton b4 = new JButton("Total");
			JTextField t1 = new JTextField();//class
			JTextField t2 = new JTextField();//type
			JTextField t3 = new JTextField();//type
			JTextField t4 = new JTextField();//child
			JTextField t5 = new JTextField();//train no.
			JTextField t6 = new JTextField();//from
			JTextField t7 = new JTextField();//to
			JTextField t8 = new JTextField();//date
			JTextField t9 = new JTextField();//time
			JTextField t10 = new JTextField();//total
			JLabel l1 = new JLabel("TRAIN TICKET GENERATION SYSTEM");
			JLabel ch = new JLabel("CHECK TICKET DETAILS");
			JLabel ch1 = new JLabel();
			JLabel l2 = new JLabel("CLASS");
			JLabel l3 = new JLabel("TICKET TYPE");
			JLabel l4 = new JLabel("ADULT");
			JLabel l5 = new JLabel("CHILD");
			JLabel l6 = new JLabel("From : -");
			JLabel l7 = new JLabel("To : -");
			JLabel l8 = new JLabel("CLASS");
			JLabel l9 = new JLabel("TICKET TYPE");
			JLabel l10 = new JLabel("ADULT");
			JLabel l11 = new JLabel("CHILD");
			JLabel l12 = new JLabel("From : -");
		
			JLabel l13 = new JLabel("To : -");
			JLabel l14 = new JLabel("Ticket no.");
			JLabel l15 = new JLabel("Date");
			JLabel l16 = new JLabel("Time");
			JLabel l17 = new JLabel("Total Payable Amount(in Rs.)");
			JComboBox cb1 = new JComboBox(n);    
			JComboBox cb2 = new JComboBox(n);    
			JComboBox cb3 = new JComboBox(s);    
			JComboBox cb4 = new JComboBox(s);    
			
			G1 = new ButtonGroup(); 
			G2 = new ButtonGroup(); 
			 rb1 = new JRadioButton("FIRST CLASS");
			 rb2 = new JRadioButton("GENERAL");
			 rb3 = new JRadioButton("SINGLE");
			 rb4 = new JRadioButton("RETURN");
			 G1.add(rb1);
			 G1.add(rb2);
			 G2.add(rb3);
			 G2.add(rb4);
			//p1.setVisible(false);
			jf.getContentPane().add(p);
			jf.getContentPane().add(p1);;
			p.add(l1);
			p.add(l2);
			p.add(l3);
			p.add(l4);
			p.add(l5);
			p.add(l6);
			p.add(l7);
			p.add(rb1);
			p.add(rb2);
			p.add(rb3);
			p.add(rb4);
			p.add(cb1);
			p.add(cb2);
			p.add(cb3);
			p.add(cb4);
			p1.add(l14);
			p1.add(l8);
			p1.add(l9);
			p1.add(l10);
			p1.add(l11);
			p1.add(l12);
			p1.add(l13);
			p1.add(l14);
			p1.add(l15);
			p1.add(l16);
			p1.add(l17);
			p1.add(t1);
			p1.add(t2);
			p1.add(t3);
			p1.add(t4);
			p1.add(t5);
			p1.add(t6);
			p1.add(t7);
			p1.add(t8);
			p1.add(t9);
			p1.add(t10);
			p1.add(ch);
			p1.add(ch1);
			p1.add(b1);
			p1.add(b2);
			p1.add(b3);
			p1.add(b4);
			p.add(bu);
			jf.setResizable(false);
			p.setBounds(0,0,1920,500);
			p1.setBounds(0,510,1920,500);
			jf.setSize(2100,1100);
			bu.setBounds(100,450,400,40);
			ch.setBounds(700,40,1000,40);
			ch1.setBounds(650,40,1000,40);
			l1.setBounds(550,50,1000,40);
		    l2.setBounds(100,150,500,40);
		    l3.setBounds(500,150,500,40);
		    l4.setBounds(1150,150,500,40);
		    l5.setBounds(1500,150,500,40);
		    l6.setBounds(100,400,400,40);
		    l7.setBounds(1100,400,500,40);
		    l8.setBounds(100,90,500,40);
		    l9.setBounds(500,90,500,40);
		    l10.setBounds(1150,90,500,40);
		    l11.setBounds(1500,90,500,40);
		    t1.setBounds(100,120,200,40);
		    t2.setBounds(500,120,200,40);
		    t3.setBounds(1150,120,200,40);
		    t4.setBounds(1500,120,200,40);
		    t5.setBounds(220,50,200,40);
		    l14.setBounds(100,50,1000,40);
		    rb1.setBounds(100,200,200,40);
		    rb2.setBounds(100,250,200,40);
		    rb3.setBounds(500,200,200,40);
		    rb4.setBounds(500,250,200,40);
		    cb1.setBounds(1150,200,200,40);
		    cb2.setBounds(1500,200,200,40);
		    cb3.setBounds(500,400,400,40);
		    cb4.setBounds(1300,400,400,40);
		    l12.setBounds(100,160,200,40);
		    l13.setBounds(500,160,200,40);
		    l15.setBounds(1150,160,200,40);
		    l16.setBounds(1500,160,200,40);
		    l17.setBounds(100,300,700,40);
		    t9.setBounds(100,190,200,40);
		    t6.setBounds(500,190,200,40);
		    t7.setBounds(1150,190,200,40);
		    t8.setBounds(1500,190,200,40);
		    t10.setBounds(100,350,700,40);
		    b1.setBounds(900,350,250,40);
		    b2.setBounds(1200,350,200,40);
		    b4.setBounds(1200,250,200,40);
		    b3.setBounds(1450,350,400,40);
		    Font f = new Font("Verdana",Font.BOLD,20);
		    rb1.setFont(f);
		    rb2.setFont(f);
		    rb3.setFont(f);
		    rb4.setFont(f);
		    cb1.setFont(f);
		    cb2.setFont(f);
		    cb3.setFont(f);
		    cb4.setFont(f);
		    t1.setFont(f);
		    t2.setFont(f);
		    t3.setFont(f);
		    t4.setFont(f);
		    t5.setFont(f);
		    t6.setFont(f);
		    t7.setFont(f);
		    t8.setFont(f);
		    t9.setFont(f);
		    t10.setFont(f);
		    rb1.setForeground(Color.DARK_GRAY);
		    rb2.setForeground(Color.DARK_GRAY);
		    rb3.setForeground(Color.DARK_GRAY);
		    b4.setForeground(Color.DARK_GRAY);
		    cb1.setForeground(Color.DARK_GRAY);
		    cb2.setForeground(Color.DARK_GRAY);
		    cb3.setForeground(Color.DARK_GRAY);
		    cb4.setForeground(Color.DARK_GRAY);
		    t1.setForeground(Color.DARK_GRAY);
		    t2.setForeground(Color.DARK_GRAY);
		    t3.setForeground(Color.DARK_GRAY);
		    t4.setForeground(Color.DARK_GRAY);
		    t5.setForeground(Color.DARK_GRAY);
		    t6.setForeground(Color.DARK_GRAY);
		    t7.setForeground(Color.DARK_GRAY);
		    t8.setForeground(Color.DARK_GRAY);
		    t9.setForeground(Color.DARK_GRAY);
		    t10.setForeground(Color.DARK_GRAY);
		    
		    l17.setFont(new Font("Courier New", Font.BOLD,40));
		    bu.setFont(new Font("Courier New", Font.BOLD, 40));
		    b1.setFont(new Font("Courier New", Font.BOLD, 40));
		    b2.setFont(new Font("Courier New", Font.BOLD, 40));
		    b3.setFont(new Font("Courier New", Font.BOLD, 40));
		    b4.setFont(new Font("Courier New", Font.BOLD, 40));
		    l1.setFont(new Font("Courier New", Font.BOLD, 50));
		    l2.setFont(new Font("Courier New", Font.BOLD,40));
		    l3.setFont(new Font("Courier New", Font.BOLD,40));
		    l4.setFont(new Font("Courier New", Font.BOLD,40));
		    l5.setFont(new Font("Courier New", Font.BOLD,40));
		    ch.setFont(new Font("Courier New", Font.BOLD,30));
		    ch1.setFont(new Font("Courier New", Font.BOLD,40));
		    l6.setFont(new Font("Courier New", Font.BOLD,40));
		    l7.setFont(new Font("Courier New", Font.BOLD,40));
		    l14.setFont(new Font("Courier New", Font.BOLD,20));
		    rb1.setFont(new Font("Courier New", Font.BOLD,20));
		    rb2.setFont(new Font("Courier New", Font.BOLD,20));
		    rb3.setFont(new Font("Courier New", Font.BOLD,20));
		    rb4.setFont(new Font("Courier New", Font.BOLD,20));
		    l8.setFont(new Font("Courier New", Font.BOLD,20));
		    l9.setFont(new Font("Courier New", Font.BOLD,20));
		    l10.setFont(new Font("Courier New", Font.BOLD,20));
		    l11.setFont(new Font("Courier New", Font.BOLD,20));
		    l12.setFont(new Font("Courier New", Font.BOLD,20));
		    l13.setFont(new Font("Courier New", Font.BOLD,20));
		    l15.setFont(new Font("Courier New", Font.BOLD,20));
		    
		    jf.setLayout(null);
			p.setLayout(null);
			p1.setLayout(null);
		    
		    p1.setBackground(Color.GRAY);
		    p.setBackground(Color.GRAY);
		    l16.setFont(new Font("Courier New", Font.BOLD,20));
		    ch.setForeground(Color.WHITE);
		    ch1.setForeground(Color.RED);
		    bu.setForeground(Color.RED);
		    b1.setForeground(Color.RED);
		    b2.setForeground(Color.RED);
		    b3.setForeground(Color.RED);
		    b4.setForeground(Color.RED);
		    l1.setForeground(Color.WHITE);
		    l2.setForeground(Color.WHITE);
		    l3.setForeground(Color.WHITE);
		    l4.setForeground(Color.WHITE);
		    l5.setForeground(Color.WHITE);
		    l6.setForeground(Color.WHITE);
		    l7.setForeground(Color.WHITE);
		    l8.setForeground(Color.WHITE);
		    l9.setForeground(Color.WHITE);
		    l10.setForeground(Color.WHITE);
		    l11.setForeground(Color.WHITE);
		    l12.setForeground(Color.WHITE);
		    l13.setForeground(Color.WHITE);
		    l14.setForeground(Color.WHITE);
		    l15.setForeground(Color.WHITE);
		    l16.setForeground(Color.WHITE);
		    l17.setForeground(Color.WHITE);
		    rb1.setForeground(Color.DARK_GRAY);
		    rb2.setForeground(Color.DARK_GRAY);
		    rb3.setForeground(Color.DARK_GRAY);
		    rb4.setForeground(Color.DARK_GRAY);
		    ch1.setVisible(true);
			jf.setVisible(true);
			jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
			
    bu.addActionListener(new ActionListener()
    {  
        public void actionPerformed(ActionEvent e)
        {    
        	if(e.getSource() == bu)
        	{
        		 SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        		  // SimpleDateFormat t = new SimpleDateFormat("HH:mm:ss");
        		   Date date = new Date();
        		   String strDateFormat = "HH:mm:ss a";
        		    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        		    System.out.println(sdf.format(date));
        		   String str1 = d.format(date);
        		   String str2 = sdf.format(date);
        		   Random rand = new Random(); 
        	        int rand_int1 = rand.nextInt(942412449);
        	        String str3 = Integer.toString(rand_int1); 
        	       // System.out.println("Random Integers: "+rand_int1); 
        		  
        		   t7.setText(str1);  
        		   t8.setText(str2);  
        		   t5.setText(str3);
        		
        	}
        	if((rb1.isSelected()==false)&&(rb2.isSelected()==false))
        	{
        		JOptionPane.showMessageDialog(null,"PLEASE SELECT THE CLASS");
        		t1.setText(null);
    			t2.setText(null);
    			t3.setText(null);
    			t4.setText(null);
    			t5.setText(null);
    			t6.setText(null);
    			t7.setText(null);
    			t8.setText(null);
    			t9.setText(null);
    			t10.setText(null);
        	}
        	if((rb3.isSelected()==false)&&(rb4.isSelected()==false))
        	{
        		JOptionPane.showMessageDialog(null,"PLEASE SELECT THE TICKET TYPE");
        		t1.setText(null);
    			t2.setText(null);
    			t3.setText(null);
    			t4.setText(null);
    			t5.setText(null);
    			t6.setText(null);
    			t7.setText(null);
    			t8.setText(null);
    			t9.setText(null);
    			t10.setText(null);
        	}
        	if(rb1.isSelected())
        	{   
        		String str ="FIRST CLASS";
    			t1.setText(str);
    			cls = str;
    			
        	}    
        	if(rb2.isSelected())
        	{    
        		String str ="GENERAL";   
    			t1.setText(str);
    			cls = str;
        	}    
        	if(rb4.isSelected())
        	{   
        		String str ="RETURN"; 
        		t2.setText(str);  
        		type =str;
    			
        	}    
        	if(rb3.isSelected())
        	{    
        		String str ="SINGLE";
        		t2.setText(str);
        		type = str;
        	}   
        	if(e.getSource() == bu)
        	{
        		String v ="0";
        	String data1 = (String) cb1.getItemAt(cb1.getSelectedIndex());  
        		t3.setText(data1);  	
        	String data2 = (String) cb2.getItemAt(cb2.getSelectedIndex()); 
            	t4.setText(data2);
            	adult = data1;
            	child = data2;
            	if((data1 ==v)&&(data2 == v))
            	{
            		JOptionPane.showMessageDialog(null,"PLEASE SELECT At least 1 Person");
            		t1.setText(null);
        			t2.setText(null);
        			t3.setText(null);
        			t4.setText(null);
        			t5.setText(null);
        			t6.setText(null);
        			t7.setText(null);
        			t8.setText(null);
        			t9.setText(null);
        			t10.setText(null);
            	
            	}
        	}
        	
        	if(e.getSource() == bu)
        	{
        	String data1 = (String) cb3.getItemAt(cb3.getSelectedIndex());  
        		t9.setText(data1);
        	String data2 = (String) cb4.getItemAt(cb4.getSelectedIndex());  
        		t6.setText(data2); 
        		from = data1;
            	to = data2;
        		if(data1 == data2 )
            	{
            		JOptionPane.showMessageDialog(null,"YOU CAN'T SELECT SAME STATION");
            		t1.setText(null);
        			t2.setText(null);
        			t3.setText(null);
        			t4.setText(null);
        			t5.setText(null);
        			t6.setText(null);
        			t7.setText(null);
        			t8.setText(null);
        			t9.setText(null);
        			t10.setText(null);
            	}
        	}
        	t1.setEditable(false);
        	t2.setEditable(false);
        	t3.setEditable(false);
        	t4.setEditable(false);
        	t5.setEditable(false);
        	t6.setEditable(false);
        	t7.setEditable(false);
        	t8.setEditable(false);
        	t9.setEditable(false);
        	t10.setEditable(false);
        	
        }  
        
});          
 
    b2.addActionListener(new ActionListener()
    {  
        public void actionPerformed(ActionEvent e)
        {    
        	if(e.getSource() == b2)
    		{
        		JDialog.setDefaultLookAndFeelDecorated(true);
        	    int response = JOptionPane.showConfirmDialog(null, "Do you want to Exit", "Confirm",
        	        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	    if (response == JOptionPane.NO_OPTION)
        	    {
        	      //System.out.println("No button clicked");
        	    } else if (response == JOptionPane.YES_OPTION)
        	    {
        	    //  System.out.println("Yes button clicked");
        	      System.exit(0);
        	    } 
        	    
        	    else if (response == JOptionPane.CLOSED_OPTION) 
        	    {
        	      System.out.println("JOptionPane closed");
        	    }
    		}
        }  
}); 
 
    b1.addActionListener(new ActionListener()
    {  
        public void actionPerformed(ActionEvent e)
        {    
        	if(e.getSource() == b1)
    		{
        		t1.setEditable(true);
    			t2.setEditable(true);
    			t3.setEditable(true);
    			t4.setEditable(true);
    			t5.setEditable(true);
    			t6.setEditable(true);
    			t7.setEditable(true);
    			t8.setEditable(true);
    			t9.setEditable(true);
    			t10.setEditable(true);
        		t1.setText(null);
    			t2.setText(null);
    			t3.setText(null);
    			t4.setText(null);
    			t5.setText(null);
    			t6.setText(null);
    			t7.setText(null);
    			t8.setText(null);
    			t9.setText(null);
    			t10.setText(null);
    			t1.setEditable(false);
            	t2.setEditable(false);
            	t3.setEditable(false);
            	t4.setEditable(false);
            	t5.setEditable(false);
            	t6.setEditable(false);
            	t7.setEditable(false);
            	t8.setEditable(false);
            	t9.setEditable(false);
            	t10.setEditable(false);
    			
    		}
        }  
}); 
   
    b4.addActionListener(new ActionListener()//// Total Amount Calculator
    {  
        public void actionPerformed(ActionEvent e)
        {   
        	
        	if((t1.getText()==null)||(t2.getText()==null)||(t3.getText()==null)||(t4.getText()==null)||(t6.getText()==null)||(t7.getText()==null)||(t8.getText()==null)||(t9.getText()==null)||(t1.getText()==null))
        	{
        	JOptionPane.showMessageDialog(null,"Please fill all the Details");
        	t10.setText(null);
        	}
        	int p = 0;
        	String  cfc = "FIRST CLASS";
            String  cgn = "GENERAL";
            String  tsn = "SINGLE";
            String  trt ="RETURN";
        	String  l = "Lingampally";
        	String  h = "HI-tech City";
        	String  k = "Kacheguda";
        	String  b = "Begumpet";
            if(e.getSource() == b4)
    		{
        		if(from == l ) {
        	        switch(to) 
        	        { 
        	            case "HI-tech City": 
        	            	p= 10;
        	              //  System.out.println("one"); 
        	                break; 
        	            case "Kacheguda": 
        	              //  System.out.println("two"); 
        	            	p= 30;
        	                break; 
        	            case "Begumpet": 
        	                System.out.println("three"); 
        	                p= 20;
        	                break; 
        	            default: 
        	                System.out.println("no match"); 
        	        } 
        		}
        		if(from == h ) {
        	        switch(to) 
        	        { 
        	            case "Lingampally": 
        	            	p= 10;
        	              //  System.out.println("one"); 
        	                break; 
        	            case "Kacheguda": 
        	              //  System.out.println("two"); 
        	            	p= 20;
        	                break; 
        	            case "Begumpet": 
        	                System.out.println("three"); 
        	                p= 10;
        	                break; 
        	            default: 
        	                System.out.println("no match"); 
        	        } 
        		}
        		if(from == k ) {
        	        switch(to) 
        	        { 
        	            case "HI-tech City": 
        	            	  p= 20;
        	              //  System.out.println("one"); 
        	                break; 
        	            case "Lingampally": 
        	              //  System.out.println("two"); 
        	            	p= 30;
        	                break; 
        	            case "Begumpet": 
        	                System.out.println("three"); 
        	                p= 10;
        	                break; 
        	            default: 
        	                System.out.println("no match"); 
        	        } 
        		}
        		if(from == b ) {
        	        switch(to) 
        	        { 
        	            case "HI-tech City": 
        	             	p= 10;
        	              //  System.out.println("one"); 
        	                break; 
        	            case "Kacheguda": 
        	              //  System.out.println("two"); 
        	            	p= 10;
        	                break; 
        	            case "Lingampally": 
        	              //  System.out.println("three"); 
        	                p= 20;
        	                break; 
        	            default: 
        	               // System.out.println("no match"); 
        	        } 
        		}
        	/*	String from,to,adult,child,cls,type;
        		String  cfc = "FIRST CLASS";
                String  cgn = "GENERAL";
                String  tsn = "SINGLE";
                String  trt ="RETURN";*/
        		int c = Integer.parseInt(child);
        		int a = Integer.parseInt(adult);
        		System.out.println("Child :"+c); 
        		System.out.println("Adult :"+a); 
        		System.out.println("price :"+p); 
        		int total = 0;
                int fc = p / 2;
        		int total_single_gen_1a = p;
        		int total_single_gen_1c = p/2;
        		int total_single_fc_1a = p+fc;
        		int total_single_fc_1c = p/2+fc;
        		if(cls == cgn) 
        		{
        			total = total_single_gen_1a*a+total_single_gen_1c*c;
        			if(type==trt)
        			{
        				total= total*2;
        			}
        		}
        		if(cls == cfc) 
        		{
        		total = total_single_fc_1a*a+total_single_fc_1c*c;
        			if(type==trt)
        			{
        				total= total*2;
        			}
        		}
        		 String str4 = Integer.toString(total); 
        		 t10.setText(str4);
    		}
        }  
}); 
    b3.addActionListener(new ActionListener()
    {  
        public void actionPerformed(ActionEvent e)
        {    
        	if((t1.getText()==null)||(t2.getText()==null)||(t3.getText()==null)||(t4.getText()==null)||(t6.getText()==null)||(t7.getText()==null)||(t8.getText()==null)||(t9.getText()==null)||(t1.getText()==null))
        	{
        	JOptionPane.showMessageDialog(null,"Please fill all the Details");
        	t10.setText(null);
        	}
        	if(e.getSource() == b3)
    		{
        		if(e.getSource() == b3) 
        		{
        		String v = "None";
        		if((t3.getText()==v)&&(t4.getText()==v))
            	{
            		JOptionPane.showMessageDialog(null,"PLEASE SELECT At least 1 Person");
            	}
        		}
        		// Accept a string  
        		String str1 = "CLASS : "+t1.getText();
        		String str2 = "Ticket Type :  "+t2.getText();
        		String str3 = "No. of Adult :  "+t3.getText();
        		String str4 = "No. of Child :  "+t4.getText();
        		String str5 = "Ticket No. :  "+t5.getText();
        		String str6 = "To :  "+t6.getText();
        		String str7 = "Date :  "+t7.getText();
        		String str8 = "Time"+t8.getText();
        		String str9 = "From : "+t9.getText();
        		String str10 ="Total Payable Amount : "+t10.getText();
        		String v = "None";
        		if((t3.getText()==v)&&(t4.getText()==v))
            	{
            		JOptionPane.showMessageDialog(null,"PLEASE SELECT At least 1 Person");
            	}
                // attach a file to FileWriter  
                FileWriter fw = null;
                FileWriter fw1 = null;
				try {
					fw = new FileWriter("Generated_ticket_latest.doc");
					fw1 = new FileWriter("Ticket_record.doc",true);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				try {
					String s1 = "\t\t\tWELCOME TO MMTS,Hydrabad\n\n";
					String s = str5+"\t\t"+str10+"\n"+str1+"\t\t"+str2+"\n"+str3+"\t\t"
					+str4+"\n"+str7+"\t\t"+str8+"\n"+str9+"\t\t"+str6+"\n";
					String s2 = str5+"\t\t"+str10+"\n"+str1+"\t\t"+str2+"\n"+str3+"\t\t"
							+str4+"\n"+str7+"\t\t"+str8+"\n"+str9+"\t\t"+str6+"\n\n\n";
					fw.write(s1);
					fw.write(s);
					fw1.write(s2);
				} catch (IOException e2) 
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
                
                System.out.println("Writing successful"); 
                //close the file  
                try {
					fw.close();
					fw1.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
        }  
        
}); 
   
}    
     
	public static void main(String[] args) 
	{
			new Ticket();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
