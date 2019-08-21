package lab7;

public class Student {
	private String firstName, surName;
	private int studentID, credits;
	private double GPA;
	
	/**
	 * constructor
	 * @param firstName first name of a student
	 * @param surName surname of a student
	 * @param studentID all digits of a student's ID number
	 */

	public Student(String firstName, String surName, int studentID) {
		
		this.firstName = firstName;
		this.surName = surName;
		this.studentID = studentID;
		this.credits = 0;
		this.GPA = 0.0;

	}
	/**
	 * getter
	 * @return student's name in full and in right order
	 */
	
	public String getName() {
		return this.firstName + " " + this.surName;
	}
	/**
	 * getter
	 * @return student's ID number
	 */
	
	public int getStudentID() {
		return this.studentID;
	}
	/**
	 * getter
	 * @return the total number of credits obtained by the student
	 */

	public int getCredits() {
		return this.credits;
	}
	/**
	 * getter
	 * @return student's average GPA
	 */


	public double getGPA() {
		return this.GPA;
	}
	/**
	 * setter
	 * @param yourCredits the new number of credits
	 */

	public void setCredits(int yourCredits) { // void method cannot return anything => no "return" used
		this.credits = yourCredits;
	}
	/**
	 * setter
	 * @param yourGPA the new average GPA from all courses
	 */

	public void setGPA(double yourGPA) {
		this.GPA = yourGPA;
	}
	/**
	 * method
	 * @return indicating the student's year in college(in string)
	 */
	
	public String getClassStanding() {
		if(this.credits  < 30) {
			return "FirstYear";
		}
		else if(this.credits < 60) {
			return "Sophomore";
		}
		else if(this.credits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}	
	}
	/**
	 * method 
	 * @return toString
	 */ 
	
	public String toString() {
		return this.firstName +" " + this.surName + " " + this.studentID;
	}
	/**
	 * method
	 * @param grades a new and different course grade
	 * @param credits the number of credits for this new course
	 */
	
	public void submitGrade(double grades, int credits) {
		double totalGrades = this.credits * this.GPA + grades * credits ;// this.credits* this.GPA collects the total quality score obtained 
		                                                                    //after the last time this method is called to calculate GPA
		this.credits += credits; // same as this.credits = this.credits + credits(自增)
		this.GPA = ((double)(Math.round(1000.0 * (totalGrades / this.credits)))/1000);
	}
	/**
	 * method
	 * @param otherParents another student with name, GPA, ID and credits
	 * @return their child with name, ID, GPA and credits
	 */
	
	public Student createLegacy(Student otherParents) {
		Student child = new Student(this.getName(), otherParents.getName(), this.getStudentID() + otherParents.getStudentID());
		child.setGPA((double)(this.getGPA() + otherParents.getGPA()) / 2);
		child.setCredits(Math.max(this.getCredits(), otherParents.getCredits()));
		return child;
	}
	
}
