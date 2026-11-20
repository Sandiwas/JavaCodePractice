package nov;

public class B14CharacterSeparator {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";
		charSeprator(str);
	}

	public static void charSeprator(String str) {
		String upperCase = "";
		String lowerCase = "";
		String number = "";
		String specialChar = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			} else if (ch >= '0' && ch <= '9') {
				number += ch;
			} else {
				specialChar += ch;
			}
		}
		System.out.println("UpperCase : " + upperCase);
		System.out.println("LowerCase : " + lowerCase);

		System.out.println("Number : " + number);

		System.out.println("SpecialChar : " + specialChar);

	}

}
