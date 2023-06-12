//Marco Van der Merwe - 35314389
//Explorer_Spaceship.java: The Explorer_Spaceship class that extends Spaceship

public class Explorer_Spaceship extends Spaceship
{
	//Instance variables
	private double fualCapacity = 0.0;
	private int scanners = 2;
	
	//Default Constructor
	public Explorer_Spaceship()
	{
		//this(0.0, 2);
	}
	
	//Constructor with parameters
	public Explorer_Spaceship(double engineForce, double mass, String shipCode, String pilotNumber, double fualCapacity, int scanners)
	{
		super(engineForce, mass, shipCode, pilotNumber);
		setFualCapacity(fualCapacity);
		setScanners(scanners);
	}
	
	//Mutators (set methods)
	public void setFualCapacity(double fualCapacity)
	{
		this.fualCapacity = fualCapacity;
	}
	
	public void setScanners(int scanners)
	{
		this.scanners = scanners;
	}
	
	
	//Acessors (get methods)
	public double getFualCapacity()
	{
		return fualCapacity;
	}
	
	public int getScanners()
	{
		return scanners;
	}
	
	//Use of abstract mehod declared in Spaceship class
	public double MaxAccelaration()
	{
		//Acceleration = resultant force divided by mass (A = F/M)  NOTE! This prpultion system is not affected by gravity
		double acceleration = getEngineForce()/getMass();
		
		return(Math.round(acceleration * 100d)/100d);
	}
	
	//Overwrite toString method from Object cass
	@Override
	public String toString()
	{
		return "Explorer spaceship with " + getFualCapacity() + " L fual capacity and " + getScanners() + " scanners on board has a max accelaration of: " + MaxAccelaration() + " Newton";
	}
	
	public int compareTo(Spaceship s) 
	{
		if(this.getClass().equals(s.getClass()))
		{
			Explorer_Spaceship EP = (Explorer_Spaceship)s;   
			if (this.MaxAccelaration() == EP.MaxAccelaration())
			{
				return 0;
			}
			else if (this.MaxAccelaration() < EP.MaxAccelaration())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}else
		return this.getClass().getName().compareTo(s.getClass().getName());
    }
	
	
	//Just for testing
	public static void main(String[] args)
	{
		Explorer_Spaceship ES1 = new Explorer_Spaceship();
		System.out.println(ES1); //implicit call to toString()
		
		Explorer_Spaceship ES2 = new Explorer_Spaceship(200000.0, 500.0, "12345678", "4321", 1000.00, 1);
		System.out.println(ES2.toString()); //Explicit call to toString()
	}
}