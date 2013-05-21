
// wilfredo henriquez, 
// ---- Parent Class==


public class classAnimal
{
  private String animalsound;              //  emcapsulation becuase hidden variable
	private String left, right;
	private int speed ;
	private String name;
	private String gender;
	private int age;
	private int weigth;
	private int distance;
	private int liftratio;

	// ***** constructor of the class Animal  ******
	public classAnimal(String nameA, int ageA, int weigthA, int distanceA, String genderA )
	{
		name = nameA;
		age = ageA;
		weigth = weigthA;
		distance = distanceA;
		gender = genderA;

	}
     // **************************************
	
	
	// ********  method to set the string for talking
	public void setTalk(String sound)
	{
	  animalsound = sound;
	}
	
	// ******   method to get teh string for talkig
	public String getTalk()
	{
	  return  animalsound;
	}
	
	// Method  for printing LIFT
	public void printLift()
	{
     System.out.println("In the 'ANIMAL' Class we have  " + this.name + ", with a Gender = " +
	                    this.gender + "  and  an age of " + this.age + " and run only " + this.distance + " Miles");
	}
	
	
	
	// method to set the speed from walking vs Running
	public void walk( int s)
	{
		speed = 1;
	}
	
	// method to set the speed from running
	public void run()
	{
		speed = 4;
	}
	
	// method  to set direccion for turning 
	public void turn( String L, String R)
	{
		left = L;
		right= R;
	}	
	
} 
