package sqrt;

public class SquareRoot {
	
	private double input;
	private double error = .1;
	//Default constructor
	public SquareRoot(){
		
	}
	/**
	 * Constructor that takes in number
	 * @param num
	 */
	public SquareRoot(double num){
		this.input = num;
	}
	/**
	 * Constructor that takes in number and margin of error
	 * @param num
	 * @param err
	 */
	public SquareRoot(double num, double err){
		this.input = num;
		this.error = err;
	}
	//Getters and Setters
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
	
	
}