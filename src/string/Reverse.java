package string;

public class Reverse {
	public static void main(String args[]) {
		
		String s = "Reverse this String";
		StringBuffer sBuffer = new StringBuffer(s);
		StringBuilder sBuild = new StringBuilder(s);
		String reverse = "";
		// Reverse using the loop
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse using the loop: "+reverse);
		// Reverse using the String Buffer
		System.out.println("Reverse using the String Buffer: "+sBuffer.reverse());
		// Reverse using the String Builder
		System.out.println("Reverse using the String Builder: "+sBuild.reverse());
		
	}
	
	

}
