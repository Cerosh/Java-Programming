package string;

public class ReverseInteger {
	public static void main (String args[]) {
		// Using the logic with arithmetic operators
		int i = 1234;
		int reverse = 0;
		while (i!=0) {
		reverse = reverse*10 + i % 10;
		i = i /10;
		}
		System.out.println("Reverse using arithmetic Operators: "+ reverse);
		
		// Using built in method
		int i1 = 12345;
		StringBuilder sb = new StringBuilder(String.valueOf(i1));
		StringBuilder reverseSB = sb.reverse();
		System.out.println("Reverse using build in method: "+reverseSB);
	}

}
