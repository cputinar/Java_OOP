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
	int count = 0;
	int temp = s.next();
	int temp2 = s.next();
	if (temp1 <= temp2)
		count++;
	else
		return count;
	}
}
