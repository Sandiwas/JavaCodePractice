package nov;

public class A4ReverseSentenceAndEachString {
	public static void main(String[] args) {
		String str = "Automation is fun";
		str = makeLowerCase(str);
		System.out.println(str);
		str = reverseSentenceAndEachWord(str);
		System.out.println(str);

	}

	public static String reverseSentenceAndEachWord(String str) {
		String result = "";
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			String word = arr[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			result = result + reverseWord + " ";
		}
		return result;
	}

	public static String makeLowerCase(String str) {

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
