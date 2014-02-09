public class Delta extends Seq{
    public int n,init,d;
    public Delta(int num,int initial,int delta){
        if (num == 0){
            this.n = 0;
            this.init = 0;
            this.d = 0;
        }
        else{
            n = num;
            init = initial;
            d = delta;
        }
    }
    public String toString() { // make it printable for debugging
        return "< "+n+" : " + init + " &"+d+ " >";
        //< num : initial &delta >
    }
    
    public int min(){
        if (0 == n){
            return 0;
        }
        else{
            if (d >= 0){
                return init;
            }
            else{
                return init + (n * d+1);
            }
        }
    }

}