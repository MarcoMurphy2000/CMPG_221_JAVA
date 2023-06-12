//Marco Van der Merwe - 35314389
//Fighter_Spaceship.java: The Fighter_Spaceship class that extends Spaceship

public class Fighter_Spaceship extends Spaceship
{
	//Instance vriables
	private int laserBlasters;
	private int rocketLaunchers;
	
	
	//Default constructor
	public Fighter_Spaceship()
	{
		this(0.0, 0.0, "XXXXXXXX", "XXXX", 2,1);
	}
	
	//Constructor with parameters
	public Fighter_Spaceship(double engineForce, double mass, String shipCode, String pilotNumber, int laserBlasters, int rocketLaunchers)
	{
		super(engineForce, mass, shipCode, pilotNumber);
		setLaserBlasters(laserBlasters);
		setRocketLaunchers(rocketLaunchers);
	}
	
	//Mutators (set methods)
	public void setLaserBlasters(int laserBlasters)
	{
		this.laserBlasters = laserBlasters;
	}
	
	public void setRocketLaunchers(int rocketLaunchers)
	{
		this.rocketLaunchers = rocketLaunchers;
	}
	
	
	//Accessors (get methods)
	public int getLaserBlasters()
	{
		return laserBlasters;
	}
	
	public int getRocketLaunchers()
	{
		return rocketLaunchers;
	}
	
	
	//Use of abstract mehod declared in Spaceship class
	public double MaxAccelaration()
	{
		double Newton = (getMass() * 9.8);
		double resultantForce = (getEngineForce() - Newton);
		//Acceleration = resultant force divided by mass (A = F/M)
		double accelaration = resultantForce/getMass();
		
		//System.out.println(accelaration);
		return(Math.round(accelaration * 100d)/100d);
	}
	
	//Overwrite toString method from Object cass
	@Override
	public String toString()
	{
		return "Fighter spaceship with " + getLaserBlasters() + " laser blasters and " + getRocketLaunchers() + " rocket launchers";
	}
	
	
	//Just for testing
	public static void main(String[] args)
	{
		Fighter_Spaceship FS1 = new Fighter_Spaceship();
		System.out.println(FS1); //implicit call to toString()
		
		Fighter_Spaceship FS2 = new Fighter_Spaceship(250000.0, 250.0, "12345678", "4321", 4, 6);
		System.out.println(FS2.toString() + "with max acceleration of " + FS2.MaxAccelaration()); //Explicit call to toString()
	}
}
		