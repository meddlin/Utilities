/*
 * 2-d arrays, nested for loop, getters/setters, constructors, customer list, record object, get/setAccountBalance
 * */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test the Stack class
		Stack myStack = new Stack(5);
		System.out.println("After creating Stack...");
		myStack.printStack();
		
		myStack.push(100);
		System.out.println("After pushing 100 to stack...");
		myStack.printStack();
		
		int hold = myStack.pop();
		System.out.println("After popping 100 from stack...");
		myStack.printStack();
		System.out.println("hold: " + hold);
		
		System.out.println("numbered Stack...");
		myStack.numberStack();
		myStack.printStack();
		
		EulerProblem x = new EulerProblem(1);
		x.problemOne();
		
		ChopShop st1 = new ChopShop();
		st1.findAllVowels("Does this string have any vowels?");
	}

}
