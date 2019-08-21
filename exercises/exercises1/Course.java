package exercises1;

public class Course {
	private String name;
	private int credits, numSeats, remainingSeats;
	private Student [] roster;

	public Course(String name, int credits, int numSeats) {
		this.name = name;
		this.credits = credits;
		this.numSeats = numSeats;
		this.remainingSeats = numSeats;
		this.roster = new Student[this.remainingSeats];

	}

	public String getName() {
		return this.name;

	}

	public int getCredits() {
		return this.credits;

	}

	public int getRemainingSeats() {
		return this.remainingSeats;

	}

	public Student [] getRoster() {
		return this.roster;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;

	}

	public void setRoster(Student [] roster) {
		this.roster = roster;

	}

	public String toString() {
		return this.name + " "+ this.credits;

	}

	public boolean addStudent(Student s) {
		boolean a = true;
		if( this.remainingSeats!= 0) {
			for(int i = 0; i < this.numSeats; i++) {
				if(roster[i] ==s) {
					i = this.numSeats+1;
					a = false;
				}
				else {
					a = true;
				}
			}
		}
		else {
			a = false;
		}
		if( a == true){
			roster[this.numSeats-this.remainingSeats]=s;
			this.remainingSeats-=1;
		}
		return a;
	}

	public double averageGPA() {
		double sum =0;
		for(int i =0; i < this.numSeats-this.remainingSeats;i++) {
			sum += roster[i].getGPA();
		}
		double finalAverageGPA = (Math.round(sum / (this.numSeats - this.remainingSeats)*1000))/1000.0;
		return finalAverageGPA;
	}
	public String generateRoster() {
		String r = "";
		for(int i = 0; i < this.numSeats- this.remainingSeats;i++ ) {
			r += roster[i].getName();
		}
		
		return r;
	}
	
	
	
	
	
	
	
}