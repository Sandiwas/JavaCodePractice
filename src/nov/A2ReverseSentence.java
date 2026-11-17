package nov;

public class A2ReverseSentence {
	public static void main(String[] args) {
		String str = "Automation Is Fun";
		str = removeSpaceMakeLowerCase(str);
		System.out.println(str);
		str = reverseSentence(str);
		System.out.println(str);

	}

	public static String reverseSentence(String str) {
		String result = "";
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		return result;
	}

	public static String removeSpaceMakeLowerCase(String str) {
		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			lowerCase += ch;
		}
		return lowerCase;
	}
}
