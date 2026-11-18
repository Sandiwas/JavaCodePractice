package nov;

public class A3ReversEachStringinSentence {
	public static void main(String[] args) {
		String str = "Automation is fun";
		str = makeLowerCase(str);
		System.out.println(str);
		str = reverseEachWordInSentence(str);
		System.out.println(str);
	}

	public static String reverseEachWordInSentence(String str) {
		String result = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
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
