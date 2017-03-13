package sqrt;

public class SquareRoot {

	private double input;
	private double error = .1;

	/**
	 * Constructor with user defined input
	 * 
	 * @param in
	 */
	public SquareRoot(double in) {
		this.input = in;
	}

	/**
	 * Constructor with user defined input and error
	 * 
	 * @param in
	 * @param er
	 */
	public SquareRoot(double in, double er) {
		this.input = in;
		this.error = er;
	}

	/**
	 * method to calculate square root
	 * 
	 * @param num
	 * @param guess
	 * @param err
	 * @return approximate square root of input value
	 */
	public static double sqrt(double num, double guess, double err) {

		// if the calculated square root is within the error will return guess
		if (Math.abs(guess * guess - num) <= err)
			return guess;
		// if the calculated square root is outside of the acceptable error
		// recursively runs method
		else {
			guess = (guess * guess + num) / (2 * guess);
		}
		return (sqrt(num, guess, err));

	}

	/**
	 * method to calculate square root using a user defined object
	 * 
	 * @return approximate square root
	 */
	public double sqrt() {

		// sets guess to half the input value
		// sets error value
		double guess = this.input / 2;
		double num = this.input;
		double err = this.error;

		// if the calculated square root is within the error will return guess
		if (Math.abs(guess * guess - num) <= err)
			return guess;
		// if the calculated square root is outside of the acceptable error
		// recursively runs method with new guess
		else {
			guess = (guess * guess + num) / (2 * guess);
		}
		return (sqrt(num, guess, err));

	}

	public static void main(String[] args) {

		// tests method that take 3 parameters: input, guess, and error
		System.out.println(sqrt(9, 3, .01));
		// creates object with input 3
		SquareRoot test = new SquareRoot(3);
		// tests sqrt method on 3 with default error
		System.out.println(test.sqrt());
		// creates object with input 3 and error .01
		SquareRoot test2 = new SquareRoot(3, .01);
		// tests sqrt method with 3 and user defined error
		System.out.println(test2.sqrt());

	}

}