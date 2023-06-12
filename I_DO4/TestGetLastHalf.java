//CMPG221 - I_DO4 - 35314389

public class TestGetLastHalf 
{
	public static void main(String[] args) 
	{
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		// Test empty list
		System.out.println("\nTry to get last half of empty list");
		System.out.println(list);
		System.out.println(list.getLastHalf());
		System.out.println(list);
		
		
		// Test list with only one element.
		list.append(new Integer(1));
		//Because of the list only containing one element we cannot truely get the last half. Because I_Do 4 requested us to keep the extra element of an uneven number of elements, I have decided to return the element if there is only one
		
		System.out.println("\nTry to get last half of list with only one element.  Because I_Do 4 requested us to keep the extra element of an uneven number of elements, I have decided to return the element if there is only one");
		System.out.println(list);
		System.out.println(list.getLastHalf());
		System.out.println(list);
		

		// Add more elements to the list
		list.append(new Integer(2));  //create an object of the Integer type for the constructor of the inner class which receives an E (an abject and not a primative data type).
		list.append(new Integer(3));
		list.append(new Integer(4));
		list.append(new Integer(5)); 
		list.append(new Integer(6));
		list.append(new Integer(7));
		list.append(new Integer(8));
    
	
		//implicit call to toString()
		System.out.println("\nMore elements have been added for testing.");
		System.out.println(list);
		
		
		// Test list with even amount of elements.
		System.out.println("\nTry to get last half of list with even amount of elements");
		System.out.println(list);
		System.out.println(list.getLastHalf());
		System.out.println(list);
		
		
	
		// Test list with uneven amount of elements.
		list.append(new Integer(9));
		System.out.println("\nTry to get last half of list with uneven amount of elements");
		System.out.println(list);
		System.out.println(list.getLastHalf());
		System.out.println(list);
		
		
		
		//Test our remove last element
		System.out.println("\nTest Remove last element method which removes the last element in the list and returns it.");
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}