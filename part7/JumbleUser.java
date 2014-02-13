public class JumbleUser {


    public static int lengthLongestNDCSS2(Jumble j) {
        JumbleIt jumble = new JumbleIt(j);
        int temp = 0, holder1 = 0, holder2 = 0, longest = 0;
        boolean first = true;
        
        if(jumble.hasNext() == false)
            return 0;
        
        while(true) {

            try{
                if(first) { 
                    holder1 = jumble.next(); temp++; first = false;
                }
                else if(holder1 <= (holder2 = jumble.next())){
                    holder1 = holder2; temp++;
                } 
                else { 
                    if(temp > longest)
                        longest = temp;
                
                    temp = 1; holder1 = holder2; 
                }
            }
            catch(UsingIteratorPastEndException e) {
                break;
            }
        }
        
        if(temp > longest) //special case when NDCSS is temp of array
            longest = temp;
        
        return longest;
    }
    
    public static int lengthLongestNDCSS1(Jumble j) {
        JumbleIt jumble = new JumbleIt(j);
        int temp = 0, holder1 = 0, holder2 = 0, longest = 0;
        boolean first = true;
        
        if(jumble.hasNext() == false)
            return 0;
        
        while(jumble.hasNext()) {
            try{
            if(first) { 
                holder1 = jumble.next(); temp++; first = false;
            }
            else if(holder1 <= (holder2 = jumble.next())){
              holder1 = holder2; temp++;
            } 
            else { 
                if(temp > longest)
                    longest = temp;
                
                temp = 1; holder1 = holder2; 
            }
        }
        catch(UsingIteratorPastEndException e){

        }
    }
        
        if(temp > longest) //special case when NDCSS is temp of array
            longest = temp;
        
        return longest;
    }

      
    
}