public class DeltaIt implements SeqIt {

    private int num, it, del, temp;
    DeltaIt(Delta s){
        num = s.n; 
        it = s.init; 
        del = s.d;
    }
    
    public boolean hasNext() {
        if(num != 0) {
            return true;
        }
        else { 
            return false;
        }
    }
    
    public int next() throws UsingIteratorPastEndException{
        if(num == 0)
        {
            System.err.println("DeltaIt called past end");
            System.exit(1);
        }
        num=num-1;
        temp = it; 
        it = it + del; 
        return temp;
    }    
    
}