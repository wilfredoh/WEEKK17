

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;

public class DrawLine extends JApplet
{
    
  private Random randomNumbers = new Random(); 

	public int segment = 10;

	
	@Override
    public void paint(Graphics g)
    {
       
    	int[] xHValues1 = new int[segment];	
    	int[] yHValues1 = new int[segment];
    	int[] xHValues2 = new int[segment];	
    	int[] yHValues2 = new int[segment];
    	
    	int[] xMValues1 = new int[segment];	
    	int[] yMValues1 = new int[segment];
    	int[] xMValues2 = new int[segment];	
    	int[] yMValues2 = new int[segment];
    	
    	int[] xRValues1 = new int[segment];	
    	int[] yRValues1 = new int[segment];
    	int[] xRValues2 = new int[segment];	
    	int[] yRValues2 = new int[segment];

    	// create lines humans
    	 for ( int i = 0; i < segment; i++ )
    	 {
    	    // generate random coordinates
    	    int x1 = randomNumbers.nextInt( 500 );
    	    int y1 = randomNumbers.nextInt( 500 );
    	    int x2 = randomNumbers.nextInt( 500 );
    	    int y2 = randomNumbers.nextInt( 500 );
    	    xHValues1[i] = x1;
    	    yHValues1[i] = y1;
    	    xHValues2[i] = x2;
    	    yHValues2[i] = y2;
    	 } // end for
    	 
     	// create lines Monkeys
    	 for ( int i = 0; i < segment; i++ )
    	 {
    	    // generate random coordinates
    	    int x1 = randomNumbers.nextInt( 500 );
    	    int y1 = randomNumbers.nextInt( 500 );
    	    int x2 = randomNumbers.nextInt( 500 );
    	    int y2 = randomNumbers.nextInt( 500 ); 
    	    xMValues1[i] = x1;
    	    yMValues1[i] = y1;
    	    xMValues2[i] = x2;
    	    yMValues2[i] = y2;
    	 } // end for
    	 
      	// create lines Monkeys
     	 for ( int i = 0; i < segment; i++ )
     	 {
     	    // generate random coordinates
     	    int x1 = randomNumbers.nextInt( 500 );
     	    int y1 = randomNumbers.nextInt( 500 );
     	    int x2 = randomNumbers.nextInt( 500);
     	    int y2 = randomNumbers.nextInt( 500 ); 
     	    xRValues1[i] = x1;
     	    yRValues1[i] = y1;
     	    xRValues2[i] = x2;
     	    yRValues2[i] = y2;
     	 } // end for
     	 
	 
    	 
    	  	//
            // Draw Graphics2D draw() method.
    	 for (int i = 0; i < segment-1 ; i++)
    	 {
            //
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(2f));
            
            g2.setColor(Color.RED);
            g2.draw(new Line2D.Double(xHValues1[i],yHValues1[i], xHValues2[i+1], yHValues2[i+1]));
            
            g2.setColor(Color.GREEN);
            g2.draw(new Line2D.Double(xMValues1[i],yMValues1[i], xMValues2[i+1], yMValues2[i+1]));
            
            g2.setColor(Color.BLUE);
            g2.draw(new Line2D.Double(xRValues1[i],yRValues1[i], xRValues2[i+1], yRValues2[i+1]));
    	 }
    	    
    }

}
