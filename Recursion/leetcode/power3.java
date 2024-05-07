package leetcode;

public class power3 {
    long c = 0;
    public boolean isPowerOfThree(int n) {
        
        if((long)Math.pow(3,c) == n)
        {   
            
            return true;
        }
        else if((long)Math.pow(3,c) < n && (long)Math.pow(3,c) != n){
            c++;
            return isPowerOfThree(n);
        }
        return false;
    }
}
