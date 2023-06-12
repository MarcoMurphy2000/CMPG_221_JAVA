//CMPG221 - I_DO5 - 35314389

public class MyLinkedList<E>  //The E is the data type of the element.   Linked list class is outer class
{
	//Instance variables
	private Node<E> head, tail;
 
	//Constructor for outer Linked list class
	public MyLinkedList() 
	{
		head = null;
		tail = null;
	}


	/** I_DO4 **/
	public MyLinkedList makePalindrome()
	{
		Node<E> ptr = head;			//By using a pointer, we ensure to leave the original list in tact that uses head to contain the address of its first node. We simply assign our pointer to head and alter our pointer node.
		Node<E>	prevptr = null; 
		Node<E> alterptr = null;
		
		MyLinkedList palindromelist = new MyLinkedList();
		MyLinkedList secondhalf = new MyLinkedList();
		MyLinkedList alterlist = new MyLinkedList();   //We create a alterlist to save the calling list elements because we change them when making our palindrome.
		
		//Get total number of elements in the list
		int count = 0;
		
		if (ptr == null)  //No elements in original list (calling list is empty)
		{
			return null;
		}
		else if (ptr.next == null)  //Only 1 element in list
		{
			palindromelist.append(ptr.element);
			return palindromelist;
		}
		else //2 or more elements in original or calling list
		{
			//Find how many elements there are in the list.
			while (ptr != null)  
			{
				count++;
				ptr = ptr.next;
			}
			ptr = head;  //reset pointer to head of original list
			
			
			
			//Place calling list in palindromelsit to create first part of palindrome to be returned
			while(ptr != null)
			{
				palindromelist.append(ptr.element);
				ptr = ptr.next;
			}
			ptr = head;  //reset pointer to head of original list
			
			
			//Place calling list in alterlist that can be altered to create second part of palindrome to be returned
			while(ptr != null)
			{
				alterlist.append(ptr.element);
				ptr = ptr.next;
			}
			ptr = head;  //reset pointer to head of original list
			
			
			
			//Traverse through calling list and append last element into secondhalf list until first element of calling list is last element in secondhalf list (reverse list).
			alterptr = alterlist.head;
			for (int i = 1; i <= count; i++)  //This for loop executes count times. int i = 1 executes once, then i++ so it becomes 2 and executes another time and then stops by part b of the for loop testing for the false condition.
			{
				while (alterptr.next != null)
				{
					prevptr = alterptr;
					alterptr = alterptr.next;
				}
				secondhalf.append(alterptr.element);
				prevptr.next = null;
				alterptr = alterlist.head;
			}
			
			
			
			//Append secondhalf list to palindromelist to create a palindrome.
			ptr = secondhalf.head;
			while(ptr != null)
			{
				palindromelist.append(ptr.element);
				ptr = ptr.next;
			}
			ptr = head;  //reset pointer to head of original list
			return palindromelist;
		}
	}
	
	
	/** Return the head element in the list */
	public E getFirst() 
	{
		if (head == null) 
		{
			return null;
		}
		else 
		{
			return head.element;
		}
	}

	/** Return the last element in the list */
	public E getLast() 
	{
		if (head==null) 
		{
			return null;
		}
		else 
		{
			return tail.element;
		}
	}

	/** Add an element to the beginning of the list */
	public void prepend(E e) 
	{
		Node<E> newNode = new Node<>(e); // Create a new node
		newNode.next = head; // link the new node with the head
		head = newNode; // head points to the new node 
   
		if (tail == null) // the new node is the only node in list
		{
			tail = head;
		}
	}

