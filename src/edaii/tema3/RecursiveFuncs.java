package edaii.tema3;

public class RecursiveFuncs {

	public static int invertDigits(int i) {
		return invertDigits(Integer.toString(i), "");
	}
	private static int invertDigits(String i, String acc) {
		return i.length() > 0 ? invertDigits((String) i.subSequence(0, i.length()-1), acc.concat(Character.toString(i.charAt(i.length() - 1)))) : acc.charAt(acc.length()-1) == '-' ? Integer.parseInt((String) acc.subSequence(0, acc.length()-1)) - 2 * Integer.parseInt((String) acc.subSequence(0, acc.length()-1)) : Integer.parseInt(acc);
	}

	public static int sumArrayElements(int[] arr) {
		return arr.length == 0 ? 0 : sumArrayElements(arr, 0, 0);
	}
	private static int sumArrayElements(int[] arr, int index, int acc) {
		return index == arr.length-1 ? acc + arr[index]: sumArrayElements(arr, index + 1, acc + arr[index]);
	}

	public static int sumMatrixElements(int[][] matrix) {
		return matrix.length == 0 ? 0 : sumMatrixElements(matrix, 0, 0);
	}
	
	private static int sumMatrixElements(int[][] matrix, int index, int acc) {
		return index == matrix.length-1 ? acc + sumArrayElements(matrix[index], 0, 0) : sumMatrixElements(matrix, index + 1, sumArrayElements(matrix[index], 0, 0));
	}

	public static String request(TestRequestable requestable, int i) {
		return null;
	}
	
}
