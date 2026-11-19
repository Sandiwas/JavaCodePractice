package nov;

public class B19CountVowels {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar";
		str = removeSpaceMakeLowerCase(str);
		System.out.println("Lower Case String : " + str);
		countVowelsAndConsonants(str);

	}

	public static void countVowelsAndConsonants(String str) {
		String vowels = "";
		String consonants = "";
		int countOfVowels = 0;
		int countOfConsonats = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels += ch;
				countOfVowels++;
			} else {
				consonants += ch;
				countOfConsonats++;
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
		System.out.println("count of vowels : " + countOfVowels);
		System.out.println("count of Consonants : " + countOfConsonats);

	}

	public static String removeSpaceMakeLowerCase(String str) {
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
