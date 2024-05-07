package leetcode;
public class power2 {
    long c = 0;
    public boolean isPowerOfTwo(int n) {
        
        if((long)Math.pow(3,c) == n)
        {   
            
            return true;
        }
        else if((long)Math.pow(3,c) < n && (long)Math.pow(3,c) != n){
            c++;
            return isPowerOfTwo(n);
        }
        return false;
    }
}
