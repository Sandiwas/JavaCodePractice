package nov;

import java.util.ArrayList;

public class C7EvenAndOddNum {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		printEvenAndOddNumber(arr);
	}

	public static void printEvenAndOddNumber(int[] arr) {

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}

		// System.out.println("even number in array is : " + even);
		// System.out.println("Odd number in array is : " + odd);

		System.out.print("even number in array are : ");
		for (int n : even) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.print("Odd number in array are : ");
		for (int n : odd) {
			System.out.print(n + " ");
		}
		;
	}
}
