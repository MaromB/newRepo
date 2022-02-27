import java.io.IOException;

public interface Function {
	public int getValue(int x) throws IOException;

	public int getDomainStart();

	public int getDomainEnd();
}
