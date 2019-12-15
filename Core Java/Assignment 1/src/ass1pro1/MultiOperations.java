
/* Define a class MyNumber having one private int data member. Write a default
constructor to initialize it to 0 and another constructor to initialize it to a value (Use this).
Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main.
Use command line arguments to pass a value to the object */

package ass1pro1;

public class MultiOperations {
	private int number;

	public MultiOperations() {
		number = 0;
	}

	public MultiOperations(int number) {
		super();
		this.number = number;
	}

	public boolean isNegative() {
		return number < 0;
	}

	public boolean isPossitive() {
		return number >= 0;
	}

	public boolean isZero() {
		return number == 0;

	}

	public boolean isOdd() {
		return (number%2)!= 0;
	}

	public boolean isEven() {
		return (number%2)== 0;
	}

}