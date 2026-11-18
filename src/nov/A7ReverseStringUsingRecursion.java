package nov;

public class A7ReverseStringUsingRecursion {
	public static void main(String[] args) {
		String str = "Automation";
		str = reverseString(str);
		System.out.println(str);
	}

	public static String reverseString(String str) {
		if (str.length() == 0) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
