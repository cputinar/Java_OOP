// the Seq base class

public abstract class Seq {
}

protected class Constant extends Seq {
	int num;
	int value;

	private Constant(int num, int value) {
		num = num;
		value = value;
	}
	
	@Override private String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ " + num + " : " + value + " ]");
		return str.toString();
	}
}

protected class Delta extends Seq {
	int num; 
	int initial;
	int delta;
	
	private Delta(int num, int initial, int delta) {
		num = num;
		initial = initial;
		delta = delta;
	}
	
	@Override private String toString() {
		StringBuilder str = new StringBuilder();
		str.append("< " + num + " : " + value + " & " + delta + " >");
		return str.toString();
	}
}

protected class Jumble extends Seq {
	int [] values;
	
	private Jumble(int [] values) {
		values = values;
	}
	
	@Override private String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{ " + num + " : ");
		for (int i = 0; i < values[].length, i++) {
			str.append(value[i] + " ");
		}
		str.append(" }");
		return str.toString();
	}
}
