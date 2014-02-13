public class Plus(){

	public static Seq Plus(Seq s1, Seq s2){
		int count = 0;
		int position = 0;
		int previous = 0;
		int value = 0;
		int delta = 0;
		int initial = 0;

		boolean first = true;
		boolean firstDel = true;
		boolean isConstant = true;
		boolean isDelta = true;

		SeqIt i1 = s1.createSeqIt();
		SeqIt i2 = s2.createSeqIt();

		while(i1.hasNext() && i2.hasNext()){
			try{
				if(first){
					previous = i1.next() + i2.next();
					count=count+1;
					initial=previous;
					first=false;
				}
				else{
					value=i1.next()+i2.next();
					if(value == previous && isConstant){
						isConstant = true;
					}
					else if(value != previous && isConstant){
						isConstant = false;
					}

					if(firstDel){
						delta = value - previous;
						firstDel = false;
					}

					if(delta == value - previous && isDelta){
						isDelta = true;
					}

					else {
						isDelta = false;
					}

					count = count+1;
					previous = value;
				}
			}

			catch(UsingIteratorPastEndException e){
				break;
			}
		}

		if(isConstant){
			if(count==1){
				return new Constant(count, initial);
			}
			else {
				return new Constant(count, value);
			}
		}

		else if(isDelta){
			return new Delta(count, initial, delta);
		}

		else
		{
			Jumble final_result = new Jumble(new int[count]);
			i1 = s1.createSeqIt();
			i2 = s2.createSeqIt();

			while(position != count){
				try {
					final_result.val[position] = i1.next() + i2.next();
					position = position + 1;
				}

				catch (UsingIteratorPastEndException e){
					break;
				}

			}
			return final_result;
		}


	}
}