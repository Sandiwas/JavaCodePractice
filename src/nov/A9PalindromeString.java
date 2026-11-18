package nov;

public class A9PalindromeString {
	public static void main(String[] args) {
		String str = "Rad ar";
		str = removeSpaceMakeLowerCase(str);
		System.out.println(str);
		isPlaindrome(str);

	}

	public static void isPlaindrome(String str) {

		if (str.equals(reverseString(str))) {
			System.out.println("Given string is plaindrome String");
		} else {
			System.out.println("Given string is not palindrome");
		}

	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	public static String removeSpaceMakeLowerCase(String str) {
		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				lowerCase += ch;
			}

		}
		return lowerCase;
	}
}
