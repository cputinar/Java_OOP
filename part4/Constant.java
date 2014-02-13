public class Constant extends Seq{
    protected int n;
    protected int v;

    public String toString() { 
        return "[ "+ Integer.toString(n) + " : " + Integer.toString(v)+" ]";
    }

    public Constant(int num, int value){

        if (num == 0){
            this.n = 0; this.v = 0;
        }
        else{
            this.n = num; this.v = value;
        }
    }
    
    public int min(){
        if (0 == n)
            return 0;
        
        else
            return v;
        
    }
    
}
