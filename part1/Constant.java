public class Constant extends Seq{
    protected int n,v;
    public Constant(int num, int value){ 
        if (num != 0){
            this.n = num;
            this.v = value;
           
        } else{
            this.n = 0;
            this.v = 0;
        }
    }
    
    public String toString() { 
        return "[ "+ Integer.toString(n) + " : " + Integer.toString(v)+" ]";
    }
    
    public int min(){
        if (0 != n)
            return v;
           
        
        else
            return 0;
        
    }
    
}