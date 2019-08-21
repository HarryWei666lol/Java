package exercises2;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		int i = 0;
		double sum = 0.0;
		while (i < 10000) {
			sum = sum + Math.random();
			i = i + 1;
			
			// let's reduce the output by only saying something every 100 iterations
			if (i % 100 == 1)
				System.out.println("As of " + i + ", our average is " + (sum / i));
		}
		
		
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses? Answer: the average becomes closer to 0.5 as the loop progresses.
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration? Answer: Yes, it is done as shown above.
		//
		
	}

}
