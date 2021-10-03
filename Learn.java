package week1.day1;

public class Learn {
	

	public static void main(String[] args) {
		int number = 21;
		if (number%3 == 0) {
			System.out.println("TRIZZ");
		}
		else if(number%5 == 0) {
			System.out.println("FIZZ");
		}
		else if(number%3 == 0 && number%5 == 0) {
			System.out.println("TRIZZ-FIZZ");
		}
		
		
	}
}
