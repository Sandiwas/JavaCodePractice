package nov;

import java.util.ArrayList;

public class C8EvenAndOddNumSumAndSize {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		findEvenAndOddCountAndSum(arr);
	}

	public static void findEvenAndOddCountAndSum(int[] arr) {

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		int sumOfeven=0;
		int sumOfOdd=0;
		System.out.print("Even numbers are : ");
		for(int n : even) {
			System.out.print(n+" ");
			sumOfeven+=n;
		}
		
		System.out.println();
		System.out.println("Count of even number : "+even.size());
		System.out.println("sum of even number : "+sumOfeven);
		
		
		System.out.print("Odd numbers are : ");
		for(int n : odd) {
			System.out.print(n+" ");
			sumOfOdd+=n;
		}
		System.out.println();
		System.out.println("Count of odd number : "+odd.size());
		System.out.println("sum of odd number : "+sumOfOdd);

	}

}
