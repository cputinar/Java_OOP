// the SeqIt base interface

public interface SeqIt {
    // any more elements?
    public boolean hasNext();
    // return the next element and advance iterator to following item.
    public int next();
}

public class ConstantIt extends SeqIt {
	protected int it;
	public Constant seq;
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

	public int next() {
		return seq.v;
		if (hasNext() == false) {
			System.err.println("No next value");
			System.exit(1);
		}
		else
			it++;
	}
}

public class DeltaIt extends SeqIt {
	protected int it;
	public Delta seq;
	public DeltaIt(Delta s) {
		seq = s;
		it = 0;
	}
	
	public boolean hasNext() {
		if (it != seq.num)
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

public class JumbleIt extends SeqIt {
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
			it++
		}
	}
}

public class JumbleUser extends JumbleIt {
	
	public static int lengthLongestNDCSS1(Jumble j) {
	int temp = 1;
	int longest = 0;

	if(j.hasNext()) {
		int holder1 = j.next();
		longest = temp;
	}

	while (j.hasNext()) {
		int holder2 = j.next();
		if( holder2>= holder1)
			temp++;
		else {
			if(temp > longest)
				longest = temp;
			temp = 1;
		}
		holder1=holder2;


	return longest;

		}
	}
}
