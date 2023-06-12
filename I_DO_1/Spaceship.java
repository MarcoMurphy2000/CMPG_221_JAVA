//Marco Van der Merwe - 35314389

//Scenario:
/* 
Program must assist space station in the year 2070 to keep track of each spaceships specs, such as ship code,
pilot number assigned to each spaveship, spaceship force, spaceship mass, and spaceship maximum acceleration. 
The space station groups their spaceships into two groups: Fighter_Spaceship and Explorer_Spaceship. 

The Fighter_Spaceship uses gravity amplifiers for propultion, which removes the effect of gravity from the spaceship so that it can move much quicker. 
This propultion system is very expensive and thus the explorer spaceship does not make use of it. 
Thus they use different formulas to compute maximum acceleration.
*/


//Spaceship.java: The abstract Spaceship super class

public abstract class Spaceship
{
	//Instance variables
	private double engineForce = 0.0;
	private double mass = 0.0;
	private String shipCode = "XXXXXXXX";
	private String pilotNumber = "XXXX";
	
	//Default constructor
	public Spaceship()
	{
		this(0.0, 0.0, "XXXXXXXX", "XXXX");
	}
	
	//Constructor with parameters
	public Spaceship(double engineForce, double mass, String shipCode, String pilotNumber)
	{
		setEngineForce(engineForce);
		setMass(mass);
		setShipCode(shipCode);
		setPilotNumber(pilotNumber);
	}
	
	//Mutators (set method)
	public void setEngineForce(double engineForce)
	{
		this.engineForce = engineForce;
	}
	
	public void setMass(double mass)
	{
		this.mass = mass;
	}
	
	public void setShipCode(String shipCode)
	{
		this.shipCode = shipCode;
	}
	
	public void setPilotNumber(String pilotNumber)
	{
		this.pilotNumber = pilotNumber;
	}
	
	//Accessors (get methods)
	public double getEngineForce()
	{
		return engineForce;
	}
	
	public double getMass()
	{
		return mass;
	}
	
	public String getShipCode()
	{
		return shipCode;
	}
	
	public String getPilotNumber()
	{
		return pilotNumber;
	}
	
	//Abstract method for MaxAcceleration()
	public abstract double MaxAccelaration();
}
	