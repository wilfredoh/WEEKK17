//wilfredo henriquwez

import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;



//  This Program test Basic Functions 


public class TestAnimal
{

  public static void main(String[] args) 
	{

		String answerexit="y";
		int answer = 0;
		int n=0;
		
		// creating copies of this sub-classes
		bipedMonkey m = new bipedMonkey("TOTO", "F",  10, 5,   15);     // Name, Gender Age, Weigth, Running distance
		bipedHuman  h = new bipedHuman("PETER", "M",  30, 130, 20);
		bipedRobot  r = new bipedRobot("GIJOE", "M",  2,  0,   5 );  // no Gender on Robot
		
         // ************************************************
		
	       JFrame frame = new JFrame("Draw Line");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JApplet applet = new DrawLine();

		  /* DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		
	do 
		 {	
		    String  entry = JOptionPane.showInputDialog("Enter 1:'TALK',  2: 'WALK', 3:'RUN' , 4:'LIFT' ");
		    if (entry == null) // take care if say cancell because there is an issue here
		        {
		    	n= 1; // i could use System.exit(0) b
	    		JOptionPane.showMessageDialog(null,  "You Cancel the Entry, Run again the Program");
		    	}
		    else 
		       {
		        answer = Integer.parseInt(entry); // convert string to integer
		    	
		    	switch (answer)
		    	  {
		    	  case 1:
		    		// user ="TALK";
		    		{
		    		m.soundtalk();
		    		h.soundtalk();
		    		r.soundtalk();
		    		String  message1 = String.format(" Monkey %s   say         %s \n" +
		    				                         " Person %s   says        %s \n" +
		    				                         " Robot  %s    says        %s  ",
		    				     m.monkeyName, m.getTalk(), h.humanName, h.getTalk(), r.robotName, r.getTalk() ); 
		    		JOptionPane.showMessageDialog(null, message1);
		    		}
		    		break;
		
		    	  case 2:
		    		// user ="WALK";
		    	  	{ 
			    		String  message1 = String.format("Type Walking = %d", answer); 
			    		JOptionPane.showMessageDialog(null, message1);
		    		}
		    		break;
		    	 case 3:
		    		// user ="RUN";
		    		{
		    		String  message1 = String.format("Type Running = %d", answer); 
		    		JOptionPane.showMessageDialog(null, message1);
	    	        frame.getContentPane().add(applet);
	    	        frame.pack();
	    	        frame.setSize(new Dimension(800, 800));
	    	        frame.setVisible(true);

		    		
		    		
		    		}
		    		break;
		    	 case 4:
		    		// user ="LIFT";
		    		{
		    	
		    		h.printLift();
		    		System.out.println();
		    		m.printLift();
		    		System.out.println();
		    		r.printLift();
		    		System.out.println();
		    	    System.out.printf("%s  Lift ..... %s lbs \n" +
		                              "%s Lift ..... %s  lbs\n" +
		                              "%s  Lift ..... %s lbs ", m.monkeyName, m.monkeyW/5, h.humanName, h.humanW/5, r.robotName, r.robotW/5 ); 
			    	}
		    		break;
		    	} // end of Switch
		    
		      } // end of else
		    
		      answerexit = JOptionPane.showInputDialog( null, "Would you like to quit? y/n"); 
			  
		 } while (answerexit.equalsIgnoreCase("n"));
		     // ******** END OF LOOP #1, TERMINATE THE GAME, DO NOT WANT PLAYING ************
			 JOptionPane.showMessageDialog (null, "Goodbye " );	
		
   } // of on Main
}// end of Class 
