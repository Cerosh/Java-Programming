package array;

public class MissingNumberInSequenceArray {
public static void main (String args[]) {
	int [] a1 = {1,2,3,4,6,7,8,9,10};
	int sum = 0;
	for (int i = 0; i< a1.length; i++) {
		sum = sum + a1[i];
			}
	System.out.println("Sum of Array values"+sum);
	int sum1 = 0;
	for (int i = 1; i<=10; i++) {
		sum1 = sum1 + i;
	}
	System.out.println("Sum of sequence values"+sum1);
	int difference = sum1-sum;
System.out.println("Missing Value: "+ difference);
}

}
