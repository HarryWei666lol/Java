package exercises6;

public class FactorialNoBaseCase {
	
	public static int factorial(int n) {
		return n * factorial(n-1);
	}
    // the code is not working because the input parameter n becomes increasingly negative with no bound. 
    // It only stops due to the overflowing of stacks. 
	public static void main(String[] args) {
		int ans = factorial(2);
		System.out.println("Answer is " + ans);
	}
}
