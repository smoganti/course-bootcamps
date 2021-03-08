package assignment3;


public class StackLinkedListMain<E> {

	public static void main(String[] args)
	{
		StackLinkedListImpl<Character> a = new StackLinkedListImpl<Character>();
		
		a.push('a');
		a.push('b');
		a.push('c');
		a.push('d');
		a.push('e');
		a.push('f');
		a.push('g');
		a.push('h');
		a.push('i');
		a.push('j');
		
		System.out.println(a.size());
		a.push('k');
		System.out.println( a.size());
		System.out.println("Deleted "+ a.pop());
		System.out.println("Deleted "+ a.pop());
		System.out.println( a.peek());
		System.out.println( a.size());
	}

}
