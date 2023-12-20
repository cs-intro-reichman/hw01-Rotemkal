/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        double first = Integer.parseInt(args[0]);
		double second = Integer.parseInt(args[1]);
		double range = (second-first);
		double rand1 = Math.random(range) + first;
		double rand2 = Math.random(range) + first;
		double rand3 = Math.random(range) + first;
		double min1= Math.min(rand1,rand2);
		min1 = Math.min(min1,rand3);
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("The minimal generated number was " + min1);
	}
}
