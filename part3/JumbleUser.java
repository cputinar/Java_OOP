public class JumbleUser {

	public JumbleUser() {
	}

	public static int lengthLongestNDCSS1(Jumble j) {
	int temp = 1;
	int longest = 0;
	int holder1;
	int holder2;

	if (j.hasNext()){
		holder1 = j.next();
		longest = temp;
	}

	while (j.hasNext()) {
		holder2 = j.next();
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
