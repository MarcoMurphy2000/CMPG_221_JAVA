//Marco Van der Merwe - 35314389
//Test program for Spaceship showing implicit and explicit call to toString as well as showing Polymorphism

import java.util.*;
import static java.lang.Math.*;

public class Test_Program
{
	public static void main (String[] args)
	{
		Fighter_Spaceship FS1 = new Fighter_Spaceship(250000.0, 250.0, "87654321", "1234", 8, 12);
		System.out.println("FS1: " + FS1); //implicit call to toString()
		
		Fighter_Spaceship FS2 = new Fighter_Spaceship(300000.0, 200.0, "12345678", "4321", 4, 6);
		System.out.println("FS2: " + FS2.toString()); //Explicit call to toString()
		
		
		//Static binding
		System.out.println("\nStatic binding: ");
		System.out.println("FS1:" + FS1 + " has a engine force of " + FS1.getEngineForce() + " N, and a mass of " + FS1.getMass() + " Kg resulting in a maximum acceleration of: " + FS1.MaxAccelaration() + " meters per second squared");
		System.out.println("FS2:" + FS2 + " has a engine force of " + FS2.getEngineForce() + " N, and a mass of " + FS2.getMass() + " Kg resulting in a maximum acceleration of: " + FS2.MaxAccelaration() + " meters per second squared \n");
		
		
		
		//Polymorphism
		System.out.println("\nPolymorphism: ");
		Spaceship S1 = new Fighter_Spaceship(200000.0, 300.0, "23413256", "4476", 12, 18);
		System.out.println("S1: " + S1 + " has a max acceleration of: " + S1.MaxAccelaration() + " meters per second squared \n");
		
		//Lets create a few spaceships with different specifications to store in an array
		System.out.println("\n\nFew space shuttles created to store in an array: ");
		Fighter_Spaceship FS3 = new Fighter_Spaceship(260000.0, 320.0, "98764321", "1234", 2, 7);
		Fighter_Spaceship FS4 = new Fighter_Spaceship(380000.0, 210.0, "44774321", "2234", 9, 3);
		
		Explorer_Spaceship ES1 = new Explorer_Spaceship(400000.0, 400.0, "08565678", "3321", 1100.00, 3);
		Explorer_Spaceship ES2 = new Explorer_Spaceship(420000.0, 450.0, "00835678", "5321", 1200.00, 3);
		Explorer_Spaceship ES3 = new Explorer_Spaceship(350000.0, 430.0, "12765678", "6321", 1300.00, 2);
		Explorer_Spaceship ES4 = new Explorer_Spaceship(500000.0, 480.0, "32855678", "7721", 1400.00, 4);

		
		//Array of Spaceship objects
		Spaceship shuttles[] = new Spaceship[8];
		shuttles[0] = FS1;
		shuttles[1] = FS2;
		shuttles[2] = FS3;
		shuttles[3] = FS4;
		shuttles[4] = ES1;
		shuttles[5] = ES2;
		shuttles[6] = ES3;
		shuttles[7] = ES4;
		for(int i =0; i<8; i++)
		{
			System.out.println("\n shuttles[" + i + "]: " + shuttles[i] + " with maximum acceleration: " + shuttles[i].MaxAccelaration() + " meters per second squared");
		}
		
		
		//Lets use an interface to get some values for our shuttles
		Scanner input = new Scanner(System.in);
		
		int shuttle;
		double engineForce;
		double mass;
		
		int laserBlasters;
		int rocketLaunchers;
		
		double fualCapacity;
		int scanners;
					
		
		boolean inputInvalid;
		inputInvalid = true;
		while (inputInvalid)
		{
			try
			{
				System.out.print("\nChoose a spaceship (1 for Fighter/2 for Explorer): ");
				shuttle = input.nextInt();
				input.nextLine(); //Consume newline left-over
				if(shuttle == 1)
				{
					System.out.print("\nEnter engine force in Newton: ");
					//engineForce = Integer.parseInt(input.nextLine());
					engineForce = input.nextDouble();
					
					System.out.print("\nEnter shuttle mass in Kg: ");
					mass = input.nextDouble();
					input.nextLine(); //Consume newline left-over
					
					System.out.print("\nEnter ship code (8 characters): ");
					String shipCode = input.nextLine();
					
					System.out.print("\nEnter pilot number (4 characters): ");
					String pilotNumber = input.nextLine();
					
					System.out.print("\nEnter laser blaster amount: ");
					laserBlasters = input.nextInt();
					
					System.out.print("\nEnter rocket launcher amount: ");
					rocketLaunchers = input.nextInt();
					
					Fighter_Spaceship FS5 = new Fighter_Spaceship(engineForce, mass, shipCode, pilotNumber, laserBlasters, rocketLaunchers);
					System.out.println("\nFS5:" + FS5 + " with maximum acceleration: " + FS5.MaxAccelaration() + " meters per second squared \n");
					
					inputInvalid = false;
				}
				else if(shuttle == 2)
				{
					System.out.print("\nEnter engine force in Newton: ");
					engineForce = input.nextDouble();
					
					System.out.print("\nEnter shuttle mass in Kg: ");
					mass = input.nextDouble();
					input.nextLine(); //Consume newline left-over
					
					System.out.print("\nEnter ship code (8 characters): ");
					String shipCode = input.nextLine();
					
					System.out.print("\nEnter pilot number (4 characters): ");
					String pilotNumber = input.nextLine();
					
					System.out.print("\nEnter fual capacity in leters: ");
					fualCapacity = input.nextDouble();
					
					System.out.print("\nEnter scanner amount: ");
					scanners = input.nextInt();
					
					Explorer_Spaceship ES5 = new Explorer_Spaceship(engineForce, mass, shipCode, pilotNumber, fualCapacity, scanners);
					System.out.println("\nES5:" + ES5 + " has a maximum acceleration of: " + ES5.MaxAccelaration() + " meters per second squared. The ship code is " + shipCode + ", and the assigned pilots number is " + pilotNumber + "\n");
					
					inputInvalid = false;
				}
				else
				{
					System.out.println("Please enter either 1 for Fighter or 2 for Explorer");
					inputInvalid = true;
				}
			}
			catch(ArithmeticException ae)
			{
				System.out.println("The following exception was thrown:\n"+ae);
			}
			catch(Exception e)
			{
				System.out.println("For some reason the following exception was thrown:\n"+e);
			}
		}
		System.out.println("\nThe program terminated normally");
	}
}
		
		
		