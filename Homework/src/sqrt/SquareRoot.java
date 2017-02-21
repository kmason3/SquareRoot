package sqrt;

public class SquareRoot {

	private double input;
	private double error;
	private double guess;

	// Default constructor
	public SquareRoot() {

	}

	/**
	 * Constructor that takes in number
	 * 
	 * @param num
	 */
	public SquareRoot(double num) {
		this.input = num;
		this.error = .1;
		this.setGuess(num / 2);

		System.out.print(sqrt(this.input, this.guess, this.error));

	}

	/**
	 * Constructor that takes in number and margin of error
	 * 
	 * @param num
	 * @param err
	 */
	public SquareRoot(double num, double err) {
		this.input = num;
		this.error = err;
		this.guess = num / 2;

		System.out.print(sqrt(this.input, this.guess, this.error));
	}

	/**
	 * constructor that takes in a guess as well as number and margin of error
	 * 
	 * @param num
	 * @param guess
	 * @param err
	 */
	public SquareRoot(double num, double guess, double err) {
		this.input = num;
		this.error = err;
		this.guess = guess;

		System.out.print(sqrt(this.input, this.guess, this.error));
	}

	// Getters and Setters
	public double getInput() {
		return input;
	}

	public void setInput(double input) {
		this.input = input;
	}

	public double getError() {
		return error;
	}

	public void setError(double error) {
		this.error = error;
	}

	public double getGuess() {
		return guess;
	}

	public void setGuess(double guess) {
		this.guess = guess;
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

	public static void main(String[] args) {
		SquareRoot test = new SquareRoot(81);

		System.out.print(test);
	}

}