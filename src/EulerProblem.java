import java.util.ArrayList;

/* This class is the entry point for "storing" and working EulerProject problems.
 * 
 * https://projecteuler.net/
 *  */
public class EulerProblem {
	
	/* CONSTRUCTORS */
	public EulerProblem(int x){
		// use 'x' to look up which EulerProblem should be returned
	};
	
	public EulerProblem(String entry){
		// use 'entry' to look up which EulerProblem should be returned
	};
	
	/* Problem 1
	 * 
	 * if we list all the natural numbers below 10 that are multiples of 3 or 5: 3, 5, 6, 9
	 * the sum of these numbers is: 23
	 * 
	 * find the sum of all the multiples of 3 or 5 below 1000.
	 * Personal Bonus: print their sum
	 * */
	public void problemOne(){
		ArrayList answers = new ArrayList(1);
		
		for(int i = 1; i < 1001; i++){
			if (i % 3 == 0){
				// multiple of 3
				answers.add(i);
				System.out.println(" %3, i: " + i);
			} else if (i % 5 == 0){
				// multiple of 5
				answers.add(i);
				System.out.println(" %5, i: " + i);
			}
		}
		
		// sum all the numbers
		/*int summation = 0;
		for(int i = 0; i < )*/
	};

	/* Problem 2
	 * 
	 * 
	 * */
}
