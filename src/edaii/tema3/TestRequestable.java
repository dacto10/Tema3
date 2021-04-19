package edaii.tema3;
import java.io.IOException;

public class TestRequestable implements Requestable {
	private String url;
	private String content;
	private int numFails;
	private int numAttempts;
	public TestRequestable(String url, String content, int numFails) {
		this.url = url;
		this.content = content;
		this.numFails = numFails;
		this.numAttempts = 0;
	}
	public String request() throws IOException {
		numAttempts++;
		if (content != null && numAttempts > numFails) {
			return content;
		} else {
			throw new IOException( "Can't establish connection to '" + this.url + "'");
		}
	}
	public int getNumAttempts() {
		return numAttempts;
	}
}