package book;

public class UseArgement {

	public static void main(String[] args) {
	int year = 2012;
	boolean isLeapYear;
	isLeapYear = (year % 4 == 0);
	isLeapYear = isLeapYear && (year % 100 !=0);
	isLeapYear = isLeapYear && (year % 400 ==0);
	double a = Math.log(8);
	double b = Math.E;
	double c = Math.sin(8);
	double d = Math.toDegrees(c);
	

	System.out.println(c);
	}

}
