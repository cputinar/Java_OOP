public class DeltaIt implements SeqIt {

    private int num;
    private int it;
    private int del;
    private int temp;

    DeltaIt(Delta s){
        num = s.n; it = s.init; del = s.d;
    }
    
    public boolean hasNext() {
        if(num == 0) {
            return false;
        }
        else {
         return true;
     }
    }

    
    public int next() {
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