import java.io.IOException;

public class Positive implements Function{
	private Function f;
	
	public Positive(Function f) {
		this.f=f;
	}

	@Override
	public int getValue(int x) throws IOException {
		int back = f.getValue(x);
		if(back<0) back=0;
		return back;
	}

	@Override
	public int getDomainStart() {	
		return f.getDomainStart();
	}

	@Override
	public int getDomainEnd() {	
		return f.getDomainEnd();
	}
	


}
