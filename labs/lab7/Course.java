package lab7;

public class Course {
	private String name;// course name, not student's name
	private int credits, numSeats, remainingSeats // variable names must be the same as the unit tests'
	;
	private Student [] roster;

	/**
	 * constructor
	 * @param courseName the name of the course
	 * @param credits the number of credits
	 * @param numSeats the max number of seats
	 * @param numSeatsAvailable the number of seats left and hence available for new students to join
	 * @param roster the roster of enrolled students in the course(in an array)
	 */

	public Course(String name, int credits, int numSeats) {
		this.name = name;
		this.credits = credits;
		this.numSeats = numSeats;
		this.remainingSeats = numSeats;
		this.roster = new Student [this.remainingSeats];
	}
	/**
	 * getter
	 * @return the name of the course
	 */

	public String getName() {
		return this.name;
	}
	/**
	 * getter
	 * @return the credits of the course
	 */

	public int getCredits() {
		return this.credits;
	}
	/**
	 * getter
	 * @return the number of seats still available for students to enroll in
	 */

	public int getRemainingSeats() {
		return this.remainingSeats;
	}
	/**
	 * getter
	 * @return get the roster of the student
	 */

	public Student[] getRoster() {
		return this.roster;
	}
	/**
	 * setter
	 * @param credits the new credits of the course
	 */

	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * setter
	 * @param remainingSeats the new number of seats left and hence available for new students to join
	 */

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
	/**
	 * setter
	 * @param roster the new roster of the course 
	 */

	public void setRoster(Student[] roster) {
		this.roster = roster;
	}
	/**
	 * method
	 * @return toString
	 */

	public String toString() {
		return this.name + this.credits;
	}
	/**
	 * mutator
	 * @param s
	 * @return check whether the student has or has not already enrolled, update the number of seats remaining，
	 */

	public boolean addStudent(Student s) { 
		boolean a = true;
		if (this.remainingSeats != 0) {
			for (int i = 0; i < this.numSeats; i++) {
				if(roster[i] == s) {
					i = this.numSeats + 1;// condition to exit the loop
					a = false;// student s is not added
				}
				else {
					a = true; // else a remains to be true
				}
			}
		}
		else { // when remainingSeat == 0
			a = false;
		}
		// after the above 2 lines of code

		if(a == true) {// student s is added & has to be double equal sign here or else JUnit test won't pass
			roster[this.numSeats - this.remainingSeats] = s; // put the new student s into the roster
			this.remainingSeats -= 1;// new number of remainingSeats
		}
		return a;
	}

	/**
	 * method
	 * @return average GPAs of all students enrolled in the course  
	 */


	public double averageGPA() {
		double sum = 0;
		for(int i=0; i < this.numSeats - this.remainingSeats; i++) {
			sum = sum + roster[i].getGPA();
		}
		double finalAverageGPA = (Math.round(sum / (this.numSeats - this.remainingSeats)*1000))/1000.0;
		return finalAverageGPA;

	}
	/**
	 * method
	 * @return a String that represents a roster with all of the Students (with their names printed) in the course
	 */
	public String generateRoster() {
		String r = "";
		for (int i = 0; i < this.numSeats - this.numSeats; i++) {
			r += roster[i].getName() + "";
		}
		return r;
	}





}
