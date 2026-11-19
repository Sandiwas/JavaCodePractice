package nov;

public class C1CountAInString {
	public static void main(String[] args) {
		String str = "Sandip Gahusad Wasekar";
		countAInString(str);
	}

	public static void countAInString(String str) {
		int countA = 0;
		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}

				if (ch == 'a') {
					countA++;
				}
				lowerCase += ch;
			}

		}
		System.out.println("count of A is : " + countA);
		System.out.println("Lower Case String : " + lowerCase);
	}
}
