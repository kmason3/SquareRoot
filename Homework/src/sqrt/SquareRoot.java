package sqrt;

public class SquareRoot {

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
	 * method to calculate square root
	 * 
	 * @param num
	 * @param err
	 * @return approximate square root of input value
	 */
	public static double sqrt(double num, double err) {
		// sets guess to half input value
		double guess = num / 2;
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
	 * method to calculate square root
	 * 
	 * @param num
	 * @return approximate square root of input value
	 */
	public static double sqrt(double num) {

		// sets guess to half the input value
		// sets error value
		double guess = num / 2;
		double err = .1;

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
		
		//tests method that take 3 parameters: input, guess, and error
		System.out.println(sqrt(9, 3, .01));
		
		//tests method that takes 2 parameters: input and error
		System.out.println(sqrt(6,.001));
		
		//tests method that takes 1 paramter: input
		System.out.println(sqrt(25));
	}

}