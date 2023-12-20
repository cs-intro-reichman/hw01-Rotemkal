/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int range = (second-first);
		int rand1 = (int) (Math.random() * range) + first;
		int rand2 = (int) (Math.random() * range) + first;
		int rand3 = (int) (Math.random() * range) + first;
		int min1= Math.min(rand1,rand2);
		min1 = Math.min(min1,rand3);
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("The minimal generated number was " + min1);
	}
}
