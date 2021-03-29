package xd;

public class F {
//	public static int sum(int current, int end) { 
//		return current <= end ? current + sum(current + 1, end) : 0;
//	}
//	public static int pro(int current, int end) { 
//		return current <= end ? current * pro(current + 1, end) : 1;
//	}
//	public static long fibonacci(int n) {
//		return n <= 0 ? 0 : n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
//	}
	public static int factorialBuenardo(int n) {
		return factorialBrujo(n, 1);
	}
	private static int factorialBrujo(int acc, int current) {
		return current <= 1 ? current : factorialBrujo(acc-1, current);
	}
	
	public static int sum(int current, int end) { 
		return current > end ? 0 : sumatorio(current, end, 0);
	}
	
	public static int sumatorio(int current, int end, int acc) {
		return current <= end ? sumatorio(current + 1, end, acc + current) : acc;
	}
	
	public static int pro(int current, int end) { 
		return current > end ? 1 : producto(current, end, 1);
	}
	
	public static int producto(int current, int end, int acc) {
		return current <= end ? producto(current + 1, end, acc * current) : acc;
	}
	
	public static int fibonacci(int n) {
		return n <= 0 ? 0 : fibonacci(n, n-1, n-2);
	}
	
	private static int fibonacci(int n, int prev, int current) {
		return n == 1 ? current : fibonacci(n-1, current, prev + current);
	}
}
