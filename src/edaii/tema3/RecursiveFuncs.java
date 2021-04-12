package edaii.tema3;

public class RecursiveFuncs {

	public static int invertDigits(int i) {
		return invertDigits(Integer.toString(i), "");
	}
	public static int invertDigits(String i, String acc) {
		return i.length() > 0 ? invertDigits((String) i.subSequence(0, i.length()-1), acc.concat(Character.toString(i.charAt(i.length() - 1)))) : acc.charAt(acc.length()-1) == '-' ? Integer.parseInt((String) acc.subSequence(0, acc.length()-1)) - 2 * Integer.parseInt((String) acc.subSequence(0, acc.length()-1)) : Integer.parseInt(acc);
	}

	public static int sumArrayElements(int[] is) {
		return 0;
	}

	public static int sumMatrixElements(int[][] is) {
		return 0;
	}

	public static String request(TestRequestable requestable, int i) {
		return null;
	}
	
}
