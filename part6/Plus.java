public class Plus {


	public static Seq plus(Constant con1, Constant con2){
		int count=0;
		int position=0;
		int value;

		if(con1.num >= con2.num){
			count=con2.num;
		}
		else
			count=con1.num;

		value=con1.value+con2.value;

		Constant final_result = new Constant(count,value);

		return final_result;

	}

	public static Seq plus(Delta del1, Delta del2){
		int count=0;
		int position=0;
		int value;
		int delta;

		if(del1.num >= del2.num){
			count=del2.num;
		}

		else
			count=del1.num;

		value=del1.initial+del2.initial;

		delta=del1.delta+del2.delta;

		Delta final_result = new Delta(count, value, delta);

		return final_result;
	}

	public static Seq plus(Jumble jum1, Jumble jum2){
		int count=0;
		int position=0;
		int value;

		if(jum1.values.length >= jum2.values.length){
			count = jum2.values.length;
		}
		else
			count = jum1.values.length;

		int [] values = new int[count];

		Jumble final_result = new Jumble(values);

		while(position != count){
			value = jum1.values[position] + jum2.values[position];
			result.values[position] = value;

			position=position+1;
		}

		return final_result;
	}
}