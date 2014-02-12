public class DeltaIt implements SeqIt {
	protected int it;
	public Delta seq;
	public DeltaIt(Delta s) {
		seq = s;
		it = 0;
	}
	
	public boolean hasNext() {
		if (it != seq.n)
			return true;
		else
			return false;
	}
	
	public int next() {
		if (hasNext() == false) {
			System.err.println("No next value");
			System.exit(1);
		}
		else {
			int temp;
			temp = it * seq.d;
			temp = seq.init + temp;
			return temp;
		}
	}
}
