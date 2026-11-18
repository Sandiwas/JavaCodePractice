package nov;

public class A5KeepSpaceReverseString {
	public static void main(String[] args) {
		String str = "Automation is fun";
		str = makeLowerCase(str);
		System.out.println(str);
		str = reverseStringKeepSpace(str);
		System.out.println(str);
	}

	public static String reverseStringKeepSpace(String str) {
		char[] arr=str.toCharArray();
		char[] result=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ' ') {
				result[i]=arr[i];
			}
		}
		
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != ' ') {
				while(arr[j] == ' ') {
					j--;
				}
				result[j]=arr[i];
				j--;
			}
			
		}
		return new String(result);
	}

	public static String makeLowerCase(String str) {
		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			lowerCase += ch;
		}
		return lowerCase;
	}
}
