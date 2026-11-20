package nov;

public class B15AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		String acending = acendingOrder(str);
		System.out.println("Acending Order : " + acending);
		String decending = decendingOrder(str);
		System.out.println("Decending Order : " + decending);
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
		return new String(arr);
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
		return new String(arr);
	}
}
