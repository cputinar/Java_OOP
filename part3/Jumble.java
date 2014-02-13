public class Jumble extends Seq{



    protected int [] val;
    
    public String toString() {
		String string="";
		for (int number : val){
			string = string + number+" " ;
		}
		return "{ "+val.length+" : "+string+"}";
        
	}

    public Jumble(int [] values){
        int i = 0;
        val = new int[values.length];
        
        for (int number : values){
            val[i] = number; i=i+1;
        }
    }
    
    public int min(){
        if (0 == val.length)
            return 0;
        


        else{
            int min = val[0];
            for (int number : val){
                if (number < min)
                    min = number;
                
            } return min;
        }
    }
    
}

