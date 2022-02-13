package exercise_3;

public class Overloading {
	public static void main(String[] args) {
		int sum1 = add(2,3);
		double sum2 = add(4.5,5.5);
		String sum3 = add("Hello"," Everyone!");
		
		// displaying output of all three methods
		System.out.println("Output of first overloaded method : " + sum1);
		System.out.println("Output of second overloaded method : " + sum2);
		System.out.println("Output of third overloaded method : " + sum3);
	}
	
	// method with return type of int
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	// method with return type of double
	public static double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	// method with return type of String
	public static String add(String a, String b) {
		String sum = a+b;
		return sum;
	}
}
