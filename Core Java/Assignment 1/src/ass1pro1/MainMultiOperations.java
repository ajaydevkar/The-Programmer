package ass1pro1;

public class MainMultiOperations {

	public static void main(String args[]) {

		int no = Integer.parseInt(args[0]);

		MultiOperations obj = new MultiOperations(no);

		if (obj.isZero()) {

			System.out.println("Number is Zero");
		
		} else {
		
			System.out.println("Number is Not zero");
		}
		if (obj.isNegative()) {
		
			System.out.println("Number is Negative:");
		
		} else {
		
			System.out.println("Number is Not Negative");
		
		}
		if (obj.isPossitive()) {
		
			System.out.println("Number is possitive");

		} else {

			System.out.println("Nubmer is Not possitive");
		
		}
		if (obj.isOdd()) {
		
			System.out.println("Number is Odd");

		} else {
			
			System.out.println("Number is Not Odd");
		}
		if (obj.isEven()) {
			
			System.out.println("Number is Even");
		
		} else {
			System.out.println("Number is Not Even:");
		}
	}
}