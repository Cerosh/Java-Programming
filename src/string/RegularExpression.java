package string;

public class RegularExpression {
	public static void main(String args[]) {
		String s1 = "!@#Remove @#$#@Junk &**Character ";
		s1 = s1.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s1);
	}
}