	/** Add an element to the end of the list */
	public void append(E item) 
	{
		Node<E> newNode = new Node<>(item); // Create a new node for element E "item". New calls the constructor and also returns the memory address of the new object

		if (head == null) 
		{
			head = tail = newNode; // The new node is the only node in list
		}
		else 
		{
			tail.next = newNode; // Link the new with the last node (We put the new nodes adddress in the previous nodes (tail) next space which was originally zero.)
			tail = newNode; // tail now points to the last node
		}
	}

  
	/** Remove the head node and
	*  return the object that is contained in the removed node. */
	public E removeFirst() 
	{
		if (head == null) 
		{
			return null;
		}
		else 
		{
			E temp = head.element;
			head = head.next;
			if (head == null) 
			{
				tail = null;
			}
			return temp;
		}
	}
	
	public E removeLast()
	{
		if (head == null)
		{
			return null;
		}
		else if (head.next == null)
		{
			E temp = tail.element;
			tail = head = null;
			return temp;
		}
		else
		{
			E temp = tail.element;
			Node<E> ptr = head;
			while (ptr.next.next != null)
			{
				ptr = ptr.next;
			}
			ptr.next = null;
			tail = ptr;
			return temp;
		}
	}
	
	
	public MyLinkedList merge(MyLinkedList paramlist)
	{
		Node<E> ptrThis, ptrParam;
		ptrThis = head;
		ptrParam = paramlist.head;
		MyLinkedList returnlist = new MyLinkedList();
		
		if(head==null)// caling list is empty - set this list to param list
		{
			while(ptrParam != null)
			{
				returnlist.append(ptrParam.element);
				ptrParam = ptrParam.next;
			}
			return returnlist;
			
		}
		
		if(paramlist.head == null)// param list is empty - make no changes
		{
			while(ptrThis != null)
			{
				returnlist.append(ptrThis.element);
				ptrThis = ptrThis.next;
			}
			return returnlist; 
		}
		
		while((ptrThis != null) && (ptrParam != null))// continue up to end of one list
		{
			if (((Comparable)ptrThis.element).compareTo(ptrParam.element)<=0)
			{
				returnlist.append(ptrThis.element);
				ptrThis = ptrThis.next;
			}
			else
			{
				returnlist.append(ptrParam.element);
				ptrParam = ptrParam.next;
			}
		}
		
		if(ptrThis == null)// copy rest of param list
		{
			while(ptrParam != null)
			{
				returnlist.append(ptrParam.element);
				ptrParam = ptrParam.next;
			}
		}
		if(ptrParam == null) // copy rest of calling list
		{
			while(ptrThis != null)
			{
				returnlist.append(ptrThis.element);
				ptrThis = ptrThis.next;
			}
		}
		return returnlist;
	}

 


	public boolean delete(E item)
	{
		Node<E> ptr = head;
		Node<E> prvPtr = null;
		while (ptr!= null&& ((Comparable)ptr.element).compareTo(item)!= 0) //CompareTo() should return a number larger than 0 if the calling object is larger than the parameter Object, equal to 0 if they are equal and smaller than 0 if the parameter object is larger than the calling object.
		{
			prvPtr=ptr;
			ptr=ptr.next;
		}
		if (ptr == null)//item not found
			return false;
		if (ptr==head) // item is first element
			head= head.next;
		else // general case
			prvPtr.next=ptr.next;
		if (ptr==tail)// last element
			tail=prvPtr;
		return true;
	}
 
	public String toString() 
	{
		String result = "[";

		Node<E> ptr = head;
		for (ptr= head;ptr!=null; ptr=ptr.next) 
		{
			result = result +  ptr.element.toString();   //We can omit the toString() method to call it implicitly. But we call the toString explicitly instead.
			if (ptr.next != null)
				result = result + ","; // add commas but not to the final 1   
		}
		result += "]"; // Insert the closing ] in the string
		return result;
	}


	public void clear() 
	{
		head = tail = null;
	}


	private static class Node<E> 
	{
		//Instance variables
		E element;
		Node<E> next;

		//Constructor for inner node class
		public Node(E element) 
		{
			this.element = element;
			next = null;
		}
	}
   
} // end myLinkedList class