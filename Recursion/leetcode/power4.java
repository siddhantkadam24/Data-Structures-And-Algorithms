package leetcode;

public class power4 {
    long c = 0;
    public boolean isPowerOfFour(int n) {
        
        if((long)Math.pow(4,c) == n)
        {   
            
            return true;
        }
        else if((long)Math.pow(4,c) < n && (long)Math.pow(4,c) != n){
            c++;
            return isPowerOfFour(n);
        }
        return false;
    }
}
