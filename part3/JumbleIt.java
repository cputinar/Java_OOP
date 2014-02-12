public class JumbleIt implements SeqIt {
	protected int it;
	public Jumble seq;
	public JumbleIt(Jumble s) {
		seq = s;
		it = 0;
	}
	
	public boolean hasNext() {
		if (it != seq.length)
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
			return seq.val[it];
			it++;
		}
	}
}
