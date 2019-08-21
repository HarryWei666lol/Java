package practiceForExams;

public class RecursionPractice {
//	public static int f(int n) {
//		if(n <= 3) {
//			return n;
//		}
//		else {
//			int sum=0;
//			for(int i =0; i< (n/3+1);i++) {
//				sum = sum +(n-3*i);
//			}
//			return sum;
//		}
//	}
	
	public static int f (int n) {
		if(n < 0) {
			return 0;
		}
		else {
			return n+f(n-3);
		}
	}
	
	public static void main (String[] args) {
		System.out.println(f(8));
	}

}
