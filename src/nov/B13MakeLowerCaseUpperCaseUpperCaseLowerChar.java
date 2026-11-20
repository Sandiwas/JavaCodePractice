package nov;

public class B13MakeLowerCaseUpperCaseUpperCaseLowerChar {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";
		str = toggleCase(str);
		System.out.println(str);
	}

	public static String toggleCase(String str) {
		String toggleCase = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				toggleCase += (char) (ch + 32);
			} else if (ch >= 'a' && ch <= 'z') {
				toggleCase += (char) (ch - 32);
			} else {
				toggleCase += ch;
			}
		}
		return toggleCase;
	}
}
