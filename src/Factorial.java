/* Factorial -- an iterative and recursive method for finding the factorial of a number
 * -- only using int datatypes
 * -- albeit using a whole class to find a factorial is overkill and calls for some strange use, but building it this way allows for a more important level of separation
 * --   which is more important for this review
 * */
public class Factorial {

	private int value;
	private int factorialValue;
	
	/* CONSTRUCTORS */
	public Factorial(int x){
		this.value = x;
	}

	/* GETTERS & SETTERS */
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getFactorialValue() {
		return factorialValue;
	}

	public void setFactorialValue(int factorialValue) {
		this.factorialValue = factorialValue;
	}
	
	/* CLASS METHODS */
	public void performIterative(){
		setFactorialValue( iterative(getValue()) );
	}
	
	public void performRecursive(){
		setFactorialValue( recursive(getValue()) );
	}
	
	/* The iterative and recursive methods could be written more concisely by taking advantage of the getters/setters available from the Factorial class, but by implementing them
	 *   this way it's easier to study the computational and structural differences between the iterative and recursive methods of finding the factorial of a number. */
	public int iterative(int input){
		int total = 1;
		if((input == 0) || (input == 1)){
			return 1;
		}else{
			for(int i = 1; i < input; i++){
				total = total * i;
			}
			return total;
		}
	}
	
	public int recursive(int input){
		if( (input == 0) || (input == 1) ){
			return 1;
		}else{
			return recursive(input * recursive(input - 1));
		}
	}
}
