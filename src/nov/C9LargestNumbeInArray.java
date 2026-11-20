package nov;

public class C9LargestNumbeInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		printLargestNumberInArray(arr);
	}

	public static void printLargestNumberInArray(int[] arr) {

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}
		System.out.println("Largest number in arrays is : " + largest);

	}
}
