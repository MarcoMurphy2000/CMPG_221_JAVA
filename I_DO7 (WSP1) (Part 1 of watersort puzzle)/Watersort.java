public class Watersort
{
	public static void main(String[] args)
	{
		Character top = null;
		Character red = new Character('r');
		Character blue = new Character('b');
		Character green = new Character('g');
		
		//Create 5 bottles 
		StackAsMyArrayList<Character> bottle1 = new StackAsMyArrayList<Character>(); //bottle is myStack
		StackAsMyArrayList<Character> bottle2 = new StackAsMyArrayList<Character>(); //bottle is myStack
		StackAsMyArrayList<Character> bottle3 = new StackAsMyArrayList<Character>(); //bottle is myStack
		StackAsMyArrayList<Character> bottle4 = new StackAsMyArrayList<Character>(); //bottle is myStack
		StackAsMyArrayList<Character> bottle5 = new StackAsMyArrayList<Character>(); //bottle is myStack
		
		//Store the 5 bottles in a bottles array
		StackAsMyArrayList[] bottles = {bottle1, bottle2, bottle3, bottle4, bottle5};
		
		//Put ink in the bottles (Push character objects onto the stack)
		System.out.println("\nPut ink in the bottles:");
		bottle2.push(red);
		bottle2.push(blue);
		bottle2.push(green);
		bottle2.push(red);
		
		bottle3.push(green);
		bottle3.push(blue);
		bottle3.push(green);
		bottle3.push(red);
		
		bottle4.push(blue);
		bottle4.push(blue);
		
		bottle5.push(red);
		bottle5.push(green);
		//System.out.println(bottle1 +"\n");
		
		//Use a for loop to get the toString value of each bottle
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Bottle " + (i+1) + ": " + bottles[i].toString());
		}
		
		//Test the getStackSize() method 
		System.out.println("\n\nTest getStackSize() method: -------------------------------------------------");
		System.out.println("\ngetStackSize() method of bottle 1:");
		System.out.println(bottle1.getStackSize());
		
		System.out.println("\ngetStackSize() method of bottle 2:");
		System.out.println(bottle2.getStackSize());
		
		System.out.println("\ngetStackSize() method of bottle 5:");
		System.out.println(bottle5.getStackSize());
		
		
		//Test the CheckStackUniform() method
		System.out.println("\n\n\nTest checkStackUniform() method: ------------------------------------------");
		System.out.println("\ncheckStackUniform() method for bottle 1:");
		System.out.println(bottle1.checkStackUniform());
		
		System.out.println("\ncheckStackUniform() method for bottle 2:");
		System.out.println(bottle2.checkStackUniform());
		
		System.out.println("\ncheckStackUniform() method for bottle 4 which has only blue ink:");
		System.out.println(bottle4.checkStackUniform());
		
		
		//Test the peek method
		System.out.println("\n\nTest the peek method for each bottle using a for loop: ----------------------");
		for (int i = 0; i < 5; i++)
		{
			if (bottles[i].peek() == null)
			{
				System.out.println("Bottle " + (i+1) + " is empty");
			}
			else{
				System.out.println("\nTop value of bottle " + (i+1) + ":");
				System.out.println(bottles[i].peek() +"\n");
			}
		}
		
		System.out.println("\nWe show each bottle again just to prove none of the values peeked on have been removed.");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Bottle " + (i+1) + ": " + bottles[i].toString());
		}
		
		
		
		//Test pop method
		System.out.println("\n\nTest the pop method: --------------------------------------------------------");
		System.out.println("\npop method for bottle 1 which is empty:");
		top = (Character) bottle1.pop();
		if (top != null)
			System.out.println("\nTop is: " + top +"\n");
		else
			System.out.println("Empty bottlel");
		System.out.println(bottle1 +"\n");
		
		
		System.out.println("\npop method for bottle 2 which is full:");
		top = (Character) bottle2.pop();
		if (top != null)
			System.out.println("Top is: " + top +"\n");
		else
			System.out.println("Empty bottlel");
		System.out.println(bottle2 +"\n");
		
		
		System.out.println("\npop method for bottle 5 which is halfway full:");
		top = (Character) bottle5.pop();
		if (top != null)
			System.out.println("Top is: " + top +"\n");
		else
			System.out.println("Empty bottlel");
		System.out.println(bottle5 +"\n");
		
		
		//Try to spill ink
		System.out.println("\n\nTry to spill ink by pushing blue ink into bottle 3 which is full: \n\nNote this can be restricted by throwing an index out of bound exception as done below, \nor by simply using an if else statement and printing a line stating that this action could not be done. \nThrowing an exception will stop any further statements from executing.\n");
		bottle3.push(blue);
		
		//Use a for loop to get the toString value of each bottle
		System.out.println("Bottle 3 remains the same because you were not allowed to spill ink");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Bottle " + (i+1) + ": " + bottles[i].toString());
		}
	}
}