package hackerank;

public class factorial {
    public static int factoria(int n) {
        // Write your code here
            if(n>0)
            {
                return n*factoria(--n);
            }
            return 1;
        }
}
