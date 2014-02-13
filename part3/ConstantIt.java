public class ConstantIt implements SeqIt {
    private int it;
    private int tempval;
    
    ConstantIt(Constant s) {
        it = s.n; tempval = s.v;
    }
    
    public boolean hasNext() {
        if(it != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int next() {
        if(it == 0)
        {
            System.out.println("ConstantIt called past end");
            System.exit(1);
        }
        it=it-1; return tempval;
    }
}