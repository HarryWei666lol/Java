package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("What is your name? ");
		double participation = ap.nextDouble("What is the number of participation points you received? ");
		double quiz = ap.nextDouble("What is your average quiz score? ");
	    double studio = ap.nextDouble("What is the number of studio points you received? ");
	    double lab = ap.nextDouble("What is the number of lab points you received? ");
	    double finalProject = ap.nextDouble(" What is your final project's score? ");
	    double extension = ap.nextDouble("What is the number of extension points you received? ");
	    double examOne= ap.nextDouble(" What is your first exam's score? ");
	    double examTwo = ap.nextDouble(" What is your second exam's score? ");
	    double examThree = ap.nextDouble(" What is your third exam's score? ");
	    double examFour = ap.nextDouble(" What is your fourth exam's score? ");
	    double lowerOfExamOneAndExamTwo = Math.min(examOne, examTwo );
	    double lowerOfExamThreeAndExamFour = Math.min(examThree, examFour );
	    double lowestExamScore = Math.min( lowerOfExamOneAndExamTwo, lowerOfExamThreeAndExamFour );
	    double averageExamScore=((examOne + examTwo + examThree + examFour - lowestExamScore) / 3);
	    double totalScore = (quiz * 0.03 + studio * 0.07 + lab * 0.25 + finalProject * 0.07 + extension * 0.25 + averageExamScore * 0.3 + participation * 0.03);
	    int gradeForThisCourse =(int) totalScore;
	    boolean isPlus =(totalScore % 10 >= 7);
	    boolean isMinus = (totalScore % 10 <= 3);
	    System.out.println( name + ": " );
	    System.out.println("\t Total score: " + totalScore );
	    System.out.println("\t Grade for this course: " + gradeForThisCourse );
	    System.out.println("\t Final grade has a... ");
	    System.out.println("\t\t Plus: " + isPlus );
	    System.out.println("\t\t Minus: " + isMinus );
	    
	    
	   
	    
	    
	    

	}

}
