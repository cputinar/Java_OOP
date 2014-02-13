public class DeltaIt implements SeqIt {

    private int num, it, del, temp;
    DeltaIt(Delta s){
        num = s.n; it = s.init; del = s.d;
    }
    
    public boolean hasNext() {
        if(num != 0) return true;
        else return false;
    }
    
    public int next() {
        if(num == 0)
        {
            System.err.println("DeltaIt called past end");
            System.exit(1);
        }
        num--;
        temp = it; //correct value to return
        it = it + del; //update to new value based on del
        return temp;
    }    
    
}