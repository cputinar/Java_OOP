public class JumbleUser {
	//static JumbleIt jseq;
	protected Jumble seq;
	public JumbleUser(Jumble j) {
		seq = j;
	}
	
	public static int lengthLongestNDCSS1(Jumble j) {
	JumbleIt jseq = new JumbleIt(j);
	int temp = 1;
	int longest = 0;
	int holder1 = jseq.next();
	int holder2;
	

	while (jseq.hasNext()) {
		//holder1 = jseq.next();
		longest = temp;
		
		holder2 = jseq.next();
		if( holder2 >= holder1)
			temp++;
		else {
			if(temp > longest)
				longest = temp;
			temp = 1;
		}
		holder1 = holder2;


		//return longest;

		}
		return longest;
	}
}
