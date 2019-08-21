package exercises1;

public class Student {
	
	private String firstName, lastName;
	private int studentID, credits;
	private double GPA;
	
	public Student(String firstName, String lastName, int studentID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.GPA =0;
		
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public int getStudentID() {
		return this.studentID;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public double getGPA() {
		return this.GPA;
	}
	
	public void setCredits(int yourCredits) {
		this.credits = yourCredits;
	}
	
	public void setGPA(double yourGPA) {
		this.GPA = yourGPA;
	}
	
	public String toString() {
		return this.firstName+" " + this.lastName + ", " +this.studentID;
		
	}
	
	public void submitGrade(double grades, int credits) {
		double qualityGrade = this.credits* this.GPA + grades * credits;
		this.credits +=credits;
		this.GPA =((double)(Math.round(1000 * (qualityGrade / this.credits)))/1000);
		
	}
	
	public String getClassStanding() {
		if(this.credits < 30) {
			return "FirstYear";
		}
		else if (this.credits < 60) {
			return "Sophomore";
		}
		else if (this.credits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}	
	}
	
	public Student createLegacy(Student otherParent) {
		Student child = new Student (this.getName(), otherParent.getName(),this.getStudentID()+otherParent.getStudentID());
		child.setGPA((this.getGPA() + otherParent.getGPA())/2.0);
		child.setCredits(Math.max(this.getCredits(), otherParent.getCredits()));
		return child;
			
		}
	}
	
	


