public class ConstantIt implements SeqIt {
	protected int it;
	protected Constant seq;
	public ConstantIt(Constant s) {
		seq = s;
		it = 0;
	}
	
	public boolean hasNext() {
		if (it != seq.n)
			return true;
		else
			return false;
	}

	public int next() throws UsingIteratorPastEndException {
		int tempval = seq.v;
		
		if (hasNext() == false) {
			System.err.println("No next value");
			System.exit(1);
		}
		else {
			it++;
		}
		return tempval;
	}
}
