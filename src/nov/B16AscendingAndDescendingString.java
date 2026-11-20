package nov;

public class B16AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";

		String acendingOrder = acendingOrder(str);
		System.out.println("Acending order : " + acendingOrder);
		String decending = decendingOrder(str);
		System.out.println("Decending order : " + decending);
	}

	public static String acendingOrder(String str) {
		char[] arr = str.toCharArray();
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
		String result = "";
		for (char ch : arr) {
			result += ch;
		}
		return result;
	}

	public static String decendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		String result = "";
		for (char ch : arr) {
			result += ch;
		}
		return result;
	}
}
