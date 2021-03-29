package edaii.tema3;

public class RecursiveFuncs {

	public static int invertDigits(int i) {
		return invertDigits(Integer.toString(i), "");
	}
	public static int invertDigits(String i, String acc) {
		return i.length() == 0 ? acc : invertDigits(i.subSequence(0, i.length()-2), acc.concat(i.charAt(i.length() - 1)));
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
