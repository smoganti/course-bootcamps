package assignment3;


public class ArrayMain {

	public static void main(String[] args) {
		
		StackArrayImpl<Character> c = new StackArrayImpl<Character>(10);
		
		c.push('a');
		c.push('b');
		c.push('c');
		c.push('d');
		c.push('e');
		c.push('f');
		c.push('g');
		c.push('h');
		c.push('i');
		c.push('j');
		
		System.out.println(c.size());
		c.push('k');
		System.out.println( c.size());
		System.out.println("Deleted "+ c.pop());
		System.out.println("Deleted "+ c.pop());
		System.out.println( c.peek());
		System.out.println( c.size());
	}
}


