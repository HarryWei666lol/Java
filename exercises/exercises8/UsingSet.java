package exercises8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		Set<String> eating = new HashSet<String>();

		// add to the list

		eating.add("open mouth");
		eating.add("insert food");
		System.out.println("First add " + eating.add("chew"));
		System.out.println("Second add " + eating.add("chew"));
		eating.add("swallow");

		System.out.println(eating);
		
		eating.remove("digest");
		
		System.out.println("After delete "+ eating);

		

	}

}
