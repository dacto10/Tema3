package edaii;

public class BenchmarkResult {
	private final int times;
	private final long totalTime;
	private final double averageTime;
	private final long minTime;
	private final long maxTime;

	public BenchmarkResult(long[] times) {
		this.times = times.length;
		this.totalTime = calculateTotalTime(times);
		this.averageTime = calculateAverageTime(times);
		this.minTime = calculateMinTime(times);
		this.maxTime = calculateMaxTime(times);
	}

	private long calculateMaxTime(long[] times) {
		long maxTime = Long.MIN_VALUE;
		for (long time : times) {
			if (time > minTime) {
				maxTime = time;
			}
		}
		return maxTime;
	}

	private long calculateMinTime(long[] times) {
		long minTime = Long.MAX_VALUE;
		for (long time : times) {
			if (time < minTime) {
				minTime = time;
			}
		}
		return minTime;
	}

	private double calculateAverageTime(long[] times) {
		return calculateTotalTime(times) * 1.0d / times.length;
	}

	private long calculateTotalTime(long[] times) {
		long totalTime = 0;
		for (long time : times) {
			totalTime += time;
		}
		return totalTime;
	}

	public String toString() {
		return "Ran " + this.times + " times. " + "Total: " + this.totalTime + ", Average: " + this.averageTime
				+ ", Min: " + this.minTime + ", Max: " + this.maxTime;
	}

	public long getTotalTime() {
		return this.totalTime;
	}
}