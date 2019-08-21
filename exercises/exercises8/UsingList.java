package exercises8;

import java.util.LinkedList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		List<String> eating = new LinkedList<String>();//new ArrayList<String>(); 
		                                              //will produce the same result
		
		// add to the list
		
		eating.add("open mouth");
		eating.add("insert food");
		eating.add("chew");
		eating.add("chew");
		eating.add("swallow");
		
		System.out.println(eating);
		
		// add some more things
		
		eating.add("Digest");
		System.out.println(eating);
		
		// some other things
		
		// this adds the String at location 0, which is the beginning of the list
		eating.add(0, "salivate");
		System.out.println(eating);
		
		// delete something from the list
		eating.remove(2);// the string at the 2nd position is removed
		System.out.println(eating);
		eating.remove("chew");// remove the first "chew" String
		System.out.println(eating);
		
				
				
	

	}

}
