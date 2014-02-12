public class JumbleUser {

	public JumbleUser() {
	}

	public static int lengthLongestNDCSS1(Jumble j) {

	JumbleIt jum = new JumbleIt(j);
	int temp = 1;
	int longest = 0;
	int holder1 = 0;
	int holder2 = 0;

	if (jum.hasNext()){
		holder1 = jum.next();
		longest = temp;
	}

	while (jum.hasNext()) {
		holder2 = jum.next();
		if(holder2 >= holder1)
			temp++;
		else {
			if(temp > longest){
				longest = temp;
			}
			
			temp = 1;
		}
		holder1 = holder2;

		}
		return longest;
	}
}
