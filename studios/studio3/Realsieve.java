package studio3;

import cse131.ArgsProcessor;

public class Realsieve {

	public static void main(String[] args) {
		//Prompt the user to enter the size of the array
		ArgsProcessor ap = new ArgsProcessor(args);
		int sizeOfArray = ap.nextInt("What is the size of the array? ");
		//Create an array and fill it with all the numbers
		int[] numbers = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {

			if (i <= sizeOfArray - 2) {
				numbers[i] = i + 2;
			}
			// exit the loop
			else {
				i = sizeOfArray + 2;
			}

//			    i:          0,1,2,3,4,5,6,7, 8,9
//			    numbers[i]: 2,3,4,5,6,7,8,9,10,


		}
		//Get rid of the non-prime numbers
		for (int i = 0; i < sizeOfArray; i++) {
			for(int j = i+1; j< sizeOfArray; j++) {
				if((int)(numbers[j] *1.0 / numbers[i]) == (numbers[j] *1.0 / numbers[i]) ){
					numbers[j] =0;
				}
			}
		}
		System.out.print("Prime numbers under " + sizeOfArray + " are ");
		for (int i = 0; i< sizeOfArray;i++) {
			if (numbers[i] != 0) {
				System.out.print( numbers[i] + "  ");



			}
		}
	}

}