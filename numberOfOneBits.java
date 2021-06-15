public class Solution {
    // you need to treat n as an unsigned value
    /*public int hammingWeight(int n) {
        int count=0;
        while(n!=0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }*/
    
    
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++)
        {
           if(((n>>i)&1)!=0) //set
               count++;
        
        }
        return count;
        
    }
}