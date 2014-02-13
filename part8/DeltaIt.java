public class DeltaIt implements SeqIt {
    private int del;
    private int num;
    private int it;
    private int temp;

    DeltaIt(Delta a){
        num = a.n; 
        it = a.init; 
        del = a.d;
    }
    
    
    public int next() throws UsingIteratorPastEndException {
        if(num == 0)
        {
            System.err.println("DeltaIt called past end");
            System.exit(1);
        }
        num=num-1; temp = it; it = it + del;
        return temp;
    }    


    public boolean hasNext() {
        if(num == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
}