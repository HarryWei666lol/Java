package arrays;
import cse131.ArgsProcessor;

public class Sorting {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("What is the size of number collections?");
		while (size <= 0) {
			size = ap.nextInt("Invalid input! What is the size of number collections?");

		}

		int[] numarr = new int[size];
		System.out.print("Before sorting: ");
		for (int i = 0; i < size; i++) {
			//a way of getting an input from user and put it in an arrqy
			numarr[i] = ap.nextInt("Number in collections? " + "( " + i + "th )");
			System.out.print(numarr[i] + " ");
			
		}
		
		System.out.println();
		//keep track of the number of times the data is scanned
		int sortCount = 0;
		//
		while (sortCount < size) {
			int min = numarr[sortCount];
			
			//an inner loop to iterate over the unsorted portion of the array
			    //each time selecting the minimum value
			for (int i = sortCount; i < size; i++) {
				if (numarr[i] < numarr[sortCount]) {
					//keep track of this value
					int temp = numarr[i];
					numarr[i] = numarr[sortCount];
					numarr[sortCount] = temp;
					
				}
				
			}
			sortCount++;
		}
		
		System.out.print("After sorting: ");
		for (int i = 0; i < size; i++) {
			System.out.print(numarr[i] + " ");
			
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += numarr[i];
			
		}
		System.out.println("Mean: " + (double)sum / size);
		
		double median = 0;
		if (size % 2 == 0) {
			median = (double)(numarr[size / 2 - 1] + numarr[size / 2]) / 2;
			
		}
		else {
			median = numarr[size / 2];
			
		}
		System.out.println("Median: " + median);
		System.out.println("Min: " + numarr[0]);
		System.out.println("Max: " + numarr[size - 1]);
		System.out.println("Range: " + (numarr[size - 1] - numarr[0]));
	}

}

