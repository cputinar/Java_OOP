public class ConstantIt implements SeqIt {
    private int it, tempval;
    
    ConstantIt(Constant s) {
        it = s.n; tempval = s.v;
    }
    
    public boolean hasNext() {
        if(it == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public int next() throws UsingIteratorPastEndException {
        if(it == 0)
        {
            System.out.println("ConstantIt called past end");
            System.exit(1);
        }
        it=it-1; return tempval;
    }
}