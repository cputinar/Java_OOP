public class JumbleUser {

	public JumbleUser() {
	}

	public static int lengthLongestNDCSS1(Jumble j) {

	JumbleIt jum = new JumbleIt(j);
	int temp = 1;
	int longest = 0;
	int holder1 = 0;
	int holder2 = 0;

	//if (jum.hasNext()){
	//	holder1 = jum.next();
	//	longest = temp;
	//}
	if(jum.hasNext()==false){
		return 0;
	}

	while (jum.hasNext()) {
		try{
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
	catch(UsingIteratorPastEndException e){

	}

		}
		return longest;
	}



	public static int lengthLongestNDCSS2(Jumble j) {

	JumbleIt jum = new JumbleIt(j);

	int temp = 1;
	int longest = 0;
	int holder1 = 0;
	int holder2 = 0;

	//if (jum.hasNext()){
	//	holder1 = jum.next();
	//	longest = temp;
	//}
	if(jum.hasNext()==false){
		return 0;
	}

	while (jum.hasNext()) {
		

	try{
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
	catch(UsingIteratorPastEndException e){
		break; 
		}
	}
	
	return longest;
	
		
	}
}