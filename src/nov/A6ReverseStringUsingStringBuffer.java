package nov;

public class A6ReverseStringUsingStringBuffer {
	public static void main(String[] args) {
		String str = "Auto mation";
		str = removeSpaceMakelowerCase(str);
		System.out.println(str);

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

	public static String removeSpaceMakelowerCase(String str) {

		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				lowerCase += ch;
			}
		}
		return lowerCase;
	}
}
