package xd;

import java.util.ArrayList;
import java.util.List;

import edaii.Benchmark;
import edaii.BenchmarkResult;

public class FPlayground {
	static final int NUM_STEPS = 50;
	
	public static void main(String[] args) {
		benchmarkFactorial();
	}

	private static void benchmarkFactorial() {
		final int start = 1000;
		final int step = 100;
		final List<Long> results = new ArrayList<Long>();
		for (int i = start; i < start + NUM_STEPS * step; i+= step) {
			final int index = i;
			final BenchmarkResult result = Benchmark.run(() -> F.sum(index, start), 1000);
			results.add(result.getTotalTime());
		}
		System.out.println(results);
	}
}
