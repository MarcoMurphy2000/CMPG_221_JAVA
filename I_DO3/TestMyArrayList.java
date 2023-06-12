public class TestMyArrayList
{
	public static void main(String[] args)
	{
		/**Create a list of integers. I_Do3 stated that we are to assumne this array that is to be called is already sorted. **/
		MyArrayList<Integer> list = new MyArrayList<>();
		
		list.add(0, new Integer(1));
		list.add(1, new Integer(3));
		list.add(2, new Integer(5));
		list.add(3, new Integer(7));
		list.add(4, new Integer(9));
		
		/**Lets sort this list in case it is not yet in ascending order.**/
		list.sortList();
		System.out.println("List before new object has been added:");
		System.out.println(list);
		
		
		System.out.println("\n\nList after a new integer = 4 has been added:");
		list.insertSorted(new Integer(4));
		System.out.println(list);
		
		
		
		System.out.println("\n\nList after another integer has been added with same value as previously (4):");
		list.insertSorted(new Integer(4));
		System.out.println(list);
	}
}