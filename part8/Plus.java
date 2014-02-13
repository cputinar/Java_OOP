public class Plus{

public static Seq plus(Seq seq1, Seq seq2){
boolean part_A = true;
boolean part_B = true;
boolean part_C = true;
boolean part_D = true;
int cnt = 0;
int val = 0;
int del = 0;
int pos = 0;
int prev = 0;
int init = 0;



SeqIt itr1 = seq1.createSeqIt();
SeqIt itr2 = seq2.createSeqIt();

	while(itr1.hasNext()){
		while(itr2.hasNext()){
		try{
			if(part_A){
		prev = itr1.next() + itr2.next();

		cnt=cnt+1;
		init=prev;
					
		part_A=false;
				}
			else{
		val=itr1.next()+itr2.next();
			if(val == prev && part_C){
				part_C = true;
				}
			else if(val != prev && part_C){
				part_C = false;
				}

			if(part_B){
				del = val - prev;
				part_B = false;
					}

			if(del == val - prev && part_D){
				part_D = true;
				}
			else 
				part_D = false;
					

			cnt = cnt+1;
			prev = val;
				}
			}

			catch(UsingIteratorPastEndException e){
				break;
			}
		}}
		

		if(part_C){
			if(cnt==1){
				return new Constant(cnt, init);
			}
			else {
				return new Constant(cnt, val);
			}
		}

		else if(part_D){
			return new Delta(cnt, init, del);
		}

		else
		{
	Jumble final_result = new Jumble(new int[cnt]);
	itr1 = seq1.createSeqIt();
	itr2 = seq2.createSeqIt();

		while(pos != cnt){
		try {
			final_result.val[pos] = itr1.next() + itr2.next();
			pos = pos + 1;
			}

		catch (UsingIteratorPastEndException e){
			break;
			}

			}
			return final_result;
		}

		
		}
}