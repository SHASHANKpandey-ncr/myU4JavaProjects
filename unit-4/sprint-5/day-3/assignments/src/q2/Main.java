package q2;

import java.util.ArrayList;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();

		str.add("one");
		str.add("two");
		str.add("three");
		str.add("four");
		str.add("five");
		str.add("six");
		str.add("seven");
		str.add("eight");
//		str.remove(0);
//		str.set(5, null);
		

		// *********************************************************

		for (int i = 0; i < str.size(); i++) { // using simple for loop
			System.out.println(str.get(i));
		}

		System.out.println();

		// *********************************************************

		for (String s : str) { // using enhanced for loop
			System.out.println(s);
		}

		System.out.println();

		// *********************************************************

		Iterator<String> itr = str.iterator(); // Using Iterator

		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

	}

}


// define and create ArrayList
// traverse (or iterate) by simple&enhanced for loop,Iterator
// <generics> for typeSafe lists
// adding removing & setting values in arrayList
