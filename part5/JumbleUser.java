public class JumbleUser {
    
    public static int lengthLongestNDCSS1(Jumble j) {
        JumbleIt jumble = new JumbleIt(j);
        int temp = 0;
        int holder1 = 0;
        int holder2 = 0;
        int longest = 0;
        boolean part_A = true;
        
        if(jumble.hasNext() == false)
            return 0;
        
        while(jumble.hasNext()) {
            try{
            if(part_A) { 
                holder1 = jumble.next(); 
                temp=temp+1; 
                part_A = false;
            }
            else if(holder1 <= (holder2 = jumble.next())){
              holder1 = holder2; 
              temp=temp+1;
            } 
            else { 
                if(temp > longest){
                    longest = temp;
                }
                
                temp = 1; 
                holder1 = holder2; 
            }
        }
        catch(UsingIteratorPastEndException e){

        }
    }
        
        if(temp > longest){ 
            longest = temp;
        }
        
        return longest;
    }

      public static int lengthLongestNDCSS2(Jumble j) {
        JumbleIt jumble = new JumbleIt(j);
        int temp = 0;
        int holder1 = 0;
        int holder2 = 0;
        int longest = 0;
        boolean part_A = true;
        
        if(jumble.hasNext() == false)
            return 0;
        
        while(true) {

            try{
                if(part_A) {
                    holder1 = jumble.next(); 
                    temp=temp+1;
                    part_A = false;
                }
                else if(holder1 <= (holder2 = jumble.next())){
                    holder1 = holder2; 
                    temp++;
                } 
                else { 
                    if(temp > longest)
                        longest = temp;
                
                    temp = 1; 
                    holder1 = holder2; 
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
    
}