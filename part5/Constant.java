public class Constant extends Seq{
    protected int n,v;
    public Constant(int num, int value){//constructor
        if (num == 0){
            this.n = 0;
            this.v = 0;
        }
        else{
            this.n = num;
            this.v = value;
        }
    }
    
    public String toString() { // make it printable for debugging
        return "[ "+ Integer.toString(n) + " : " + Integer.toString(v)+" ]";
    }
    
    public int min(){
        if (0 == n){
            return 0;
        }
        else{
            return v;
        }
    }

    public SeqIt createSeqIt(){
        return new ConstantIt(this);
    }
    
}
