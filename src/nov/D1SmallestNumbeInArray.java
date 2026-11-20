package nov;

public class D1SmallestNumbeInArray {
public static void main(String[] args) {
	int[] arr= { 5, 6, 4, 3, 2, 7, 1 };
	findSmallestNumber(arr);
}

public static void findSmallestNumber(int[] arr) {
	
	int smallest=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	System.out.println("Smallest number in array : "+smallest);
}
}
