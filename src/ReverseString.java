
public class ReverseString {
	public static String reverse(String s) {
		char[] stringToCharArray = s.toCharArray();
		char[] reverseArray = new char[stringToCharArray.length];

		// reverse array
		for (int i = 0; i < stringToCharArray.length; i++) {
			reverseArray[stringToCharArray.length - 1 - i] = stringToCharArray[i];
		}
		String reversedString = new String(reverseArray); // merge reversed
															// array
		return reversedString;
	}
}
