//Marco Van der Merwe - 35314389


import java.util.*;
import static java.lang.Math.*;

public class TestMyArrayList 
{
	public static void main(String[] args) 
	{
		// Create a list of explorer spaceships and fighter spaceships
		MyArrayList<Spaceship> list = new MyArrayList<>();
		
		Fighter_Spaceship FS1 = new Fighter_Spaceship(250000.0, 250.0, "87654321", "1234", 8, 12);
		Fighter_Spaceship FS2 = new Fighter_Spaceship(300000.0, 200.0, "12345678", "4321", 4, 6);
		Fighter_Spaceship FS3 = new Fighter_Spaceship(260000.0, 320.0, "98764321", "1234", 2, 7);
		Fighter_Spaceship FS4 = new Fighter_Spaceship(380000.0, 210.0, "44774321", "2234", 9, 3);
		
		Explorer_Spaceship ES1 = new Explorer_Spaceship(400000.0, 400.0, "08565678", "3321", 1100.00, 3);
		Explorer_Spaceship ES2 = new Explorer_Spaceship(420000.0, 450.0, "00835678", "5321", 1200.00, 3);
		Explorer_Spaceship ES3 = new Explorer_Spaceship(350000.0, 430.0, "12765678", "6321", 1300.00, 2);
		Explorer_Spaceship ES4 = new Explorer_Spaceship(500000.0, 480.0, "32855678", "7721", 1400.00, 4);
		
		
		// Add elements to the list
		list.add(0,FS1);
		list.add(1,FS2);
		list.add(2,FS3);
		list.add(3,FS4); 
		list.add(4,ES1);
		list.add(5,ES2);
		list.add(6,ES3);
		list.add(7,ES4);
		
		//Before sorting
		System.out.println(list);
		
		
		//Skip a line in the output
		System.out.println("\n\n");
		
		
		//After sorting
		list.sortList();
		if (list.sortList())
		{
			System.out.println(list);
		}
	}
}