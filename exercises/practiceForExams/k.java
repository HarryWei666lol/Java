package practiceForExams;

public class k {
	public static boolean isOdd(int n) {
		if(n >=2) {
			return isOdd(n-2);
		}
		else if( n ==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main (String[] args) {
		System.out.println(isOdd(2));
	}

}
