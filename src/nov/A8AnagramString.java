package nov;

public class A8AnagramString {
	public static void main(String[] args) {
		String s1 = "Sil  ent";
		String s2 = "liS Ten";

		char[] arr1 = removeSpaceMakeLowerCase(s1).toCharArray();
		char[] arr2 = removeSpaceMakeLowerCase(s2).toCharArray();

		sort(arr1);
		sort(arr2);

		isAnagramString(arr1, arr2);

	}

	public static void isAnagramString(char[] arr1, char[] arr2) {

		if (isEqual(arr1, arr2)) {
			System.out.println("Given string is Anagram");
		} else {
			System.out.println("Given string is not Anagram");
		}
	}

	public static boolean isEqual(char[] arr1, char[] arr2) {

		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sort(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
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
