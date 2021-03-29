package xd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FTest {

	@Test
	void testSum() {
		assertEquals(5, F.sum(5, 5));
		assertEquals(15, F.sum(1, 5));
		assertEquals(0, F.sum(5, 1));
		assertEquals(45, F.sum(5, 10));
		assertEquals(135, F.sum(20, 25));
		assertEquals(0, F.sum(28, 26));
	}
	@Test
	void testPro() {
		assertEquals(720, F.pro(1, 6));
		assertEquals(0, F.pro(0, 6));
		assertEquals(1, F.pro(6, 6));
		assertEquals(1,F.pro(7, 6));
	}
}
