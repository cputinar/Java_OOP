public class Plus {



	public static Seq plus(Constant con, Delta del){
		int count=0; int position=0; int v;

		if(con.n < del.n)
			count=con.n;
		
		else
			count=del.n;

		v = con.v + del.init; Delta final_result = new Delta(count,v, del.d);
		return final_result;

	}

	public static Seq plus(Delta del, Jumble jum){
		int count=0; int position=0; int v;

		if(del.n < jum.val.length)
			count=del.n;
		
		else
			count=jum.val.length;

		int [] val = new int[count]; Jumble final_result = new Jumble(val);
		SeqIt i=del.createSeqIt();

		while(position != count){
			try{
				v = i.next() + jum.val[position];
				final_result.val[position]=v;
				position=position+1;
			}
			catch(UsingIteratorPastEndException e){
				break;
			}
		} return final_result;

	}


	public static Seq plus(Jumble jum, Delta del){
		int count=0; int position=0; int v;

		if(del.n < jum.val.length)
			count=del.n;

		
		else
			count=jum.val.length;

		int [] val = new int[count]; Jumble final_result = new Jumble(val);
		SeqIt i=del.createSeqIt();

		while(position != count){
			try{
				v = i.next() + jum.val[position];
				final_result.val[position] = v;
				position = position + 1;
			}
			catch(UsingIteratorPastEndException e){
				break;
			}
		}

		return final_result;

	}

	public static Seq plus(Constant con1, Constant con2){
		int count=0;
		int position=0;
		int v;

		if(con1.n < con2.n){
			count=con1.n;
		}
		else
			count=con2.n;

		v=con1.v+con2.v;

		Constant final_result = new Constant(count,v);

		return final_result;

	}

	public static Seq plus(Jumble jum1, Jumble jum2){
		int count=0; int position=0; int v;

		if(jum1.val.length < jum2.val.length)
			count = jum1.val.length;
		
		else
			count = jum2.val.length;

		int [] val = new int[count];
		Jumble final_result = new Jumble(val);

		while(position != count){
			v = jum1.val[position] + jum2.val[position];
			final_result.val[position] = v;
			position=position+1;
		}

		return final_result;
	}

	

	public static Seq plus(Constant con, Jumble jum){
		int count=0; int position=0; int v;

		if(con.n < jum.val.length)
			count=con.n;
		
		else
			count=jum.val.length;
			

		int [] val = new int[count];

		Jumble final_result = new Jumble(val);

		while(position != count){
			v = con.v + jum.val[position];
			final_result.val[position]=v;
			position=position+1;
		}
		return final_result;

	}

	public static Seq plus(Jumble jum, Constant con){
		int count=0; int position=0; int v;

		if(con.n < jum.val.length)
			count=con.n;
		
		else
			count=jum.val.length;

		int [] val = new int[count];
		Jumble final_result = new Jumble(val);

		while(position!=count){
			v=con.v + jum.val[position];
			final_result.val[position] = v;
			position = position+1;
		} return final_result;

	}

		public static Seq plus(Delta del1, Delta del2){
		int count=0; int position=0; int v; int d;

		if(del1.n < del2.n)
			count=del1.n;
		
		else
			count=del2.n;

		v=del1.init+del2.init; d=del1.d+del2.d;

		Delta final_result = new Delta(count, v, d); return final_result;
	}


	
	
}