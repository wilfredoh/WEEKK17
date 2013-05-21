import javax.swing.JOptionPane;


public class bipedHuman extends classAnimal

{   
   public String sound;
	 public String humanName;
	 public String humangender;
	 public int  humanW;
	 
	 // constructor
		public bipedHuman
		(String NameA, String genderA, int ageA, int weigthA, int distanceA )
		{
			super(NameA, ageA,weigthA, distanceA, genderA);
			humanName = NameA; // set the variable unique for human
			humangender = genderA; // set the variable unique for human
			humanW = weigthA;
		} 
	 	 
	// end of constructor 
		
	// Method lift weigth 	
	public void printLift()
		{
		   super.printLift();  // polymorphis  calling the same print method
		     System.out.println(humanName + " belongs yto the SubClass 'HUMAN' with a Weigth " + humanW);
		}

    
    public void  soundtalk()
    {
       super.setTalk( "I AM HUMAN ");
    }
    
    
	
    public void humanGo() 
    {   
          super.walk(3);  
    
    }
}   
