package code_wars;

/*
 * Takes an operator (+, -, * or /), and then applies this operation to the two integer arguments given. 
 */

public class BasicOperations {
	public static void main(String[] args) {
		BasicOperations myBasicOperations = new BasicOperations();
		System.out.println(myBasicOperations.basicMath("+", 5, 0));
	}

	public Integer basicMath(String op, int v1, int v2) {

		int myResult = -1;

		switch (op) {
		case "+":
			myResult = v1 + v2;
			break;
		case "-":
			myResult = v1 - v2;
			break;
		case "*":
			myResult = v1 * v2;
			break;
		case "/":
			myResult = v1 / v2;
			break;
		}
		return myResult;
	}
}