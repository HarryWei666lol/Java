package practiceForExams;

public class ArrayRecursion2ndExam {
	public static int num131s(int[]a, int b, int c) {
		if(b == c) {
			if(a[b] == 131) {
				return 1;
			}
			else {
				return 0;
			}
		}
		return num131s(a,b,c-1)+num131s(a,c,c);
	}
	
	public static int num131(int[]a, int b, int c) {
		int sum = 0;
		for(int i = 0; i < c; i++) {
			if(a[i] == 131) {
				sum++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[]a = new int[] {131, 5, 7, 132, 14, 131};
		System.out.println(num131s(a, 0, a.length-1));
	}


}
