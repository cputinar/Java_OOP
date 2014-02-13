public class Plus {




	public static Seq plus(Delta del1, Delta del2){
		int count=0; int position=0; int v; int d;

		if(del1.n >= del2.n)
			count=del2.n;
		else
			count=del1.n;

		v=del1.init+del2.init;
		d=del1.d+del2.d;
		Delta final_result = new Delta(count, v, d);
		return final_result;
	}
	
	public static Seq plus(Jumble jum1, Jumble jum2){
		int count=0; int position=0; int v;

		if(jum1.val.length >= jum2.val.length)
			count = jum2.val.length;
		
		else
			count = jum1.val.length;
		int [] val = new int[count];
		Jumble final_result = new Jumble(val);

		while(position != count){
			v = jum1.val[position] + jum2.val[position];
			final_result.val[position] = v;
			position=position+1;
		}

		return final_result;
	}


	public static Seq plus(Constant con1, Constant con2){
		int count=0; int position=0; int v;

		if(con1.n >= con2.n)
			count=con2.n;
		else
			count=con1.n;
		v=con1.v+con2.v;
		Constant final_result = new Constant(count,v);
		return final_result;

	}

	

	
}