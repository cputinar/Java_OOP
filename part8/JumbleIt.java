public class JumbleIt implements SeqIt {
    
    private Jumble it;
    private int seq, tempval;
    
    JumbleIt(Jumble j){
        it = j;
        seq = 0;
    }   
    
    public boolean hasNext() {
        if(seq == it.val.length) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public int next() throws UsingIteratorPastEndException {
        if(seq == it.val.length) {

            System.out.println("JumbleIt called past end");
            System.exit(1);
        }

        tempval = it.val[seq]; seq=seq+1;
        return tempval;
    }    
    
}