package array;

import java.util.Arrays;

public class ArrayCompare {
	public static void main(String args[]) {
		String[] One = { "Apple", "Mango", "Banana" };
		String[] Two = { "Banana", "Mango", "Apple1" };
		Arrays.sort(One);
		Arrays.sort(Two);
		System.out.println(Arrays.equals(One, Two));

	}
}
