package nov;

import java.util.Scanner;

public class C6SwapNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value : ");
		int x = sc.nextInt();
		System.out.print("Enter y value : ");
		int y = sc.nextInt();
		System.out.println();
		int z;

		z = x;
		x = y;
		y = z;

		System.out.println("x : " + x);
		System.out.println("y : " + y);

		sc.close();

	}
}
