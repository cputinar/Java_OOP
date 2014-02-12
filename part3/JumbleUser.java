public class JumbleUser implements JumbleIt {
	JumbleIt jseq;
	public static int lengthLongestNDCSS1(Jumble j) {
	int temp = 1;
	int longest = 0;
	int holder1;
	int holder2;
	
	if(jseq.hasNext()) {
		holder1 = jseq.next();
		longest = temp;
	}

	while (jseq.hasNext()) {
		holder2 = jseq.next();
		if( holder2 >= holder1)
			temp++;
		else {
			if(temp > longest)
				longest = temp;
			temp = 1;
		}
		holder1 = holder2;


	return longest;

		}
	}
}
