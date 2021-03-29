package edaii;

public class Benchmark {
	public static BenchmarkResult run(Runnable runnable, int numRepeats) {
		final long[] times = new long[numRepeats];
		for (int i = 0; i < numRepeats; i++) {
			final long timeBefore = System.currentTimeMillis();
			runnable.run();
			final long timeAfter = System.currentTimeMillis();
			times[i] = timeAfter - timeBefore;
		}
		return new BenchmarkResult(times);
	}
}