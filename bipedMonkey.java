
// Subclass Bi-Ped Monkey

public class bipedMonkey extends classAnimal

{   
  public String sound;
  public String monkeyName;
	public String monkeygender;
	public int  monkeyW;
	 
	 // constructor
		public bipedMonkey
		(String NameA, String genderA, int ageA, int weigthA, int distanceA )
		{
			super(NameA, ageA, weigthA, distanceA, genderA);
			
			monkeyName = NameA; // set the variable unique for human
            monkeygender = genderA;
    		monkeyW = weigthA;
		} 
	 
	// Method lift weigth 	
	  public void printLift()
			{
			   super.printLift();  // polymorphis  calling the same print method
			   
			   System.out.println(monkeyName + " belongs yto the SubClass 'MONKEY' with a Weigth " + monkeyW);
			
			}
    
    public void  soundtalk()
    {
       super.setTalk( "grrrrraicgrrr");
    }
    
    
    
    public void monkeyGo() 
    {   
     super.walk(2);   
    }  
    
    
}   
