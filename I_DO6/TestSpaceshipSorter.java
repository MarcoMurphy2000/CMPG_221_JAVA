///CMPG221 - I_DO5 - 35314389

public class TestSpaceshipSorter 
{
	public static void main(String[] args) 
	{
		MyLinkedList<Spaceship> Explorerlist = new MyLinkedList<>();  // This will be the original list or the calling list called by my organiseSpaceships() method.
		MyLinkedList<Spaceship> Fighterlist = new MyLinkedList<>();  // This will be the original list or the calling list called by my organiseSpaceships() method.
		MyLinkedList<Spaceship> list = new MyLinkedList<>();  // This will be the original list or the calling list called by my organiseSpaceships() method.
		
		
		// Try sorting empty list
		System.out.println("\nTry sorting empty list:");
		System.out.println(list.sortSpaceships());
		
		
		
		// Create a list of explorer spaceships and fighter spaceships
		Fighter_Spaceship FS1 = new Fighter_Spaceship(250000.0, 250.0, "FS654321", 8, 12);
		Fighter_Spaceship FS2 = new Fighter_Spaceship(300000.0, 200.0, "FS345678", 4, 6);
		Fighter_Spaceship FS3 = new Fighter_Spaceship(260000.0, 320.0, "FS764321", 2, 7);
		Fighter_Spaceship FS4 = new Fighter_Spaceship(380000.0, 210.0, "FS774321", 9, 3);
		
		Explorer_Spaceship ES1 = new Explorer_Spaceship(400000.0, 400.0, "ES565678", 1100.00, 3);
		Explorer_Spaceship ES2 = new Explorer_Spaceship(420000.0, 450.0, "ES835678", 1200.00, 3);
		Explorer_Spaceship ES3 = new Explorer_Spaceship(350000.0, 430.0, "ES765678", 1300.00, 2);
		Explorer_Spaceship ES4 = new Explorer_Spaceship(500000.0, 480.0, "ES855678", 1400.00, 4);
		
		
		
		// Add Fighter Spaceship elements to the fighter list
		Fighterlist.append(FS1); 
		Fighterlist.append(FS2);
		Fighterlist.append(FS3);
		Fighterlist.append(FS4); 
		
		//Add Explorer Spaceships elements to the explorer lsit
		Explorerlist.append(ES1);
		Explorerlist.append(ES2);
		Explorerlist.append(ES3);
		Explorerlist.append(ES4);
		
		//Add fighter spaceships and explorer spaceships to same listFighterlist.append(FS1); 
		list.append(FS1); 
		list.append(FS2);
		list.append(FS3);
		list.append(FS4); 
		list.append(ES1);
		list.append(ES2);
		list.append(ES3);
		list.append(ES4);
		
    
	
		//implicit call to toString()
		System.out.println("\nFighter list before sorting:");
		System.out.println(Fighterlist);
		
		// List after sorting
		System.out.println("\n\nFighter list after sorting:");
		System.out.println(Fighterlist.sortSpaceships());
		
		
		
		//implicit call to toString()
		System.out.println("\nExplorer list before sorting:");
		System.out.println(Explorerlist);
		
		// List after sorting
		System.out.println("\n\nExplorer list after sorting:");
		System.out.println(Explorerlist.sortSpaceships());
		
		
		
		//implicit call to toString()
		System.out.println("\n\n\nList before sorting:");
		System.out.println(list);
		
		// List after sorting
		System.out.println("\n\nList after sorting:");
		System.out.println(list.sortSpaceships());
	}
}