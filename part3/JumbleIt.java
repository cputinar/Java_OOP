public class JumbleIt implements SeqIt {
	protected int it;
	public Jumble seq;
	int tempval;
	
	public JumbleIt(Jumble s) {
		seq = s;
		it = 0;
	}
	
	public boolean hasNext() {
		if (it != seq.val.length)
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
			tempval = seq.val[it];
			it++;
		}
		return tempval;
	}
}
