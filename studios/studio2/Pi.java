package studio2;
public class Pi {

  public static void computePi() {
     double ans = 0;
     int insidePoint = 0;
     for (int i = 0; i < 10000 ; i++) {
    	 double x = Math.random();
    	 double y = Math.random();
    	 double distance = Math.sqrt(Math.pow(x, 2) + Math.pow( y, 2));
    	 if (distance <= 1) {
    		 insidePoint++;
    	 }
     }
     ans= 4.0 * insidePoint / 10000 ;
     System.out.println("Our group shows Pi = " + ans);
  }

  public static void main(String[] args) {
     computePi();
  }
}