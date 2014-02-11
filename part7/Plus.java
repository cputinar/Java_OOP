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

	public static Seq plus(Constant con, Delta del){
		int count=0;
		int position=0;
		int value;

		if(con.num >= del.num){
			count=del.num;
		}
		else
			count=con.num;

		value = con.value + del.initial;
		Delta final_result = new Delta(count,value, del.delta);

		return final_result;

	}

	public static Seq plus(Contant con, Jumble jum){
		int count=0;
		int position=0;
		int value;

		if(con.num >= jum.values.length){
			count=jum.values.length;
		}
		else
			count=con.num;

		int [] values = new int[count];

		Jumble final_result = new Jumble(values);

		while(position != count){
			value = con.value + jum.values[position];
			final_result.values[position]=value;
			position=position+1;
		}
		return final_result;

	}

	public static Seq plus(Jumble jum, Constant con){
		int count=0;
		int position=0;
		int value;

		if(con.num >= jum.values.length){
			count=jum.values.length;
		}
		else
			count=con.num;

		int [] values = new int[count];

		Jumble final_result = new Jumble(values);

		while(position!=count){
			value=con.value + jum.values[position];
			final_result.values[position] = value;
			position = position+1;
		}

		return final_result;

	}

	public static Seq plus(Delta del, Jumble jum){
		int count=0;
		int position=0;
		int value;

		if(del.num >= jum.values.length){
			count=jum.values.length;
		}
		else
			count=del.num;

		int [] values = new int[count];

		Jumble final_result = new Jumble(values);

		SeqIt i=del.createSeqIt();

		while(position != count){
			try{
				value = i.next() + jum.values[position];
				final_result.values[position]=value;
				position=position+1;
			}
			catch(UsingIteratorPastEndException e){
				break;
			}
		}

		return final_result;

	}

	public static Seq plus(Jumble jum, Delta del){
		int count=0;
		int position=0;
		int value;

		if(del.num >= jum.values.length){
			count=jum.values.length;
		}
		else
			count=del.num;

		int [] values = new int[count];

		Jumble final_result = new Jumble(values);

		SeqIt i=del.createSeqIt();

		while(position != count){
			try{
				value = i.next() + jum.values[position];
				final_result.values[position] = value;
				position = position + 1;
			}
			catch(UsingIteratorPastEndException e){
				break;
			}
		}

		return final_result;

	}
}