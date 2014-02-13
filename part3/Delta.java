public class Delta extends Seq{
    public int n; 
    public int init;
    public int d;


    public String toString() { 
        return "< "+n+" : " + init + " &"+d+ " >";
        
    }
    
    public int min(){
        if (n != 0){
            if (d < 0)
                return init + ((n) * d+1);
            else
                return init + ((n) * d+1);
        }
        
        else
            return 0;
            
        
    }


    public Delta(int num,int initial,int delta){
        if (0 != n){
            n = num; init = initial; d = delta;
        }
        else{
            this.n = 0; this.init = 0; this.d = 0;
        }
    }

}
