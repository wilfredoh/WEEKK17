

public class bipedRobot extends classAnimal

{   
    
    public String sound;
	  public String robotName;
	  public String robotgender;
	  public int  robotW;
	  // constructor
		public bipedRobot
		(String NameA, String genderA,int ageA, int weigthA, int distanceA)
		{
			super(NameA, ageA,weigthA, distanceA, genderA);
			
			robotName = NameA; // set the variable unique for human
            robotgender = genderA;
    		robotW = weigthA;
		} 
	  
		
		// Method lift weigth 	
		public void printLift()
			{
			   super.printLift();  // polymorphis  calling the same print method
			   System.out.println(robotName + " belongs to the SubClass 'ROBOT' with a Weigth " + robotW);
			}
		
	    // 
	    public void  soundtalk()
	    {
	       super.setTalk("I AM A ROBOT");
	    }

	  
	    
	    public void RobotGo() 
	    {   
	     super.walk(1); //   
	    }  
	    
}   
