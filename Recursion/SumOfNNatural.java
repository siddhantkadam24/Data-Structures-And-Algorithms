public class SumOfNNatural {
    public int sum(int n)
    {
        if(n>0)
        {
            return n+sum(--n);
        }
        return 0;
    }
}
