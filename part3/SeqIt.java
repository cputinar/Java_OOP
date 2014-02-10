// the SeqIt base interface

public interface SeqIt {
    // any more elements?
    public boolean hasNext();
    // return the next element and advance iterator to following item.
    public int next();
}

protected class ConstantIt extends SeqIt {
	protected int it;
	public ConstantIt(Constant s) {
		it = 0;
	}
	
	@Override public boolean hasNext() {
		if (it != s.n)
			return true;
		else
			return false;
	}

	@Override public int next() {
		return v;
		if (hasNext() == false) {
			System.err;
			System.exit(1);
		}
		else
			it++;
	}
}

protected class DeltaIt extends SeqIt {
	protected int it;
	public DeltaIt(Delta s) {
		it = 0;
	}
	
	@Override public boolean hasNext() {
		if (it != s.num)
			return true;
		else
			return false;
	}
	
	@Override public int next() {
		if (hasNext() == false) {
			System.err.println("No next value")
			System.exit(1);
		}
		else {
			int temp;
			temp = it * s.d;
			temp = init + temp;
			return temp;
		}
	}
}

protected class JumbleIt extends SeqIt {
	protected int it;
	public JumbleIt(Jumble s) {
		it = 0;
	}
	
	@Override public boolean hasNext() {
		if (it != s.length)
			return true;
		else
			return false;
	}
	
	@Override public int next() {
		if (hasNext() == false() {
			System.err.println("No next value");
			System.exit(1);
		else {
			return s.val[it];
			it++
		}
	}
}

protected class JumbleUser extends JumbleIt {
	public static int lengthLongestNDCSS1(Jumble j) {
	int temp = 1;
	int longest = 0;

	if(j.hasNext) {
		int holder1 = j.next();
		longest = temp;
	}

	while (j.hasNext) {
		int holder2 = j.next();
		if( holder2>= holder1)
			temp++;
		else:
			if(temp > longest)
				longest = temp;
			temp = 1;
		holder1=holder2;


	return longest;

		}
	}
}
