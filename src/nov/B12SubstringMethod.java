package nov;

public class B12SubstringMethod {
	public static void main(String[] args) {
		String str = "Automation";
		str = subString(0, 4, str);
		System.out.println(str);
	}

	public static String subString(int start, int end, String str) {
		if (str == null || str.length() == 0) {
			throw new NullPointerException("Given String null or empty");
		}
		if (start < 0 || start > end || end > str.length()) {
			throw new StringIndexOutOfBoundsException("Invalid Indexes");
		}
		String result = "";
		for (int i = start; i < end; i++) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
