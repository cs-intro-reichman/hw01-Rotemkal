/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
public class GenThree {
	public static void main(String[] args) {
		import java.util.Random;
		Random ran= new Random();
        int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int range = (second-first)+1;
		int rand1 = ran.nextInt(range)+first;
		int rand2 = ran.nextInt(range)+first;
		int rand3 = ran.nextInt(range)+first;
		int min1= Math.min(rand1,rand2);
		min1 = Math.min(min1,rand3);
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("The minimal generated number was "+min1);
	}
}
